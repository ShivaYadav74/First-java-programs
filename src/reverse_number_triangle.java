import java.util.Scanner;
 class reverse_tri{
     void method(int n){
         for(int k=0;k<=n;k++) {
             if(k!=n) {
                 for (int i = n - (n - k); i >= 1; i--) {
                     System.out.print(" ");
                 }
                 for (int j = k + 1; j <= n; j++) {
                     System.out.print(j + " ");
                 }
                 System.out.println();
             }
         }
         for(int i=1;i<=n-1;i++){
             for(int j=1;j<=(n-1)-i;j++){
                 System.out.print(" ");
             }
             for(int k=n-i;k<=n;k++){
                 System.out.print(k+" ");
             }
             System.out.println();
         }
         }
     }
public class reverse_number_triangle {
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of rows : ");
         int n= sc.nextInt();
         reverse_tri obj= new reverse_tri();
         obj.method(n);
     }
}
