public class Patterns {
    public static void main(String[] args) {
    //    for(int i=1; i<=4; i++){
    //     for(int j = 1; j<=4 - i; j++){
    //         System.out.print(" ");
    //     }
    //     for(int j = 1; j<= (2 * i) - 1; j++){
    //         System.out.print("*");
    //     }
    //     for(int j = 1; j<=4 - i; j++){
    //         System.out.print(" ");
    //     }
    //     System.out.println();
    //    }
    //    for(int i=5; i<=8; i++){
    //     for(int j = 1; j<=i-5; j++){
    //         System.out.print(" ");
    //     }
    //     for(int j = 1; j<=(-2*i)+17; j++){
    //         System.out.print("*");
    //     }
    //     for(int j = 1; j<=i-5; j++){
    //         System.out.print(" ");
    //     }
    //     System.out.println();
    //    }

    for(int i = 1; i<= 5; i++){
        // space
        for(int j = 1; j<= 5-i; j++){
            System.out.print(" ");
        }

        //hollow rectangle
        for(int j = 1; j<=5; j++){
            if(i == 1 || i== 5||j==1 || j == 5){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
}

