package at.campus02.pr1_hofer;

public class ArrayDemo2 {
    public static void main(String[] args) {
        String[] monat = {"Jänner","Februar","März","April","Mai","Juni","Juli","August","September","Oktober","November","Dezember"};
        for (int i = 0; i < monat.length; i++) {
            System.out.println(monat[i] + "[" + (i+1) + "]");
        }
    }


}
