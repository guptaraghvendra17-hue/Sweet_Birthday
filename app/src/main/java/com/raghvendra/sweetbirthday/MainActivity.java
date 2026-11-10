package com.raghvendra.sweetbirthday;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;

public class MainActivity extends ComponentActivity {

    private WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Configure edge-to-edge styling matching the pastel aesthetic
        configureWindowAppearance();

        webView = new WebView(this);
        setContentView(webView);

        configureWebView();

        // Configure back-button navigation between scenes
        setupBackNavigation();

        // Load the website from local APK assets (100% offline)
        webView.loadUrl("file:///android_asset/index.html");
    }

    private void configureWindowAppearance() {
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(Color.parseColor("#FBA5B8"));
        window.setNavigationBarColor(Color.parseColor("#F07493"));

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            View decor = window.getDecorView();
            int flags = decor.getSystemUiVisibility();
            // Pastel background works best with white/light icons
            flags &= ~View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
            decor.setSystemUiVisibility(flags);
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void configureWebView() {
        WebSettings settings = webView.getSettings();

        // JavaScript and Storage
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);

        // Local asset loading and offline file access
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);

        // Media playback: allow user-initiated sound without browser blocking
        settings.setMediaPlaybackRequiresUserGesture(false);

        // Viewport and Scaling
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);

        // Performance & Cache
        settings.setCacheMode(WebSettings.LOAD_DEFAULT);

        // Visual presentation: seamless blending with page 1 background
        webView.setBackgroundColor(Color.parseColor("#FBA5B8"));
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setOverScrollMode(View.OVER_SCROLL_NEVER);
        webView.setLayerType(View.LAYER_TYPE_HARDWARE, null);

        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }
        });

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url != null && url.startsWith("file:///android_asset/")) {
                    return false;
                }
                return true; // Keep everything inside the offline app
            }
        });
    }

    private void setupBackNavigation() {
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                // Query current active scene in the website
                String script = "(() => {" +
                        "  const p5 = document.getElementById('page-5');" +
                        "  const p4 = document.getElementById('page-4');" +
                        "  const p3 = document.getElementById('page-3');" +
                        "  const p2 = document.getElementById('page-2');" +
                        "  const p1 = document.getElementById('page-1');" +
                        "  if (p5 && !p5.classList.contains('hidden')) {" +
                        "    p5.classList.add('hidden');" +
                        "    if (p4) p4.classList.remove('hidden');" +
                        "    return 'back_to_4';" +
                        "  } else if (p4 && !p4.classList.contains('hidden')) {" +
                        "    p4.classList.add('hidden');" +
                        "    if (p3) p3.classList.remove('hidden');" +
                        "    return 'back_to_3';" +
                        "  } else if (p3 && !p3.classList.contains('hidden')) {" +
                        "    p3.classList.add('hidden');" +
                        "    if (p2) p2.classList.remove('hidden');" +
                        "    return 'back_to_2';" +
                        "  } else if (p2 && !p2.classList.contains('hidden')) {" +
                        "    p2.classList.add('hidden');" +
                        "    if (p1) p1.classList.remove('hidden');" +
                        "    return 'back_to_1';" +
                        "  }" +
                        "  return 'at_start';" +
                        "})();";

                webView.evaluateJavascript(script, result -> {
                    if ("\"at_start\"".equals(result) || result == null) {
                        showExitConfirmation();
                    }
                });
            }
        });
    }

    private void showExitConfirmation() {
        new AlertDialog.Builder(this)
                .setTitle("Exit Celebration? 💖")
                .setMessage("Are you sure you want to close Sweet Birthday app?")
                .setPositiveButton("Exit", (dialog, which) -> finish())
                .setNegativeButton("Stay", (dialog, which) -> dialog.dismiss())
                .show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (webView != null) {
            webView.onResume();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override
    protected void onDestroy() {
        if (webView != null) {
            webView.destroy();
            webView = null;
        }
        super.onDestroy();
    }
}

