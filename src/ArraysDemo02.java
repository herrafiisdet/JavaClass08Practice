public class ArraysDemo02 {

    public static void main(String[] args) {

        //10 20 30 45 50

        int [] numbers={10,20,30,45,50};

        //write code to add all the numbers from the array

        int sum=0;
        for (int i=0; i< numbers.length;i++){
            System.out.println(numbers[i]);
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
}
