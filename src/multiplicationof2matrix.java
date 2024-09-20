import java.util.Scanner;
class Twodmatrix{
    void printarray(int [][]a,int r1,int c1){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void multiply(int [][]a,int [][]b,int r1,int c1,int r2,int c2){
        if(c1 !=r2){
            System.out.println("Multiplication is not possible!!");
            return;
        }
        int mul[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                mul[i][j]=0;
                for(int k=0;k<c1;k++){
                    mul[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        printarray(mul,r1,c2);
    }
}
public class multiplicationof2matrix {
    public static void main(String []args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number of rows and columns of 1st matrix : ");
        int r1 = s.nextInt(),c1=s.nextInt();
        int[][]a = new int[r1][c1];
        System.out.println("Enter number of rows and columns of 2nd matrix : ");
        int r2 = s.nextInt(),c2=s.nextInt();
        int[][]b = new int[r2][c2];
        System.out.println("Enter the elements of 1st array : ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd array : ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=s.nextInt();
            }
        }
        Twodmatrix obj= new Twodmatrix();
        obj.multiply(a,b,r1,c1,r2,c2);
    }
}
