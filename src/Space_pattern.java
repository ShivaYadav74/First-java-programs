import java.util.Scanner;
public class Space_pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter rows  : ");
        int r = s.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= (r - i); j++) {
                System.out.print(" ");
            }
                System.out.print(i);
            for (int j = 0; j <=(2*i-3) ; j++) {
                System.out.print(" ");
            }
            if(i!=1) {
                    System.out.print(i);
            }
            if(i==r)
                for( int l= 2;l<=((2*r)-2);l++) {
                    System.out.print(i);
                }
            System.out.println();
        }
    }
}
