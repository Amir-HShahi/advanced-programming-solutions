public class Student extends Person {
    private static Integer studentNoTracker = 402000;
    private final String studentNo;

    public Student(String firstName, String lastName, String address) {
        super(firstName, lastName, address);
        this.studentNo = generateStudentNo();
    } 
    
    private static String generateStudentNo() {
        return (++studentNoTracker).toString();
    }

    public String getStudentNo() {
        return this.studentNo;
    }
}
