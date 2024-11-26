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
}
