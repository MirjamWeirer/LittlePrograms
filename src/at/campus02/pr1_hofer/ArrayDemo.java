package at.campus02.pr1_hofer;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] Array1 = {3, 4, 5};
        int[] Array2 = {7, 1, 3};

        for (int i = 0; i < Array1.length; i++) {
            System.out.println(Array1[i]+Array2[i]);
        }
        for (int i = 0; i < Array1.length; i++) {
            System.out.println(Array1[i]*Array2[i]);
        }
    }
}
