# 🎀 Sweet Bday — Interactive Birthday Celebration & Android App ✨

<p align="center">
  <img src="https://img.shields.io/badge/Platform-Web%20%7C%20Android-FF69B4?style=for-the-badge&logo=android&logoColor=white" alt="Platform" />
  <img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white" alt="HTML5" />
  <img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white" alt="CSS3" />
  <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black" alt="JavaScript" />
  <img src="https://img.shields.io/badge/Performance-60FPS_Silky-ff4d79?style=for-the-badge" alt="60FPS" />
  <img src="https://img.shields.io/badge/Offline-100%25_Standalone-4cc9f0?style=for-the-badge" alt="Offline" />
</p>

<p align="center">
  A heartwarming, aesthetic, multi-scene interactive birthday celebration experience built with pure Vanilla JavaScript, CSS3 3D animations, and love — personalized and maintained by <b>Raghvendra</b> ❤️.
</p>

Available both as a **responsive interactive web reel** and as a **standalone, 100% offline Android Application (APK)**.

---

## 📱 Standalone Android App (APK)

<p align="center">
  <a href="https://github.com/guptaraghvendra17-hue/Sweet_Birthday/raw/main/Sweet_Birthday.apk">
    <img src="https://img.shields.io/badge/⬇️_CLICK_HERE_TO_DOWNLOAD-Sweet__Birthday.apk_(5.9_MB)-FF1493?style=for-the-badge&logo=android&logoColor=white" alt="Download APK" />
  </a>
</p>

### 🔗 Direct Download Links:
- 🚀 **[Direct Download Link (Instant 1-Click)](https://github.com/guptaraghvendra17-hue/Sweet_Birthday/raw/main/Sweet_Birthday.apk)**
- 🌐 **[Alternative Mirror Link (Raw CDN)](https://raw.githubusercontent.com/guptaraghvendra17-hue/Sweet_Birthday/main/Sweet_Birthday.apk)**
- 🏷️ **[Releases & Tags (v1.0)](https://github.com/guptaraghvendra17-hue/Sweet_Birthday/releases/tag/v1.0)**

- **App Name**: `Sweet Birthday ❤️`
- **Package**: `com.raghvendra.sweetbirthday`
- **100% Offline**: Bundles all HTML, CSS, JavaScript, GIFs, images, audio, and offline WOFF2 fonts inside the APK.
- **Custom Back-Button Navigation**: Steps backward scene-by-scene (`Scene 5 ➔ 4 ➔ 3 ➔ 2 ➔ 1`) with an exit confirmation dialog.

---

### 📲 How to Install & Troubleshoot on Android:

> [!IMPORTANT]
> **If opening from WhatsApp, Instagram, or LinkedIn:**  
> In-app browsers often block `.apk` downloads. Tap the **3 dots (⋮)** in the top right corner and select **"Open in Chrome"** or **"Open in external browser"**.

1. **Tap the Download Button above**:
   - The file `Sweet_Birthday.apk` (5.90 MB) will begin downloading.
2. **If prompted "File might be harmful"**:
   - Tap **"Download anyway"** *(this is standard Android security for any app downloaded outside the Google Play Store)*.
3. **Open & Install**:
   - Tap the completed download notification or open your phone's **Files / Downloads** app.
   - Tap **`Sweet_Birthday.apk`**.
   - If prompted *"For your security, your phone is not allowed to install unknown apps"*, tap **Settings** ➔ toggle **"Allow from this source"** ➔ tap **Install**.
4. **Enjoy the Celebration**:
   - Tap **Open** and enjoy the app anytime, completely offline!

---

## ✨ Interactive Highlights (The 5 Scenes)

1. **🎵 Scene 1: Acoustic Welcome & Music Player**
   - Soft pastel pink hero greeting with split-character popping animations.
   - Aesthetic framed kitten polaroid with drop shadow.
   - Fully functional custom audio player playing the birthday song with real-time seek bar and play/pause controls.

2. **🎂 Scene 2: Vintage Cherry Cake & Candle Wish**
   - Retro pastel pink gingham tablecloth with scalloped lace borders.
   - Interactive cake: tap to trigger joyful cheering bounce physics.
   - Ascending helium balloon launch across the sky.

3. **📸 Scene 3: Sweet Moments & 3D Polaroids**
   - Letter-by-letter animated typography reveal for **PRINCESS**.
   - 3 side-by-side retro Polaroid photo cards that flip 180° in 3D on click/touch.
   - Reverse side reveals sweet aesthetic stationery notes with washi tape accents.

4. **🎈 Scene 4: Helium Balloons & Birthday Wishes Checklist**
   - 5 glossy 3D helium balloons with gentle floating bob physics and cheering bunny mascot.
   - Interactive ruled stationery notebook with spiral binder holes.
   - Tap each wish to tick it off with sparkling badges (`✨` / `💖`).

5. **🎁 Scene 5: Grand Finale Unboxing & Aerial Fireworks**
   - Interactive 3D wrapped ribbon gift box.
   - Box lid springs open to reveal the floating crown, celebration cake, and the **Queen of the Day Trophy Card** featuring Princess and the personal signature:
     > *"Made with love by Raghvendra ❤️"*
   - Multi-rocket aerial fireworks show with shockwave rings, crackling starbursts, streamers, and confetti cannons.
   - **"Fire Again!"** button to launch endless celebration fireworks on demand.

---

## 🛠️ Tech Stack & Architecture

- **Web Core**: Semantic HTML5, Vanilla CSS3 (3D Transforms, Custom Properties, Keyframe Animations), Modern Vanilla JavaScript (ES6+).
- **Zero Framework Overhead**: Zero React, zero Tailwind, zero external runtime libraries for instant load times and silky 60 FPS performance.
- **Offline Typography**: Bundled local WOFF2 font files for *Caveat*, *Playfair Display*, and *Quicksand*.
- **Android Native**: Android Gradle Plugin (AGP), Android SDK 36, Android WebView with hardware acceleration, `ComponentActivity`, and v2 APK release signing.

---

## 📂 Project Structure

```
Sweet_Birthday/
├── Sweet_Birthday.apk              # Pre-built standalone Android APK (5.90 MB)
├── Sweet Bday/                     # Complete web application
│   ├── assets/                     # Media assets (GIFs, images, acoustic track)
│   ├── index.html                  # 5-scene semantic HTML structure
│   ├── style.css                   # Coquette design system & 3D transforms
│   ├── script.js                   # Audio engine, particle physics & scene controls
│   └── README.md
├── app/                            # Complete Android Studio project
│   ├── src/main/assets/            # Bundled offline assets & fonts
│   ├── src/main/java/              # Native Android MainActivity.java
│   ├── src/main/res/               # Vector icons, splash screen & themes
│   ├── src/main/AndroidManifest.xml
│   ├── build.gradle.kts
│   └── release.keystore
├── build.gradle.kts                # Root Gradle configuration
├── settings.gradle.kts             # Gradle project settings
└── README.md                       # Documentation
```

---

## 🚀 How to Run Locally

### Web
1. Open [`Sweet Bday/index.html`](Sweet%20Bday/index.html) directly in any browser (Chrome, Firefox, Safari, Edge).
2. Or run a local server:
   ```bash
   npx serve .
   ```

### Android Build from Source
```bash
# Build Debug APK
./gradlew assembleDebug

# Build Signed Release APK
./gradlew assembleRelease
```

---

## 💖 Credits & Attributions

- **Inspiration**: Original web celebration template concept and visual styling inspired by open-source creative web design projects.
- **License**: Released under the open-source [MIT License](LICENSE).
- **Personalized & Maintained by**: **Raghvendra** ([@guptaraghvendra17-hue](https://github.com/guptaraghvendra17-hue))
