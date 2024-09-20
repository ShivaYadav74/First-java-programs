public class quickSort_program {
    static void print_arr(int []arr) {
        for (int val : arr){
            System.out.print(val+" ");
        }
    }
    static void swapping(int []arr,int x,int y){
        int temp= arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partition(int []arr,int p,int r){
        int x=arr[r];
        int i=p-1;
        for(int j=p;j<r;j++){
            if(arr[j]<x){
                i+=1;
                swapping(arr,i,j);
            }
        }
        swapping(arr,i+1,r);
        return i+1;
    }
    static void quickSort(int []arr,int p,int r){
        if(p>=r) return;
        int pi_idx = partition(arr,p,r);
        quickSort(arr,p,pi_idx-1);
        quickSort(arr,pi_idx+1,r);

    }
    public static void main(String []args){
        int []arr={7,13,8,5,10,2,4};
        int n= arr.length;
        int p=0;
        int r=n-1;
        quickSort(arr,p,r);
        print_arr(arr);
    }
}
