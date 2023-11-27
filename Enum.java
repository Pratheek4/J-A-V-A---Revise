enum Laptop{

    Mackbook(3000), Xps(2200), Surface(1255), ThinhPad(); 
    // These are called objects, and then they are calling parameterized constructor

    private int price;

    private Laptop(int price) {  // For the price given in the above objects
        this.price = price;
    }

    private Laptop() {   // For object which do not have price
        price  = 500;
    }

    public int getPrice() {  // To get the price
        return price;
    }

    public void setPrice(int price) { // To set the price
        this.price = price ;
    }

    
}

public class Enum {
    
    public static void main(String[] args) {
        
      //  Laptop[] l = Laptop.values(); // Laptop is a type not an object
        //System.out.println(l);

        // To print all the enums

        for(Laptop m : Laptop.values()){
                System.out.println(m +" : " +m.getPrice());
        }
    }
}
