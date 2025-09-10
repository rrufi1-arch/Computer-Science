public class RectangleTester {
    
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(20, 40);
        Rectangle rect2 = new Rectangle(30, 50);
        System.out.println(rect1.toString());
        System.out.println(rect2.toString());
        rect1.setLength(30);
        rect2.setWidth(40);
        System.out.println(rect1.toString());
        System.out.println(rect2.toString());
        rect1.equals(rect2);
        System.out.println(rect1.getDiagonal());
        System.out.println(rect2.getDiagonal());
    }
}