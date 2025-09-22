public class StudentTester {
    public static void main(String[] args) {
        Student student1 = new Student("bob", 11);
        Student student2 = new Student("jonas", 9);
        Student student3 = new Student("karly");
        Student student4 = new Student("sigma");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
        student1.generateId();
        student1.setGrade(student1.getGrade() + 1);
        student2.setGrade(student2.getGrade() + 1);
        student3.setGrade(student3.getGrade() + 1);
        student4.setGrade(student4.getGrade() + 1);
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
        System.out.println(student1.equals(student4));
    }
}