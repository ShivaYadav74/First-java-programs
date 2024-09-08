import java.util.Scanner;
public class double_series {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter rows and columns : ");
        int r =s.nextInt(),c=s.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j =i; j<=r;j++)
            {
                System.out.print(j);
            }
            for(int k =1; k<=(i-1);k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
