Hotel Management System

This is a Java-based Hotel Management System with a full GUI built using Java Swing. It includes modules for managing employees, customers, rooms, departments, drivers, and more.

Key Features

- Employee and customer registration
- Room booking and check-out system
- Room search and updates
- Admin dashboard and login system
- Driver and department management
- Pickup and reception services

Technologies Used

- Java Swing – GUI Development
- AWT & Event Handling – User interactions
- JDBC – Database connectivity
- MySQL – Backend database (can be adapted)

How to Run

1. Open the project in NetBeans, Eclipse, or any Java IDE.
2. Create a MySQL database with the required tables:
   - employee, room, driver, customer, etc.
3. Update database credentials inside conn.java
   Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "yourpassword");
