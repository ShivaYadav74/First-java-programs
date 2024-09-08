import java.util.Scanner;
public class NumberChangingPyramid {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int r= s.nextInt();
        int num =1;
        for(int i =1;i<=r;i++)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print(num+"\t");
                num++;
            }
            System.out.println();
        }
    }
}
