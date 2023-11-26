/*
        Class should having abstract keyword
        Declared but not define
        Applicable to class and method
        Only abstract class can have abstract methods
        Method should be defined when child class extends parent class compulsory
        We cannot create a class of abstract class
        Class extending to abstract class is known as concrete class
 */

abstract class A {

    abstract public void Drive(); // Method only declared
    abstract public void BurnOut();

    public void Drift() {
        System.out.println("Drifting......"); // Can have Defined methods but
        // In Interface class only method are declared
    }
}

class B extends A {  // Called as Concreate class

    // All the declared metods showuld be defined
    // if not class extening current class showuld define methods of current extending parent class

    public void Drive() {
        System.out.println("Driving......");
    }

    public void BurnOut() {
        System.out.println("BurningOutTyres......");
    }
}
abstract public class Abstraction {

    public static void main(String[] args) {

        
        B obj = new B();
        obj.Drift();
        obj.Drive();
        obj.BurnOut();


        A obj1 = new A() { // Cannot create object of abstract class but here we created ananomus inner class
                           // So this is a class with out name, in here we defined methods
                           // Also we can override this method or change the implimentation of the method

            public void Drive() {
                System.out.println("Inner class Driving......");
            }

            public void BurnOut() {
                System.out.println("Inner class BurningOutTyres......");
            }
        };
    }

}


