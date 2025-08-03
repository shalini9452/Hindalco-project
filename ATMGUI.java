import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ATMGUI {

    ATMMachine atm = new ATMMachine();
    JFrame frame;
    JPanel panel;

    public ATMGUI() {
        frame = new JFrame("🏦 Welcome to ATM");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        showPINScreen(); // Start at PIN screen
    }

    // Step 2: PIN Screen
    private void showPINScreen() {
        panel = new JPanel();
        panel.setLayout(null);

        JLabel label = new JLabel("Enter your 4-digit PIN:");
        label.setBounds(100, 30, 200, 30);
        JTextField pinField = new JPasswordField();
        pinField.setBounds(100, 70, 200, 30);

        JButton submitBtn = new JButton("Submit");
        submitBtn.setBounds(150, 120, 100, 30);

        submitBtn.addActionListener(e -> {
            try {
                int pin = Integer.parseInt(pinField.getText());
                if (atm.checkPIN(pin)) {
                    JOptionPane.showMessageDialog(frame, "✅ Access Granted!");
                    showMainMenu(); // Step 4
                } else {
                    JOptionPane.showMessageDialog(frame, "❌ Invalid PIN!");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "⚠️ Please enter a valid number!");
            }
        });

        panel.add(label);
        panel.add(pinField);
        panel.add(submitBtn);

        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    // Step 4: Main Menu
    private void showMainMenu() {
        panel = new JPanel();
        panel.setLayout(null);

        JLabel label = new JLabel("Select a Transaction");
        label.setBounds(120, 20, 200, 30);
        label.setFont(new Font("Arial", Font.BOLD, 16));

        JButton checkBtn = new JButton("💼 Check Balance");
        JButton depositBtn = new JButton("➕ Deposit");
        JButton withdrawBtn = new JButton("➖ Withdraw");
        JButton exitBtn = new JButton("❌ Exit");

        checkBtn.setBounds(100, 60, 180, 30);
        depositBtn.setBounds(100, 100, 180, 30);
        withdrawBtn.setBounds(100, 140, 180, 30);
        exitBtn.setBounds(100, 180, 180, 30);

        checkBtn.addActionListener(e ->
            JOptionPane.showMessageDialog(frame, "Your Balance is ₹" + atm.getBalance())
        );

        depositBtn.addActionListener(e -> showDepositScreen());

        

        withdrawBtn.addActionListener(e -> showWithdrawScreen());

        exitBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Thank you for using our ATM!");
            System.exit(0);
        });

        panel.add(label);
        panel.add(checkBtn);
        panel.add(depositBtn);
        panel.add(withdrawBtn);
        panel.add(exitBtn);

        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    // Step 5: Deposit
    private void showDepositScreen() {
        String input = JOptionPane.showInputDialog(frame, "Enter amount to deposit:");
        if (input != null && !input.isEmpty()) {
            try {
                float amount = Float.parseFloat(input);
                if (amount > 0) {
                    atm.deposit(amount);
                    JOptionPane.showMessageDialog(frame, "✅ Deposited ₹" + amount);
                } else {
                    JOptionPane.showMessageDialog(frame, "⚠️ Amount must be greater than 0.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "⚠️ Invalid number!");
            }
        }
    }

    // Step 5: Withdraw
    private void showWithdrawScreen() {
        String input = JOptionPane.showInputDialog(frame, "Enter amount to withdraw:");
        if (input != null && !input.isEmpty()) {
            try {
                float amount = Float.parseFloat(input);
                if (amount > 0) {
                    if (atm.withdraw(amount)) {
                        JOptionPane.showMessageDialog(frame, "✅ Withdrew ₹" + amount);
                    } else {
                        JOptionPane.showMessageDialog(frame, "❌ Insufficient balance!");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "⚠️ Amount must be greater than 0.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "⚠️ Invalid number!");
            }
        }
    }

    public static void main(String[] args) {
        new ATMGUI();
    }
}
