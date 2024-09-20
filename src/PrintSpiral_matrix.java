import  java.util.Scanner;
public class PrintSpiral_matrix {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " \t");
            }
            System.out.println();
        }
    }
   static int [][]spiralelements(int n ){
        int totalelements=1;
        int toprow=0;
        int bottomrow=n-1;
        int leftcolm=0;
        int rightcolm=n-1;
        int [][]arr=new int[n][n];
        while(totalelements<=n*n){
            //toprow
            for(int i=leftcolm;i<=rightcolm && totalelements<= n*n;i++){
                arr[toprow][i]=totalelements;
//                System.out.print(arr[toprow][i]+" ");
                totalelements++;
            }
            toprow++;
            // rightcolm
            for(int i=toprow;i<=bottomrow && totalelements<=n*n;i++){
                arr[i][rightcolm]= totalelements;
//                System.out.println(arr[i][rightcolm]+" ");
                totalelements++;
            }

            rightcolm--;

            //bottomrow
            for(int i=rightcolm;i>=leftcolm && totalelements<=n*n;i--){
                arr[bottomrow][i]=totalelements;
//                System.out.println( arr[bottomrow][i]+" ");
                totalelements++;
            }

            bottomrow--;

            // leftcolm
            for(int i=bottomrow;i>=toprow && totalelements<=n*n;i--){
                arr[i][leftcolm]=totalelements;
//                System.out.println(arr[i][leftcolm]+" ");
                totalelements++;
            }

            leftcolm++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the order of matrix : ");
        int n=s.nextInt();
       int [][]ans= spiralelements(n);
       printArray(ans);
    }
}
