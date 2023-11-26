final class A {    // This class cannot be inherited

    final int a = 20; // Cannot change the value Example ( pie value )

    final public void show() { // Cannot override this method

        System.out.println("Method Runing .....");

    }    

}



public class FinalKeyWord extends A {


    // public void show() {  // Cannot override
            
    //     }

      public static void main(String[] args) {

        
          FinalKeyWord f = new FinalKeyWord();

          System.out.println(f.a);


    }

}


