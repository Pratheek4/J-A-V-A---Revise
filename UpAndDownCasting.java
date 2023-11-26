class ParentClass {


}

class ChildClass extends ParentClass {


    ParentClass obj = new ChildClass();   // Up Casting -> No data loss

    ChildClass obj1 = (ChildClass) obj ;  // Down casting -> Data loss, but forcefully casted 
                                          // Data will be loss 
        
}

public class UpAndDownCasting {

    public static void main(String[] args) {
        
        double d = 45.45;
        int e = (int) d;                 // Type Casting
        System.out.println(e);
    }

}
