# Travel and Tourism Management System

### 🧭 Overview

The **Travel and Tourism Management System** is a **Java-based Desktop Application** built using **Swing (JFrame)**. It provides modules for managing user accounts, travel packages, hotel bookings, security verifications, and payments. Developed by **Prabhat Prajapati**, it aims to automate travel-related operations in an intuitive graphical interface.

---

## ⚙️ Key Features

* **User Authentication**

  * Login, Signup, Forget Password modules
  * Security verification (“I’m not a robot” screen)
* **Customer Management**

  * Add, View, Update, and Delete Customer Details
* **Travel & Hotel Management**

  * View, Book, and Check Packages
  * View and Book Hotels
* **Payment Options**

  * UPI, Net Banking, and Card payment interfaces
* **Utility Tools Integration**

  * Launches system Notepad and Calculator directly from the app
* **Informational Sections**

  * About page describing project and advantages

---

## 🏗️ Tech Stack

* **Language:** Java (JDK 8+)
* **Framework:** Swing (AWT + Swing components)
* **Database:** MySQL (used in Login, Signup, ForgetPassword modules)
* **Libraries:** JDBC, AWT, Swing
* **Tools:** NetBeans
* **Operating System:** Windows (optimized for icons & system commands)

---

## 📂 Folder Structure

```
travel-management-system/
│
├── src/travel/management/system/
│   ├── Login.java
│   ├── Dashboard.java
│   ├── ForgetPassword.java
│   ├── Payment.java
│   ├── Security.java
│   ├── About.java
│   ├── AddCustomer.java
│   ├── ViewCustomer.java
│   ├── UpdateCustomer.java
│   ├── DeleteDetails.java
│   ├── CheckPackage.java
│   ├── BookPackage.java
│   ├── ViewPackage.java
│   ├── CheckHotels.java
│   ├── BookHotel.java
│   ├── ViewBookedHotel.java
│   ├── Destinations.java
│   ├── Conn.java (Database Connection Class)
│   └── Loading.java (Loading animation / splash)
│
├── icons/                # PNG / JPEG resources for GUI
├── README.md
└── build/ or bin/        # Compiled .class files
```

---

## 🧰 How to Run the Project

### ✅ Prerequisites

* Install **Java JDK 8 or above**
* Set up **MySQL** and create a database named `travelmanagementsystem`
* Add table `account` with columns: `username`, `name`, `password`, `security`, `answer`
* Configure JDBC connection in `Conn.java`

### ▶️ Steps

1. Clone or download the repository.
2. Open it in any Java IDE.
3. Make sure your `/icons` folder and database are correctly linked.
4. Compile and run:

   ```bash
   javac -d . *.java
   java travel.management.system.Login
   ```
5. Start from the **Login window**, then explore Dashboard and other modules.

---

## 💳 Payment Module (Payment.java)

Includes three payment options:

* **UPI**  → Simulates redirection to UPI payment
* **Net Banking**  → Simulates online banking
* **Card Payment**  → Simulates card transaction process

---

## 💡 About Page

Displays project description, developer details, and system benefits, such as:

* Simplified travel management
* Automated booking and customer record handling
* Reduced manual paperwork
* Instant data retrieval and updates

---

## 🧾 Advantages

* Automation of manual travel processes
* Accurate and up-to-date data management
* Easy customer and booking tracking
* Integration with common utilities (Calculator, Notepad)
* User-friendly GUI with modern icons

---

## 🧑‍💻 Developer

**Name:** Prabhat Prajapati
**Role:** Java Developer (Desktop Application)
**Project Type:** Educational / Practical Desktop Project
**Technology:** Java Swing + JDBC

---

## 🚀 Future Enhancements

* Implement **real payment gateway integration (Razorpay/Paytm)**
* Add **user registration (Signup)** and **admin dashboard**
* Generate **booking receipts** in PDF format
* Add **map integration** and **dynamic travel suggestions**
* Convert project to a **web-based version (Spring Boot + JSP)**

---

**📘 Summary:**
This **Travel and Tourism Management System** is a Java Swing desktop application offering a complete management interface for travel agencies and users. It demonstrates core **OOP concepts, database connectivity, GUI design**, and user interaction — a great project for Java learners and portfolio presentation.
