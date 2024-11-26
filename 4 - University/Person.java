public abstract class Person {
    private static int idTracker = 1000;
    private final int id;
    private String firstName, lastName;
    private String address;
    private int zipCode;

    protected Person(String firstName, String lastName, String address) {
        this.id = generateID();
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
    }

    protected Person(String firstName, String lastName, int zipCode) {
        this.id = generateID();
        setFirstName(firstName);
        setLastName(lastName);
        setZipCode(zipCode);
    }

    private static int generateID() {
        return ++idTracker;
    }

    protected int getID() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public abstract String toString();
}