import java.util.Scanner;
public class num_pyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter rows : ");
        int r = s.nextInt();
        for (int i = 1; i <= r; i++)
        {
            for(int j=1;j<=(r-i);j++)
            {
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++)
            {
                System.out.print(k);
            }
            for(int k = i-1;k>=1;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
