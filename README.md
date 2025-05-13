# 🥾 TinyTrail

**Live Demo**: [https://polite-stroopwafel-9722ee.netlify.app](https://polite-stroopwafel-9722ee.netlify.app)

TinyTrail is a modern full-stack web application designed to enhance your hiking and trail-planning experience. It offers an intuitive frontend built with React and a robust backend using Spring Boot, enabling features like trail exploration, user routing, and seamless interactions.

---

## 📦 Project Structure

```
TinyTrail-main/
│
├── tinytrail-client/      # React frontend
│   └── src/
│       ├── App.jsx        # Main app logic with dynamic routing
│       └── utils/         # Helper utilities for app rendering
│
└── tinytrail-server/      # Java Spring Boot backend
    └── src/main/java/
        └── com/arghya/tinytrail_server/
            └── TinytrailServerApplication.java  # Main Spring Boot entry point
```

---

## 🚀 Features

- 📍 Explore trails with clean, dynamic routing
- 🔄 Real-time transitions powered by React Router
- 🌐 Backend powered by Java Spring Boot REST APIs
- 🧩 Modular structure for scalability and collaboration

---

## 🛠️ Tech Stack

| Layer        | Technology         |
|--------------|--------------------|
| Frontend     | React, Vite, JavaScript |
| Backend      | Java, Spring Boot |
| Deployment   | Netlify (frontend), Docker-ready backend |

---

## 🧪 Getting Started

### Prerequisites

- Node.js & npm
- Java 17+
- Maven

### Setup Instructions

```bash
# Clone the repository
git clone https://github.com/Arghya-Banerjee/TinyTrail.git
cd TinyTrail-main

# Frontend Setup
cd tinytrail-client
npm install
npm run dev  # Starts Vite dev server

# Backend Setup
cd ../tinytrail-server
./mvnw spring-boot:run  # On Unix
mvnw.cmd spring-boot:run  # On Windows
```

---

## 📷 Screenshots

*(Insert UI screenshots here if available)*

---

## 🤝 Contributing

Feel free to fork the repo and submit pull requests:

```bash
git checkout -b feature/yourFeature
git commit -m "Add your feature"
git push origin feature/yourFeature
```

---

## 📄 License

This project is licensed under the MIT License.

---

## 📬 Contact

For queries or feedback, reach out to [arghya.banerjee.dev@gmail.com](mailto:arghya.banerjee.dev@gmail.com)

---

> Built with ❤️ by Arghya Banerjee
