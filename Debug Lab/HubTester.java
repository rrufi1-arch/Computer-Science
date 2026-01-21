public class HubTester {
    public static void main(String[] args) {

        try {
            Student student1 = new Student(null, "12347894323243476", "bob@gmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("#1 triggered");
        }

        try {
            Student student1 = new Student("", "12347894323243476", "bob@gmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("#2 triggered");
        }

        try {
            Student student1 = new Student("bob", null, "bob@gmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("#3 triggered");
        }

        try {
            Student student1 = new Student("bob", null, "bob@gmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("#4 triggered");
        }

        try {
            Student student1 = new Student("bob", "12347894323243476", "");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("#5 triggered");
        }

        try {
            Student student1 = new Student("bob", "12347894323243476", null);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("#6 triggered");
        }

        try {
            Student student1 = new Student("bob", "12347894323243476", "bob@gmail");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("#7 triggered");
        }

        try {
            Student student1 = new Student("bob", "12347894323243476", "bob.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("#8 triggered");
        }

        try {
            Student student1 = new Student("bob@", "12347894323243476", "bob@gmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("#9 triggered");
        }

        try {
            Student student1 = new Student("bob", "1234789432333243476", "bob@gmail.com");
            Student student2 = new Student("bob", "12347894323243476", "bob_the_man@gmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("#10 triggered");
        }
        
    }
}
