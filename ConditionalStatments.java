public class ConditionalStatments {
    

    public static void main(String[] args) {
    
        int a = 12;
        int result = 0;

        // Normal if else statment
        /*if(a%2==0)
            result = 10;
        else    
            result = 20;*/

        // If else in one line
        result = a % 2 == 0 ? 10 : 20 ; 
        System.out.println(result);

        // Switch statment
        int n = 0;

        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter correct number");
        }

        int e = 1;


        // This is while statment and nested while statment
        /*while (e <= 12) {
            System.out.println(e + " : Hour");
                int f = 1;
                while (f <= 60) {
                    System.out.println(e + " : Hour | " + f + " : Minitus");
                    f++;
                        int h = 1;
                        while(h <= 50){
                            System.out.println(h + " : Secounds");
                        }
                        h++;
                }
            e++;
        }*/
        for (int i = 1 ; i <= 10 ; i++)
        {
            System.out.println("This is for loop");
            for (int j = 1 ; j <= 1 ; j++)
            {
                System.out.println("This is nested for loop");
            }
        }

    }
}