public class Main {
    public static void main(String[] args) {
        Employee sampleEmployee = new Employee("Dennis", "Ritchie", 99, 985, 20);
        Teacher sampleTeacher = new Teacher("Tom", "Bombadil", 49, 485, "Data science");
        Student sampleStudent = new Student("Bernard", "Holland", "Silo 18");
        System.out.println(sampleEmployee + "\n");
        System.out.println(sampleTeacher + "\n");
        System.out.println(sampleStudent);
    }
}
