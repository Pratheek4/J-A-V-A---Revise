class A {

    public A() {
        super(); //  -> This will call super classes of all the class which is Object class
        System.out.println("Default Constructor A");
    }

    public A(int a) {

        System.out.println("Parameterised constructor A");
    }

}

class B extends A{

    public B() {

        System.out.println("Default Constructor B");
    }

    public B(int b) {

        //this();   -> Call default constructor of the same class 
        //super(5); -> To call a parameterised construct
        //super();  -> Will be present in all the constructors invisable
        // Super keyword means call inherited class constructor
        System.out.println("Parameterised constructor B");
    }

}

public class SuperThisKeyword {

    public static void main(String[] args) {
        
        new B(5);  // Creating a Anonamus object

    }
    
}