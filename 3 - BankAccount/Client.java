public class Client {
    private static int idTracker = 0;
    final private int id;

    private String firstName, lastName, phoneNumber;

    private int accountCount = 0;
    private BankAccount[] bankAccounts = new BankAccount[100];

    /**
     * Assign unique id to the object and set object attributes using their setters
     * 
     * @param firstName   the {@code String} to set as the firstName attribute
     * @param lastName    the {@code String} to set as the lastName attribute
     * @param phoneNumber the {@code String} to set as the phoneNumber attribute
     */
    public Client(String firstName, String lastName, String phoneNumber) {
        this.id = idTracker++;
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
    }

    @Override
    public String toString() {
        String name = " - " + this.firstName + " " + this.lastName + "\n";
        String phoneNumber = "Phone: " + this.phoneNumber;

        return name + phoneNumber;
    }

    /**
     * if parameter isn't null and bankAccounts array has space, add parameter to
     * bankAccounts array and increases accountCount by one.
     * 
     * @param newAccount the {@code BankAccount} to add client's bankAccounts array
     */
    public void addToOwnerAccounts(BankAccount newAccount) {
        if ((accountCount < 100) && (newAccount != null)) {
            bankAccounts[accountCount] = newAccount;
            accountCount++;
        }
    }

    /**
     * @return the unique {@code integer} value of {@code id} attribute of this {@code Client} object
     */
    public int getId() {
        return this.id;
    }

    /**
     * @return the {@code String} value of {@code firstName} attribute of this {@code Client} object
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * if parameter isn't null and contains something else than whitespace, set to
     * the {@code firstName} attribute
     * 
     * @param firstName the {@code String} to set to the {@code firstName} attribute
     */
    public void setFirstName(String firstName) {
        if ((firstName != null) && (!firstName.isBlank()))
            this.firstName = firstName;
    }

    /**
     * @return the {@code String} value of {@code lastName} attribute of this {@code Client} object
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * if parameter isn't null and contains something else than whitespace, set to
     * the {@code lastName} attribute
     * 
     * @param lastName the {@code String} to set to the {@code lastName} attribute
     */
    public void setLastName(String lastName) {
        if ((lastName != null) && (!lastName.isBlank()))
            this.lastName = lastName;
    }

    /**
     * @return the {@code String} value of {@code phoneNumber} attribute of this {@code Client} object
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * if parameter isn't null and length is equal to 11(phone number digits count)
     * and starts with '09' (as phone number should),
     * sets to the {@code phoneNumber} attribute
     * 
     * @param phoneNumber the {@code String} to set to the {@code phoneNumber}
     *                    attribute
     */
    public void setPhoneNumber(String phoneNumber) {
        if ((phoneNumber != null) && (phoneNumber.length() == 11) && (phoneNumber.startsWith("09")))
            this.phoneNumber = phoneNumber;
    }
}
