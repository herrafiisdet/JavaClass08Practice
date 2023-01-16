public class ArraysDemo {

    public static void main(String[] args) {

        String name = "Amin";
        String name1 = "Amingh";
        String name2 = "Amighjghjn";
        String name3 = "Amghjin";
        String name4 = "Ambbin";
        String name5 = "Abnvmin";

        System.out.println(name2);


        // using Arrays

        String[] names={" salva","Ali","Hassan","abdo","fati"};

        System.out.println(names[4]);
        System.out.println(names[3]);
        System.out.println(names[5]);
        //System.out.println(names[500]); error because there in no name on index 500
        //System.out.println(names[-5]); error because index cant be negative.

        //write a loop to print all the names from array
        for (int i =0; i <=5; i++){
            System.out.println(names[i]);

        }




    }
}
