package at.campus02.pr1_hofer;

public class Bunny {
    String name;
    int age;
    double height;
    double weight;
    String color;
    static String speciesName = "Latin name";

    public static void jumpStatic(double height){
        //cannot access non static member name in static method
        //System.out.println("jumps " + height);
    }

    public void jump(double height){
        //in instance method i can access and use instance attributes
        System.out.println(name + " jumps " + height);
    }

    public void doubleJump(double height){
        jump(height);
        jump(height);
    }
}
