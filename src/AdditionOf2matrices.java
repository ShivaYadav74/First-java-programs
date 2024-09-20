import java.util.Scanner;
class addition{
    int [][] addmatrices(int [][]a,int[][]b,int r,int c){
        int [][]sum=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        return sum;
    }
}
public class AdditionOf2matrices {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of rows and columns : ");
    int r= s.nextInt();
    int c=s.nextInt();
    int [][]a=new int[r][c];
        int [][]b=new int[r][c];
        int [][]sum=new int[r][c];

        System.out.println("Enter the elements of first array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the elements of second array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=s.nextInt();
            }
        }
        addition obj= new addition();
        sum=obj.addmatrices(a,b, r, c);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(sum[i][j]+"\t");
            }
        }

    }
}
