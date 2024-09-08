import java.util.Scanner;
public class hollow_rect {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter rows and columns : ");
        int r =s.nextInt(),c=s.nextInt();
        for(int i =1 ;i<=r;i++)
        {
            for(int j =1;j<=c;j++)
            {
                if((i==1) || (i==r) || (j==1) || (j==c))
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
