import java.util.Scanner;
class transposematrix{
    void printArray(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" \t");
            }
            System.out.println();
        }
    }

    void transpose(int [][]arr,int r,int c){
        int [][]ans = new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=arr[j][i];
            }
        }
        // In place transpose.....(only for square matrix)
//        for(int i=0;i<r;i++){
//            for(int j=i;j<c;j++){
//                int temp= arr[i][j];
//                arr[i][j]=arr[j][i];
//                arr[j][i]=temp;
//            }
//        }
        printArray(ans);
    }
}
public class transposeOfMatrix {
    public static void main(String []args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the no. of rows and columns of the matrix : ");
    int r= s.nextInt(),c=s.nextInt();
    int [][]arr=new int[r][c];
    System.out.println("Enter the elements of the array : ");
    for(int i =0;i<r;i++){
        for(int j =0; j<c;j++){
            arr[i][j]=s.nextInt();
        }
    }
    System.out.println("The transpose of the array is : ");
    transposematrix obj= new transposematrix();
    obj.transpose(arr,r,c);
    }
}
