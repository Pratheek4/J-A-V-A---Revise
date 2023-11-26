  /*
            1. Complie time -> Method overloading
            2. Run time     -> Method overriding     -> Possible in Dynamic method Dispatch
    
    */

  //  D Y N A M I C   M E T H O D   D I S P A T C H

class A {
    public void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    public void show() {                   // Overriding methdod from Class A
        System.out.println("Class B");
    }
}

class C extends A {
    public void show() {                   // Overriding methdod from Class A
        System.out.println("Class C");
    }

}

public class Ploymosphism {

    public static void main(String[] args) {

        A obj = new A(); // Possible since B extends to A
        //  B obj1 = new A();  // Not Possible B is child of A

        obj.show(); // Print "Class A"

        obj = new B();
        obj.show(); // Print "Class B"

        obj = new C();
        obj.show(); // Print "Class C"
    }

}