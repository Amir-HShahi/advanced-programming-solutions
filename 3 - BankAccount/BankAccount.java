public class BankAccount {
    private static int idTracker = 0;
    final private int id;

    private double accountNumber;

    private float balance = 0;

    private Client owner;

    /**
     * Assign unique id to the object and set object attributes using their setters.
     * <p>
     * Finally add {@code this} object to the owner {@code Client} object
     * bankAccounts array
     * 
     * @param accountNumber the {@code double} to set to the {@code accountNumber}
     *                      attribute
     * @param owner         the {@code Client} to set to the {@code owner} attribute
     */
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

    /**
     * if the {@code amount} value is positive and less or equal than
     * {@code balance} value, subtracts from the {@code balance} value
     * 
     * @param amount the {@code float} to subtract from balance
     * @return {@code true} if withdrew successfully, otherwise {@code false}
     */
    public Boolean withdraw(float amount) {
        if ((amount > 0) && (getBalance() >= amount)) {
            setBalance(getBalance() - amount);
            return true;
        } else {
            return false;
        }
    }

    /**
     * if the {@code amount} value is positive, adds to the {@code balance} value
     * 
     * @param amount the {@code float} to add to the {@code balance}
     * @return {@code true} if deposited successfully, otherwise {@code false}
     */
    public Boolean deposit(float amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return the unique {@code integer} value of {@code id} attribute of this
     *         {@code Client} object
     */
    public int getId() {
        return this.id;
    }

    /**
     * @return the {@code double} value of {@code accountNumber} attribute of this
     *         {@code BankAccount} object
     */
    public double getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * if the argument value is positive, it will be assigned to
     * {@code accountNumber}
     * attribute
     * 
     * @param accountNumber the {@code double} value to set to the
     *                      {@code accountNumber} attribute
     */
    private void setAccountNumber(double accountNumber) {
        if (accountNumber > 0)
            this.accountNumber = accountNumber;
    }

    /**
     * @return the {@code float} value of {@code balance} attribute of this
     *         {@code BankAccount} object
     */
    public float getBalance() {
        return this.balance;
    }

    /**
     * if the argument value is positive, it will be assigned to {@code balance}
     * attribute
     * 
     * @param the {@code float} value to set to the
     *            {@code balance} attribute
     */
    private void setBalance(float balance) {
        if (balance >= 0)
            this.balance = balance;
    }

    /**
     * @param owner the {@code Client} object to set to the {@code owner} attribute
     */
    private void setOwner(Client owner) {
        this.owner = owner;
    }

    /**
     * @return the {@code Client} object of {@code owner} attribute
     */
    public String getOwnerName() {
        return owner.getFirstName() + " " + owner.getLastName();
    }
}
