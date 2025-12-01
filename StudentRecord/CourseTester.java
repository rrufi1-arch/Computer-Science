public class CourseTester {
    public static void main(String[] args) {
        StudentRecord ana = new StudentRecord("ana", new int[] {90, 89, 91, 95});
        if (ana.toString().equals("ana's scores: [90, 89, 91, 95]")) {
            System.out.println(true);
        } else {
            System.out.println(ana.toString());
        }
        if (ana.getAverage(0, 3) == 91.25) {
            System.out.println("correct average");
        } else {
            System.out.println(ana.getAverage(0, 3));
        }
        if (ana.getTestScore(1) == 89) {
            System.out.println("correct score value");
        } else {
            System.out.println("incorrect score value");
        }
    }
    
}
