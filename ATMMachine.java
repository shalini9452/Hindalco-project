public class ATMMachine {
    private final int correctPIN = 1234;
    private float balance = 1000;

    public boolean checkPIN(int inputPIN) {
        return inputPIN == correctPIN;
    }

    public float getBalance() {
        return balance;
    }

    public void deposit(float amount) {
        balance += amount;
    }

    public boolean withdraw(float amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
