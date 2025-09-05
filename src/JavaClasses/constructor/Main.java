package JavaClasses.constructor;

public class Main {

    // a constructor is a special method that is used to initialize objects

    // constructor is called when an object of a class is created
    int birthY ;
    String modelName;
    public Main (int year, String name) {
        birthY = year;
        modelName = name;
    }
    public static void main(String[] args) {
        Main myConstructor = new Main(2000, "Danila");
        System.out.println(myConstructor.birthY);
        System.out.println(myConstructor.modelName);
    }

}
