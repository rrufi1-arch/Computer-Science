public class MatrixFunTester {
    public static void main(String[] args) {
        MatrixFun matrix1 = new MatrixFun(new int[][] {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}});
        MatrixFun matrix2 = new MatrixFun();
        MatrixFun matrix3 = new MatrixFun(new int[][] {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}});

        System.out.println(matrix1.toString());
        System.out.println(matrix2.toString());
        System.out.println(matrix1.equals(matrix2));
        System.out.println(matrix1.equals(matrix3));
    }

}
