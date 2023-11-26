class Calc {

    public void add() {
        System.out.println("Calc - Add Method");
    }

    public void sub() {
        System.out.println("Calc - Sub Method");
    }

}

class AdvCalc extends Calc{  // This is called single level inheritance

    public void multi() {
        System.out.println("AdvCalc - Multi Method");
    }

    public void sub() {
        System.out.println("Calc - Sub Method overrided");
    }

    public void divid() {
        System.out.println("AdvClac - Divid Method");
    }
}

class ScintCalc extends AdvCalc { // This is called multi level inheritance

    public void multi() {
        System.out.println("AdvCalc - Multi Method overrided ");
    }

    public void percentage() {
        System.out.println("ScintCalc - Percentage Method");
    }
}

public class Inheritance {
    
    public static void main(String[] args) {

        ScintCalc s = new ScintCalc(); // This class object can access both class methods
        s.add();        // From Calc class
        s.sub();        // From AdvCalc class -> Method override
        s.multi();      // From ScintCalc class -> Method override
        s.divid();      // From AdvCalc class
        s.percentage(); // From same class object 


        /*
            Single level , Multi level is possible in java
            But Multiple level inheritance is not posible in java
            
        IF ->   A (Parent)             B (Parent)
        
                        C (Child)       -> Extends both A and B class
        
                What if there is a method x(); present in both the parent class
                This is called as [ AMBIGUITY ] 
                Class B Will be confused from which class should method x(); access from
        
                [ SO JAVA DOES NOT SUPPORT MULTIPLE INHERITANCE ]
        
        
        */
    }
}