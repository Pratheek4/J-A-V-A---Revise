class Mobile {

    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

}


public class Static {

    public static void main(String args[]) {

        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 2000;
        Mobile.name = "Smart phone 1";

        Mobile m2 = new Mobile();
        m2.brand = "One Plus";
        m2.price = 1200;
        Mobile.name = "Smart phone 2";

        Mobile.name = "Basic Phone";
        
        m1.show();
        m2.show();


    }

}