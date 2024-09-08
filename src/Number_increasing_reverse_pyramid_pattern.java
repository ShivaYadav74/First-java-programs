import java.util.Scanner;
public class Number_increasing_reverse_pyramid_pattern {
    static void pattern(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of rows ");
        int r =s.nextInt();
        for(int i =r;i>=1;i--)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern();
    }
}
