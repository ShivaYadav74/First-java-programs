import java.util.Scanner;
public class ReversePyramid {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int r =s.nextInt();
        for(int i=r;i>=1;i--)
        {
            for(int j =1 ;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}