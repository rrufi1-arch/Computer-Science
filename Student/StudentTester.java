public class StudentTester {
    public static void main(String[] args){
        Student eliteStudent = new Student("Bobbetto", 16, 4.5, true);
        System.out.println(eliteStudent.getName());
        eliteStudent.setAge(17);
        eliteStudent.study(30);
        System.out.println(eliteStudent.getGpa());
    }
}
