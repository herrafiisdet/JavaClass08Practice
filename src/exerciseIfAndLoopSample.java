public class exerciseIfAndLoopSample {

    public static void main(String[] args) {

        /*0 1 2 3 4 5
          1 2 3 4 5
          2 3 4 5
        */

        for (int i =0; i<3; i++){  //i=i+1
            if (i==0){
                for (int j =0; j<=5; j++){
                    System.out.print(j+" ");
                }
            }else if (i==1){
                for (int j =1; j<=5; j++){
                    System.out.print(j+" ");
                }
            }else if (i==2){
                for (int j =2; j<=5; j++){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }

        //using a loop

        /*  0 1 2 3 4 5
            1 2 3 4 5
            2 3 4 5

         */
        System.out.println("**************");


        for (int i = 0; i < 3; i++) {
            for (int j = i; j <=5; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
