import java.util.Scanner;
public class oneTwo_pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r =s.nextInt(),c=s.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if((i+j) %2 ==0)
                {
                    System.out.print(1);
                }
                else
                {
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }
}
