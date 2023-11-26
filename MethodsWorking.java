class methosOverLoading{

    public int add(int n1, int n2, int n3){

        return n1 + n2 + n3;   

    }

    public int add(int n1, int n2){

        return n1 + n2;   

    }

    public double add(double n1, int n2){

        return n1 + n2 ;   

    }

}

class Calculator1{

    int num  = 5;
    public int add(int n1,int n2){

        return n1 + n2;
    }
}


public class MethodsWorking{

    public static void main(String args[]){
    
    int num1 = 5;
    int num2 = 6;

        Calculator1 c1 = new Calculator1();

        int result = c1.add(num1,num2);
        System.out.println(result);

        Calculator1 c2 = new Calculator1();
        c2.num = 10;
        System.out.println(c2.num);
        System.out.println(c1.num);

        // Both are different objects of the sane class
        // Check working in the notes diagram
        // Methods are stored in stack memory
        // Objects are stored in the heep memory

    }

}