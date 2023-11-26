class Capsual {

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


public class Encapsulation { // 5.13
    
    public static void main(String args[]) {

        Capsual c = new Capsual();
        c.setAge(25);
        c.setName("Pratheek P");

        System.out.println(c.getName()+" : "+c.getAge());

    }
    
}
