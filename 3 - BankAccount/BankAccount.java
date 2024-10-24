public class BankAccount {
    final private int id;
    private double number;
    private float balance = 0;
    private Client owner;

    public BankAccount(int id, double number, Client owner) {
        this.id = id;
        this.number = number;
        this.owner = owner;
        owner.addToOwnerAccounts(this);
    }

    public Boolean withdraw(float amount) {
        if (amount > 0) {
            setBalance(getBalance() - amount);
            return true;
        } else {
            return false;
        }
    }

    public Boolean deposit(float amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            return true;
        } else {
            return false;
        }
    }

    public int getId() {
        return this.id;
    }

    public double getNumber() {
        return this.number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }
}
