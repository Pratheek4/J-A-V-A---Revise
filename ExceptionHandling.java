public class ExceptionHandling {
    
    public static void main(String[] args) {
        
        int i = 0;
        int j = 0;
        int nums[] = new int[3];
        String str = null;

/*
 *      We can have multiple catch blocks according to the exceptions
 *      
 */
       try{
        j = 18/i;                    // If this line break then rest of the code will not execute 
        System.out.println(j);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(str.length());
        }
        catch(ArithmeticException a){              
            System.out.println(a); 
        }
        catch(ArrayIndexOutOfBoundsException ai){
            System.out.println(ai);
        }
        catch(NullPointerException n){   
            System.out.println("String "+n);
        }
        catch(Exception e){                // This should be in last since it is parent exception
            System.out.println(e);         // If this exception is writtin in first then for all the errors it throws this exception only
        }
         
        System.out.println(j);

    }
}