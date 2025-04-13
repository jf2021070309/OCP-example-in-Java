# OCP-example-in-Java
Name: Jaime Elias Flores Quispe

🧾 Brief code explanation 
This project shows the Open/Closed Principle (OCP) from the SOLID principles.

A Discount interface defines a general rule for discounts.

Each class (FixedDiscount, PercentageDiscount, LoyaltyDiscount, BirthdayDiscount) adds a different discount strategy.

The Store class uses the interface to apply any discount type.

In the Main class, we run examples showing the result of each discount.

📌 Key idea: We can add new discount types by creating new classes — without changing the existing code. That’s how we follow OCP.
