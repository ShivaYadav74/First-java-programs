import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of rows : ");
        int r = s.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
//            System.out.print("*");
            for (int k = 1; k <= (2 * i) - 3; k++) {
//                System.out.print(" ");

//                if (i != 1)
                    System.out.print("*");
            }
                System.out.println();
            }
            for (int i = r - 1; i >= 1; i--) {
                for (int j = 1; j <= r - i; j++) {
                    System.out.print(" ");
                }
//                System.out.print("*");
                for (int k = 1; k <= (2 * i) - 3; k++) {
//                System.out.print(" ");

//                    if (i != 1)
                        System.out.print("*");
                }
                System.out.println();
            }
        }
    }

