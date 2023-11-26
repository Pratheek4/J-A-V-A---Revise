class Arrays{

    public static void main(String args[])    {

        //int num[] = new int [4]; // Only 4 elements can be stored   

        int num[] = {1,2,3,4};

        // To update array value
        num[1] = 10;

        for (int i = 0; i < 4; i++){
            System.out.println(num[i]);
        }
// Multi-dimentional array

        int nums[][] = new int[4][5]; // 4 arrays having 5 elements each

        //Assign value & print

        for(int i = 0; i < 4; i++){

            for(int j = 0; j < 5; j++){

                // Math class generate a random Double value
                // Convert double to int -> Type Casting

                nums[i][j] = (int) (Math.random() * 10);
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }

    
    }

}