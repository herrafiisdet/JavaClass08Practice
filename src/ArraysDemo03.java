public class ArraysDemo03 {

    public static void main(String[] args) {

        //create an array to store the letters A,B,C,D,E,F

        char [] letters= {'A','B','C','D','E','F'};

        for(int i=0; i< letters.length;i++){

            System.out.println(letters[i]);


        }


        // other way to store rray

        int number=10;

        int [] numbers= new int[5];
        numbers[0]=50;
        numbers[1]=30;
        numbers[2]=55;
        numbers[3]=60;
        numbers[5]=52;

        for (int i=0; i<numbers.length; i++){

            System.out.println(numbers[i]);




    }
}
    }
