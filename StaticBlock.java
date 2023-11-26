class Mobile {

    int price;
    String brand;
    String name;

    public Mobile() {

        int price = 1000;
        String brand = "One plus";
        System.out.println("Constructor Block");

    }
 
        // When class object is created Static block is called 1st then
        // constructor block is called 2nd

    static {   
        String name = "Phone";
            // Every time object is created name will be reinitialised to "Phone"
        System.out.println("Static Block");

    }

}

public class StaticBlock {
    
    public static void main(String args[]) {

        Mobile m = new Mobile();
 
}

}
