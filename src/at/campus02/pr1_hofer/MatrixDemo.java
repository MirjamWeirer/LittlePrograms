package at.campus02.pr1_hofer;

public class MatrixDemo {
    public static void main(String[] args) {
        double [][] id = generateIdentityMatrix(5);
        printMatrix(id);
    }

    public static double[][] generateIdentityMatrix(int size) {
        double[][] idMat = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    idMat[i][j] = 1.0;
                } else {
                    idMat[i][j] = 0.0;
                }
            }
        }
        return idMat;
    }

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
