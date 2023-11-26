class Students{

    int rollNo ; 
    String name ;
    int marks ;

}


public class Arrays1{

    public static void main (String args[]){

        Students s1 = new Students();
        s1.rollNo = 1;
        s1.name = "Pratheek";
        s1.marks = 90;

        Students s2 = new Students();
        s2.rollNo = 2;
        s2.name = "Priti";
        s2.marks = 80;

        Students s3 = new Students();
        s3.rollNo = 3;
        s3.name = "Abhilash";
        s3.marks = 95;

        Students stud[] = new Students[3]; // Create a array 
        stud[0] = s1;                      // Assign all the object variables to arrays
        stud[1] = s2;
        stud[2] = s3;

        //Using for loop
        // for(int i = 0; i<stud.length; i++){

        //     System.out.println(stud[i].name + " : " + stud[i].rollNo);

        // }

        //Using enhaned for loop

        for(Students s : stud){
                System.out.println(s.name + " : " +s.rollNo);
        }


    }
}