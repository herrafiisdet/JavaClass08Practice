import java.util.Scanner;

public class LoopWithString {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.println("please enter your name");

        while (scanner.next().equalsIgnoreCase("Sha")){
            System.out.println("Great Student always wanted an example with string in loop");

        }
    }
}
