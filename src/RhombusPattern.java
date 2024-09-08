import java.util.Scanner;
public class RhombusPattern {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter number of rows : ");
        int r= s.nextInt();
        for(int i=r;i>=1;i--)
        {
            for(int j =1; j<=r-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=r;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
