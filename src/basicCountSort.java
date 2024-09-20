public class basicCountSort {
    // It is not a stable algorithm....
    static void print_arr(int []arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    static int findmax(int []arr){
        int n= arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }
    static void countsort(int[]arr){
        int max= findmax(arr);
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k]=i;
                k++;
            }
        }
    }
    public static void main(String[]args){
        int []arr={4,3,1,5,3,1,3,5};
        countsort(arr);
        print_arr(arr);
    }
}
