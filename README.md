# 💹 Investment Management System (IMS)

<p align="center">
  <img src="https://img.shields.io/badge/Platform-Android%20%7C%20Desktop-green?style=for-the-badge&logo=android" alt="Platform">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk" alt="Language">
  <img src="https://img.shields.io/badge/UI%20Framework-JavaFX-blue?style=for-the-badge" alt="UI Framework">
  <img src="https://img.shields.io/badge/Database-MySQL-blue?style=for-the-badge&logo=mysql" alt="Database">
  <img src="https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge" alt="License">
</p>

**The Ultimate AI-Powered Smart Investment Ecosystem.**  
Empowering investors with real-time tracking, profit calculation, and seamless database integration.

---

## 📖 Overview

The **Investment Management System (IMS)** is a robust JavaFX application designed to help users manage their financial investments with ease. Whether you are tracking savings, calculating potential returns, or managing multiple portfolios, IMS provides a clean and intuitive interface for all your financial needs.

Originally developed as part of a database systems project, this application showcases the integration of modern UI components with reliable MySQL persistence.

## ✨ Key Features

- **👤 User Registration**: Securely register users with name and registration numbers.
- **💰 Investment Tracking**: Deposit and withdraw funds with real-time balance updates.
- **📈 Profit Calculator**: Simulate and calculate potential profits based on percentage growth.
- **🗄️ Database Persistence**: All data is stored securely in a MySQL database for long-term tracking.
- **🎨 Modern UI**: Built with JavaFX and JFoenix for a responsive and professional look.

## 🛠️ Tech Stack

- **Language:** Java 22 (OpenJDK)
- **Framework:** JavaFX 22
- **Build Tool:** Maven
- **Database:** MySQL
- **Library:** JFoenix (Material Design components)

---

## 📂 Project Structure

```text
Investment-Management-System/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/softece/ims/
│   │   │       ├── DatabaseConnector.java  # JDBC Connection logic
│   │   │       ├── DatabaseQuery.java      # CRUD operations
│   │   │       ├── Investment.java         # Investment Model
│   │   │       ├── Main.java               # Application Entry Point
│   │   │       ├── MainController.java     # UI Logic & Event Handling
│   │   │       ├── ProfitCalculator.java   # Business Logic
│   │   │       └── User.java               # User Model
│   │   └── resources/
│   │       └── com/softece/ims/
│   │           └── main.fxml               # UI Layout (FXML)
├── pom.xml                                 # Maven dependencies
└── mvnw                                    # Maven wrapper
```

---

## 🚀 Getting Started

### Prerequisites

- **Java Development Kit (JDK) 22** or higher.
- **MySQL Server** running locally.
- **Maven** (optional, wrapper included).

### Database Setup

1. Open your MySQL terminal or Workbench.
2. Create the database:
   ```sql
   CREATE DATABASE InversmentManagementSystem;
   ```
3. Create the `users` table:
   ```sql
   USE InversmentManagementSystem;
   CREATE TABLE registration (
       id INT AUTO_INCREMENT PRIMARY KEY,
       regNumber INT NOT NULL,
       name VARCHAR(255) NOT NULL
   );
   ```

### Installation & Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/fuadk/Database-System.git
   cd Database-System/Investment-Management-System
   ```

2. **Configure Database**:
   Update `DatabaseConnector.java` with your MySQL username and password if different from default:
   ```java
   private static final String ADMIN = "root";
   private static final String PASSWORD = "";
   ```

3. **Run the application**:
   ```bash
   ./mvnw clean javafx:run
   ```

---

## 📄 License

Distributed under the MIT License. See `LICENSE` for more information.

<p align="center">
  Developed with ❤️ by <b>Team Softece</b><br>
  <i>Database System | Green University of Bangladesh</i>
</p>
