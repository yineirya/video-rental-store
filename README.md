# 🎬 Video Rental Store

A Java-based command-line program simulating a simple video rental store system, designed to demonstrate practical applications of object-oriented programming and array-based data structures.

## 📚 Course Context

This project was developed as a final for my **Data Structures and Algorithms** course in **Fall 2023** at Pace University.

## 🔧 Features

- Add customers and videos to the store
- Rent and return videos by barcode
- Display all customers who have rented a specific video
- Enforces a rental limit of 3 videos per customer

## 💡 Technologies Used

- Java
- Arrays and custom classes
- Standard Input/Output (Scanner)

## 🧩 Class Breakdown

- `Customer.java`: Stores customer name and phone number  
- `Video.java`: Represents individual videos by title and barcode  
- `Rental.java`: Manages up to 3 video rentals per customer  
- `VideoStore.java`: Coordinates customer registration, rentals, and inventory  
- `Main.java`: Provides user interaction through a console-based menu system  

## ▶️ How to Run

1. Compile all `.java` files:
   ```bash
   javac *.java
