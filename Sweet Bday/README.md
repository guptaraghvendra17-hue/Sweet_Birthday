# 🎀 Sweet-Bday — Interactive Birthday Celebration Reel ✨

<p align="center">
  <img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white" alt="HTML5" />
  <img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white" alt="CSS3" />
  <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black" alt="JavaScript" />
  <img src="https://img.shields.io/badge/Performance-60FPS_Silky-ff4d79?style=for-the-badge" alt="60FPS" />
  <img src="https://img.shields.io/badge/Mobile-100%25_Responsive-4cc9f0?style=for-the-badge" alt="Responsive" />
</p>

<p align="center">
  A heartwarming, aesthetic, multi-scene interactive birthday reel built with pure Vanilla JavaScript, CSS3 animations, and love. Designed with a modern pastel aesthetic, tactile 3D interactions, custom audio player, and celebratory fireworks.
</p>

---

## 🌸 What is Sweet-Bday?

**Sweet-Bday** is a virtual, interactive greeting reel crafted to celebrate someone truly special. Rather than sending a static card or video, this web app delivers a cinematic 5-chapter storybook experience where the recipient interacts with cards, blows candles, flips polaroid memories, checks off birthday wishes, and unboxes a 3D celebration gift with fireworks and confetti.

---

## ✨ Interactive Highlights & Features

### 🎵 Scene 1: Welcome & Acoustic Music Player
- **Aesthetic Hero**: Warm calligraphy greeting with split-character popping animations.
- **Washi Tape Polaroid**: Swinging aesthetic cat GIF frame with drop shadows.
- **Custom Audio Player**: Fully functional custom audio player with real-time seek bar, duration tracking, pause/play toggle, and playback controls playing a soft birthday track.

### 🎂 Scene 2: Vintage Cherry Cake & Candle Wish
- **Gingham Checkered Tablecloth**: Distinct pastel pink gingham aesthetic with scalloped lace borders.
- **Joyful Cake Bounce**: Tap or click the cake to trigger cheerful bouncing cheer.
- **Balloon Launch**: Rising pastel balloons that ascend dynamically across the sky.

### 📸 Scene 3: 3D Flip Polaroid Trio
- **3D Card Flips**: Three side-by-side retro polaroid photo frames that flip 180° in 3D on click.
- **Hidden Handwritten Notes**: The reverse side reveals cute aesthetic stationery notes with heartfelt messages, washi tape, and cute stickers.
- **Organic Tilts**: Subtle organic angles that respond dynamically on hover and touch.

### 🎈 Scene 4: Helium Balloons & Birthday Wishes Checklist
- **Quilted Diamond Backdrop**: Elegant quilted scrapbook lattice texture.
- **Balloon Bouquet Stage**: 5 glossy 3D helium balloons with gentle floating bob physics, accompanied by an animated clapping bunny GIF.
- **Interactive Ruled Notepad**: Stationery notebook with spiral binder punch-holes. Recipients can click each birthday wish line to tick them with sparkling badges (`✨` / `💖`).
- **Single-Screen Fit**: Responsive layout engineered with fluid `clamp()` and `vh` units so everything fits cleanly on mobile screens without requiring awkward scrolling.

### 🎁 Scene 5: Grand Finale Unboxing & Aerial Fireworks
- **Interactive 3D Gift Box**: A 3D wrapped ribbon gift box waiting to be tapped.
- **The Big Reveal**: Box lid springs open to reveal a crown, queen tribute card, and a celebration cake GIF.
- **Radiant Aerial Fireworks**: Multi-rocket fireworks show with shockwave rings, crackling starbursts, spiraling metallic streamers, and multi-colored confetti cannons.
- **"Fire Again" Control**: Interactive replay button to launch endless waves of celebration fireworks on demand.

---

## ⚡ Performance & Engineering Details

Built from the ground up without heavy frameworks (zero React, zero Tailwind, zero bloated libraries) for instant load times and buttery smooth animations:

- **Zero Layout Thrashing (Reflow-Free)**: Particle coordinate math is calculated in $O(1)$ time rather than invoking `getBoundingClientRect()`, eliminating frame drops during balloon pops.
- **Batch DOM Injection (`DocumentFragment`)**: Fireworks sparks, confetti flakes, and streamers are batched off-DOM in memory and committed in a single composite paint.
- **GPU Hardware Acceleration**: Heavy transformations leverage `translate3d(..., 0)` and `transform: scale(...)` to delegate animation layers directly to the GPU compositor thread.
- **Fluid Dynamic Scaling**: Elements and navigation buttons fluidly scale using CSS `clamp()` and viewport units (`vw` / `vh`) to look sharp across mobile, tablet, and widescreen desktop monitors.

---

## 🛠️ Tech Stack

- **Markup**: Semantic HTML5 with accessibility labels
- **Styling**: Vanilla CSS3 (Custom Properties, Flexbox, Keyframes, 3D Transforms, `backdrop-filter`)
- **Scripting**: Modern Vanilla JavaScript (ES6+, DOM Events, Web Audio API integration)
- **Assets**: Curated aesthetic GIFs, photography, and audio track

---

## 📂 Project Structure

```
Sweet-Bday/
├── assets/
│   ├── birthday-cat.gif          # Scene 1 framed kitten GIF
│   ├── kawaii-cake.gif           # Scene 2 vintage cherry cake
│   ├── marin-1.jpg               # Scene 3 polaroid photo 1
│   ├── marin-2.jpg               # Scene 3 polaroid photo 2
│   ├── marin-3.jpg               # Scene 3 polaroid photo 3
│   ├── cute-bunny.gif            # Scene 4 cheering bunny GIF
│   ├── celebration-cake.gif      # Scene 5 unboxed celebration cake GIF
│   └── Happy Birthday Song 🎂.mp3 # Custom audio track
├── index.html                    # 5-scene semantic HTML structure
├── style.css                     # Complete design system & keyframe animations
├── script.js                     # Interactive logic, audio controls & particle physics
└── README.md                     # Documentation
```

---

## 🚀 Quick Start / Running Locally

No build tools, bundlers, or package managers required. Simply clone and open:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/guptaraghvendra17-hue/Sweet_Birthday.git
   cd Sweet_Birthday
   ```

2. **Open in browser:**
   - Double-click `index.html`, or
   - Use VS Code Live Server (`Right Click > Open with Live Server`).

3. **Enjoy the celebration!** 🎉

---

## 👤 Developer & Maintainer

Personalized and maintained by **Raghvendra**:

- **GitHub**: [@guptaraghvendra17-hue](https://github.com/guptaraghvendra17-hue)

Feel free to connect, star ⭐ the repo if you like this project!

---

## 💖 Third-Party Credits & License

- Original celebration template and concept inspired by open-source web animations.
- This project is open-source under the [MIT License](LICENSE). Feel free to customize and use it to celebrate birthdays for your loved ones!
