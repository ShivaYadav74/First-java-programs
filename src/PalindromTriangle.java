import java.util.Scanner;
public class PalindromTriangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int r = s.nextInt();
        for(int i =1;i<=r;i++)
        {
            for(int j=1;j<=(r-i);j++)
            {
                System.out.print(" ");
            }
            for(int k =i;k>=1;k--)
            {
                System.out.print(k);
            }
            if(i!=1)
            {
                for(int l=2;l<=i;l++)
                {
                    System.out.print(l);
                }
            }
            System.out.println();
        }
    }
}
