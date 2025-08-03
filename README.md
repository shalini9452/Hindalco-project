
# 💳 ATM Machine Simulator (Java Swing)

This project simulates a simple **ATM Machine** using **Java Swing GUI**. It allows users to perform basic banking operations like entering PIN, checking balance, depositing money, and withdrawing cash in a graphical interface.

---

## 🚀 Features

- ✅ Secure PIN authentication  
- 💼 Balance inquiry  
- ➕ Deposit functionality  
- ➖ Withdraw with balance check  
- ❌ Exit with confirmation  
- User-friendly interface with **Java Swing**

---

## 🧠 Project Structure

```
ATMProject/
├── ATMMachine.java     # Core ATM logic
├── ATMGUI.java         # Graphical User Interface using Swing
└── README.md           # Project documentation
```

---

## 🛠️ Technologies Used

| Technology  | Purpose                    |
|-------------|----------------------------|
| Java        | Core programming language  |
| Java Swing  | GUI interface development  |
| OOP         | Class-based design         |

---

## 🎯 How It Works

1. User starts the application.
2. Enters 4-digit PIN (default is **1234**).
3. On correct PIN:
   - Access the main menu.
   - Choose to Check Balance, Deposit, Withdraw, or Exit.
4. Error messages and confirmations are shown using `JOptionPane`.

---

## 🧾 Code Overview

### `ATMMachine.java`
Handles:
- PIN verification
- Balance tracking
- Deposit and withdrawal methods

### `ATMGUI.java`
Manages:
- GUI components (`JFrame`, `JPanel`, `JButton`, etc.)
- Event handling
- Switching between screens

---

## ✅ How to Run

1. **Ensure Java is installed**  
   You can check with:
   ```bash
   java -version
   ```

2. **Compile the Java files:**
   ```bash
   javac ATMMachine.java ATMGUI.java
   ```

3. **Run the application:**
   ```bash
   java ATMGUI
   ```

---

## 📸 Screenshots (Optional)

> You can include screenshots here of:
> - PIN Screen
> - Main Menu
> - Deposit/Withdraw dialogs

---

## 📌 Future Improvements

- Add support for multiple user accounts
- Track transaction history
- Use databases instead of in-memory storage
- Improve UI using modern libraries (JavaFX or others)

---

## 📃 License

This project is for educational purposes only. You are free to use or modify it for your learning or internship presentation.

---

## 🙋‍♀️ Author

**Shalini Singh**  
Intern @ Hindalco | Java Enthusiast
