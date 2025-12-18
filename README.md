# Photography Studio

A full-stack web application for a photography studio, featuring a responsive frontend and a Spring Boot backend for managing gallery images, testimonials, and contact forms.

## 📋 Table of Contents
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [API Endpoints](#api-endpoints)
- [Screenshots](#screenshots)
- [Video Demo](#video-demo)
- [Contributing](#contributing)
- [License](#license)

## ✨ Features

- **Responsive Design**: Modern, mobile-friendly website design
- **Gallery Management**: Display and manage photography portfolio
- **Testimonials**: Customer reviews and feedback section
- **Contact Form**: Easy way for clients to get in touch
- **Backend API**: RESTful API built with Spring Boot
- **Database Integration**: H2 in-memory database for data persistence
- **CORS Support**: Cross-origin resource sharing enabled

## 🛠 Tech Stack

### Frontend
- HTML5
- CSS3
- JavaScript (ES6+)

### Backend
- Java 17
- Spring Boot 3.2.0
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok

### Build Tool
- Maven

## 📋 Prerequisites

- Java 17 or higher
- Maven 3.6+
- Git

## 🚀 Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/Prachipatil1401/Prachi-s-Photography-Studio.git
   cd Prachi-s-Photography-Studio
   ```

2. **Build the project**
   ```bash
   mvn clean install
   ```

3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the application**
   - Frontend: http://localhost:8080
   - H2 Console: http://localhost:8080/h2-console (JDBC URL: jdbc:h2:mem:testdb)

## 📖 Usage

1. **Frontend**: Navigate to http://localhost:8080 to view the photography studio website
2. **Gallery**: Browse through the portfolio images
3. **Contact**: Use the contact form to send inquiries
4. **Backend**: API endpoints are available for managing data

## 📁 Project Structure

```
photographystudio/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/capturer/backend/
│   │   │       ├── CaptureBackendApplication.java
│   │   │       ├── controller/
│   │   │       │   ├── ContactController.java
│   │   │       │   ├── CorsConfig.java
│   │   │       │   ├── HomeController.java
│   │   │       │   └── MainController.java
│   │   │       ├── model/
│   │   │       │   ├── Contact.java
│   │   │       │   ├── GalleryImage.java
│   │   │       │   └── Testimonial.java
│   │   │       └── repository/
│   │   │           ├── ContactRepository.java
│   │   │           ├── GalleryImageRepository.java
│   │   │           └── TestimonialRepository.java
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── index.html
│   │       │   ├── main.js
│   │       │   ├── styles.css
│   │       │   └── assets/
│   │       └── application.properties
│   └── test/
├── Scree/
│   └── Screenshots/
│       ├── Screenshot 2025-12-18 222557.png
│       ├── Screenshot 2025-12-18 222606.png
│       ├── Screenshot 2025-12-18 222628.png
│       ├── Screenshot 2025-12-18 222638.png
│       ├── Screenshot 2025-12-18 222647.png
│       ├── Screenshot 2025-12-18 222700.png
│       ├── Screenshot 2025-12-18 222711.png
│       ├── Screenshot 2025-12-18 222722.png
│       ├── Screenshot 2025-12-18 222739.png
│       └── Video.mp4
├── pom.xml
├── README.md
└── .gitignore
```

## 🔗 API Endpoints

### Gallery Images
- `GET /api/gallery` - Get all gallery images
- `POST /api/gallery` - Add new gallery image
- `GET /api/gallery/{id}` - Get gallery image by ID
- `PUT /api/gallery/{id}` - Update gallery image
- `DELETE /api/gallery/{id}` - Delete gallery image

### Testimonials
- `GET /api/testimonials` - Get all testimonials
- `POST /api/testimonials` - Add new testimonial
- `GET /api/testimonials/{id}` - Get testimonial by ID
- `PUT /api/testimonials/{id}` - Update testimonial
- `DELETE /api/testimonials/{id}` - Delete testimonial

### Contact
- `GET /api/contact` - Get all contact messages
- `POST /api/contact` - Submit contact form
- `GET /api/contact/{id}` - Get contact message by ID
- `DELETE /api/contact/{id}` - Delete contact message

## 📸 Screenshots

### Homepage
![Homepage Screenshot](Scree/Screenshots/Screenshot%202025-12-18%20222557.png)

### Gallery Section
![Gallery Screenshot](Scree/Screenshots/Screenshot%202025-12-18%20222606.png)

### Services Section
![Services Screenshot](Scree/Screenshots/Screenshot%202025-12-18%20222628.png)

### About Section
![About Screenshot](Scree/Screenshots/Screenshot%202025-12-18%20222638.png)

### Portfolio Section
![Portfolio Screenshot](Scree/Screenshots/Screenshot%202025-12-18%20222647.png)

### Testimonials Section
![Testimonials Screenshot](Scree/Screenshots/Screenshot%202025-12-18%20222700.png)

### Contact Section
![Contact Screenshot](Scree/Screenshots/Screenshot%202025-12-18%20222711.png)

### Footer
![Footer Screenshot](Scree/Screenshots/Screenshot%202025-12-18%20222722.png)

### Additional View
![Additional Screenshot](Scree/Screenshots/Screenshot%202025-12-18%20222739.png)

## 🎥 Video Demo

Watch the full demo of the Photography Studio application:

[Video Demo](Scree/Screenshots/Video.mp4)

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

**Note**: This project is a demonstration of a full-stack photography studio website. For production use, consider implementing proper security measures, user authentication, and a production-grade database.
