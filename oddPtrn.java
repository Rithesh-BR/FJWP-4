public class oddPtrn {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // //Inverted
        // for (int i = 5; i>=1; i--) {
        //     for (int j = 1; j <= rows - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= 2 * i - 1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}