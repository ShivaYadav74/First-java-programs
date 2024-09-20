public class stable_countSort_algo {
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
    static void countSort(int []arr){
        int n=arr.length;
        int ans[]= new int[n];
        int max=findmax(arr);
        int []count=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //prefix sum...
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int idx= count[arr[i]]-1;
            ans[idx]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }
    }
    public static void main(String[]args){
        int []arr={2,3,2,4,0,1,4,1,1,0,2};
        countSort(arr);
        print_arr(arr);
    }
}
