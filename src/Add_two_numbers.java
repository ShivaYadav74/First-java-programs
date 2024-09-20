import java.util.Scanner;
 class add {
     int sum(int a, int b) {
         int ans = a + b;
         return ans;
     }
 }
    public class Add_two_numbers{
    public static void main(String[] args) {
        add obj=new add();
        Scanner s=new Scanner(System.in);
        System.out.println("enter a and b : ");
        int a=s.nextInt(),b=s.nextInt();

        int ans = obj.sum(a,b);
        System.out.println("the sum of numbers is : "+ans);
    }

}
