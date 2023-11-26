// Creating a new class
public class Methods{

    public static void main(String args[]){

        int num1 = 11;
        int num2 = 22;
        int num3 = 33;
        calculator cal = new calculator();
        int result = cal.addTwoNumbers(num1,num2);
        int result1 = cal.subThreeNumbers(num3,num2,num1);
        System.out.println(result1);

    }
}

// Creating a class and a method to add two numbers
class calculator{

    public int addTwoNumbers(int n1, int n2){

        int r = n1 + n2 ;
        return r;

    }
    public int subThreeNumbers(int n1, int n2, int n3){

        int r = n1 - n2 - n3 ;
        return r;

    }
    public int multiplyTwoNumbers(int n1, int n2){

        int r = n1 * n2 ;
        return r;

    }
}