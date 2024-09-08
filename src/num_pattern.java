import java.util.Scanner;
public class num_pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter rows and columns : ");
        int r = s.nextInt(),c=s.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
