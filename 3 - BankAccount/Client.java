public class Client {
    private static int idTracker = 0;
    final private int id;

    private String firstName, lastName, phoneNumber;

    private int accountCount = 0;
    private BankAccount[] bankAccounts = new BankAccount[100];

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

    public void addToOwnerAccounts(BankAccount newAccount) {
        if ((accountCount < 100) && (newAccount != null)) {
            bankAccounts[accountCount] = newAccount;
            accountCount++;
        }
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        if ((firstName != null) && (!firstName.isBlank()))
            this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        if ((lastName != null) && (!lastName.isBlank()))
            this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if ((phoneNumber != null) && (phoneNumber.length() == 11) && (phoneNumber.startsWith("09")))
            this.phoneNumber = phoneNumber;
    }
}
