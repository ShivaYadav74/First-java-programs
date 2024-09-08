import java.util.Scanner;
public class NumberTriangular {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number of rows : ");
        int r = s.nextInt();
        for(int i =1;i<=r;i++)
        {
            for(int j =1;j<=(r-i);j++)
            {
                System.out.print(" ");
            }
           for(int k =1;k<=i;k++)
           {
               System.out.print(i+" ");
           }
            System.out.println();
        }
    }
}
