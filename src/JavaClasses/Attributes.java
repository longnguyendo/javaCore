package JavaClasses;

public class Attributes {
    final int y = 10; // use final cannot change value // cannot assign a value to a final variable
    int x = 5;

    String fname = "John", lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        Attributes myObj = new Attributes();
        System.out.println("1: "+myObj.x);

        // multiple objs
        Attributes myObj2 = new Attributes();
        myObj2.x = 20;
        System.out.println("2: " + myObj2.x);

        //Multiple attribute
        Attributes multiAttr = new Attributes();
        System.out.println(multiAttr.fname + " " + multiAttr.lname + ", age: " + multiAttr.age);
    }
}
