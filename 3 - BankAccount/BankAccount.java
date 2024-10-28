public class BankAccount {
    private static int idTracker = 0;
    final private int id;

    private double accountNumber;

    private float balance = 0;

    private Client owner;

    public BankAccount(double accountNumber, Client owner) {
        this.id = idTracker++;
        setAccountNumber(accountNumber);
        setOwner(owner);
        owner.addToOwnerAccounts(this);
    }

    @Override
    public String toString() {
        String ownerName = " - " + getOwnerName() + "\n";
        String number = "Account number: " + this.accountNumber;

        return ownerName + number;
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
        return this.accountNumber;
    }

    private void setAccountNumber(double accountNumber) {
        if (accountNumber > 0)
            this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return this.balance;
    }

    private void setBalance(float balance) {
        if (balance >= 0)
            this.balance = balance;
    }

    public double getAccountNumber() {
        return this.accountNumber;
    }

    private void setOwner(Client owner) {
        this.owner = owner;
    }

    public String getOwnerName() {
        return owner.getFirstName() + " " + owner.getLastName();
    }
}
