import java.util.Scanner;
public class HourglassPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int r =s.nextInt();
        for(int i =r; i>=1;i--)
        {
            for(int j =1;j<=r-i;j++) {
                System.out.print(" ");
            }
                for(int k =1;k<=i;k++)
                {
                    System.out.print("*"+" ");
                }
            System.out.println();
        }
        for(int i=1;i<=r-1;i++)
        {
            for(int j =1;j<=(r-1)-i;j++)
            {
                System.out.print(" ");
            }
            for(int k =1; k<=i+1;k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
