import java.util.Scanner;
public class spiralMatrix {
   static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " \t");
            }
            System.out.println();
        }
    }
    static void spiral(int [][]arr,int r, int c){
        int totalelements=0;
        int toprow= 0;
        int bottomrow=r-1;
        int leftcolm=0;
         int rightcolm=c-1;
         while(totalelements < r*c){
             //top row
             for(int i=leftcolm;i<=rightcolm && totalelements < r*c;i++){
                 System.out.print(arr[toprow][i]+" ");
                 totalelements++;
             }
             toprow++;
             // right colm
             for(int i=toprow;i<=bottomrow && totalelements < r*c;i++){
                 System.out.print(arr[i][rightcolm]+" ");
                 totalelements++;
             }
             rightcolm--;
             //bottom row

             for(int i=rightcolm;i>=leftcolm && totalelements < r*c;i--){
                 System.out.print(arr[bottomrow][i]+" ");
                 totalelements++;
             }
             bottomrow--;
             // left colm

             for(int i=bottomrow;i>=toprow && totalelements < r*c;i--){
                 System.out.print(arr[i][leftcolm]+" ");
                 totalelements++;
             }
             leftcolm++;
         }
    }
    public static void main(String[]args){
       Scanner s= new Scanner(System.in);
       System.out.println(" Enter the number of rows and columns : ");
       int r=s.nextInt(),c=s.nextInt();
       int [][]arr= new int[r][c];
       System.out.println(" Enter the elements of the array : ");
        for(int i =0;i<r;i++){
            for(int j =0; j<c;j++){
                arr[i][j]=s.nextInt();
            }
        }
        spiral(arr,r,c);
    }
}
