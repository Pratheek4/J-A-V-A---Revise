class A {

    public void drive() {

        System.out.println("Driving......");
    }

}

public class AnanomusInnerClass {

    public static void main(String[] args) {

        A obj = new A() {
            public void drive() {

                System.out.println("Ananomus inner class Driving......");
                    // Overriding already defined method
            }
        };
        obj.drive(); // This prints ( Ananomus inner class Driving...... )



        Parent p = new Parent() { 
            public void print() {
                System.out.println("Inner | print");
            }
            public void get() {
                System.out.println("Inner | get");
            }
        };

        p.get();
        p.print();
    } 
}

// What if we define objects in inner class implemented in above class

abstract class Parent {

    public abstract void print();
    public abstract void get();

}
