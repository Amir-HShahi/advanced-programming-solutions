public class Teacher extends Staff {
    private String faculty;

    public Teacher(String firstName, String lastName, int zipCode, int salary, String faculty) {
        super(firstName, lastName, zipCode, salary);
        setFaculty(faculty);
    }

    public String getFaculty() {
        return this.faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
