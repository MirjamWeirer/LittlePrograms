package at.campus02.pr1_hofer;

public class Bunny {
    String name;
    int age;
    double height;
    double weight;
    String color;
    static String speciesName = "Latin name";

    public static void main(String[] args) {
        System.out.println("we will do something important");
        Bunny bugs = new Bunny();
        Bunny roger = new Bunny();
        //class or instance attribute /methods
        bugs.name = "Bugs Bunny";
        bugs.jump(20.2);

        //static methodes
        jumpStatic(20.4);
        //this is the same
        Bunny.jumpStatic(20.3);
        //to access class attribute
        //we need to specify name when,
        //it is a different class
        System.out.println(Bunny.speciesName);
    }

    public static void jumpStatic(double height){
        System.out.println("jumps " + height);
    }

    public void jump(double height){
        //in instance method i can access and use instance attributes
        System.out.println(name + " jumps " + height);
    }
}
