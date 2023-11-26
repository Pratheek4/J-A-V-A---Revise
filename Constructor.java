
class Capsual {

    // Default custructor
    public Capsual() {
        System.out.println("Constructor 1");
    }

    // Parameterised constructor
    public Capsual(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Parameterised constructor
    public Capsual(String name) {
        this.age = 30;
        this.name = name;
    }


    private int age = 27;
    private String name = "Prem Pratheek";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        // This key word represents current object 5.30
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}


public class Constructor { //5.37
    
    
    public static void main(String args[]) {

        Capsual c1 = new Capsual();
        Capsual c2 = new Capsual(30, "Pratheek"); // Send value, according to the paramater
                                                            // respective constructor will invoke
        Capsual c3 = new Capsual("P Pratheek");

        //c1.setAge(25);
        //c2.setName("Pratheek P");

        //System.out.println(c1.getName() + " : " + c1.getAge());
        //System.out.println(c2.getName() + " : " + c2.getAge());
        System.out.println(c3.getName()+" : "+c3.getAge());

    }
    
}
