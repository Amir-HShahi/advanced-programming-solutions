public class Employee extends Staff {
    private int workTime = 0;

    public Employee(String firstName, String lastName, int zipCode, int salary, int workTime) {
        super(firstName, lastName, zipCode, salary);
        setWorkTime(workTime);
    }

    public int getWorkTime() {
        return this.workTime;
    }

    public void setWorkTime(int workTime) {
        if (workTime >= 0)
            this.workTime = workTime;
    }

    @Override
    public String toString() {
        return "Student:\n" +
                "ID: " + getID() + "\n" +
                "Name: " + getFirstName() + " " + getLastName() + "\n" +
                "Zip code: " + getZipCode() + "\n" +
                "StaffNo: " + getStaffNo() + "\n" +
                "Work time: " + getWorkTime() + "\n" +
                "Salary: " + getSalary();
    }
}
