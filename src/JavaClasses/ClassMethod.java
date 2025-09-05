package JavaClasses;

public class ClassMethod {
    static void myMethod() {
        System.out.println("My Method");
    }
    // static vs public:
    // static: u can call fn immediately in main;
    // public u need to assign on new obj
    public void myPublicMethod() {
        System.out.println("public method");
    }

    // car;

    public static void main(String[] args) {
        myMethod();
        ClassMethod myObj = new ClassMethod();
        myObj.myPublicMethod();
        // access methods with an object


    }
}
