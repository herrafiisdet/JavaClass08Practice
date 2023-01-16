public class ExerciceBreakLoopWithoutBreakKeyword {

    public static void main(String[] args) {

        boolean summer=true;
        int temp=75;

        while (summer) {

            if (temp<=100) {

                System.out.println("Ilovw summer temp2 is " + temp);
            }else {
                System.out.println("its very hot "+temp);
                break;
            }
            temp+=5;
        }

        System.out.println("*******************************************");

        boolean summer2=true;
        int temp2=75;

        while (summer2) {

            if (temp2<=100) {

                System.out.println("Ilovw summer temp2 is " + temp2);
            }else {
                System.out.println("its very hot "+temp2);
                break;

            }
            temp2+=5;
        }

    }
}
