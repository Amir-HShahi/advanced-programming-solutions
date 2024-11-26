public abstract class Staff extends Person {
    private static Integer staffNoTracker = 66600;
    private final String staffNo;
    private int salary = 0;

    protected Staff(String firstName, String lastName, int zipCode, int salary) {
        super(firstName, lastName, zipCode);
        this.staffNo = generateStaffNo();
        setSalary(salary);
    }

    private static String generateStaffNo() {
        return (++staffNoTracker).toString();
    }

    public String getStaffNo() {
        return this.staffNo;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        if (salary > 0)
            this.salary = salary;
    }
}
