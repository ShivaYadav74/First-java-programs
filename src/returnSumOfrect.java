import java.util.Scanner;
public class returnSumOfrect {
//   static int findSum(int [][]arr,int l1,int l2,int r1,int r2){
//        int sum = 0;
//        if(l1<l2 && r1 <r2) {
//            for (int i = l1; i <= l2; i++) {
//                for (int j = r1; j <= r2; j++) {
//                    sum += arr[i][j];
//                }
//            }
//        }
//        return sum;
//    }
//    public static void main(String[]args){
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter the number of rows and columns : ");
//        int r= s.nextInt(),c=s.nextInt();
//        int [][]arr=new int[r][c];
//        System.out.println("Enter the elements of the array : ");
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                arr[i][j]=s.nextInt();
//            }
//        }
//        System.out.println("Enter the coordinates of the rectangle : ");
//        int l1=s.nextInt(),r1=s.nextInt();
//        int l2=s.nextInt(),r2=s.nextInt();
//
//        if(r>l2 && c>r2){
//            System.out.println(findSum(arr,l1,l2,r1,r2));
//        }
//        else
//        {
//            System.out.println("Not possble!!");
//        }
//    }


    //USING PREFIXSUM ARRAY......


//    static void prefixsumarray(int[][]arr){
//        int r=arr.length;
//        int c=arr[0].length;
//        for(int i=0;i<r;i++){
//            for(int j=1;j<c;j++){
//                arr[i][j]+=arr[i][j-1];
//            }
//        }
//    }
//
//    static int findsum(int [][]arr,int l1,int r1,int l2,int r2){
//        prefixsumarray(arr);
//        int sum =0;
//        for(int i=l1;i<=l2;i++){
//            if(r1>=1){
//                sum+=arr[i][r2]-arr[i][r1-1];
//            }
//            else {
//                sum+=arr[i][r2];
//            }
//        }
//        return sum;
//
//
//    }
//
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter the number of rows and columns : ");
//        int r= s.nextInt(),c=s.nextInt();
//        int [][]arr=new int[r][c];
//        System.out.println("Enter the elements of the array : ");
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                arr[i][j]=s.nextInt();
//            }
//        }
//        System.out.println("Enter the coordinates of the rectangle : ");
//        int l1=s.nextInt(),r1=s.nextInt();
//        int l2=s.nextInt(),r2=s.nextInt();
//
//        if(r>=l2 && c>=r2){
//            System.out.println(findsum(arr,l1,r1,l2,r2));
//        }
//        else
//        {
//            System.out.println("Not possble!!");
//        }
//    }


    //USING PREFIX SUM OVER ROWS AND COLUMNS BOTH!!


    static int [][] prefixsumarray(int[][]arr){
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
        for(int i=0;i<c;i++){
            for(int j=1;j<r;j++){
                arr[j][i]+=arr[j-1][i];
            }
        }
        return arr;
    }

    static int findsum(int[][]arr,int l1,int r1,int l2,int r2){
        prefixsumarray(arr);
        int sumOfrect;
        if(l1>0 && r1>0) {
            sumOfrect = arr[l2][r2] - (arr[l1 - 1][r2] + arr[l2][r1 - 1]) + arr[l1 - 1][r1 - 1];
        }
        else if(l1>0){
            sumOfrect = arr[l2][r2] - (arr[l1 - 1][r2] + arr[l2][r1]) + arr[l1 - 1][r1];
        }
        else if(r1>0){
            sumOfrect = arr[l2][r2] - (arr[l1][r2] + arr[l2][r1 - 1]) + arr[l1][r1 - 1];
        }
        else{
            sumOfrect = arr[l2][r2] - (arr[l1][r2] + arr[l2][r1]) + arr[l1][r1];
        }
        return sumOfrect;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns : ");
        int r= s.nextInt(),c=s.nextInt();
        int [][]arr=new int[r][c];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the coordinates of the rectangle : ");
        int l1=s.nextInt(),r1=s.nextInt();
        int l2=s.nextInt(),r2=s.nextInt();

        if(l2<=r && r2<=c){
            System.out.println(findsum(arr,l1,r1,l2,r2));
        }
        else
        {
            System.out.println("Not possble!!");
        }
    }
    }

