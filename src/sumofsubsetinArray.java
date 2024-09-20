public class sumofsubsetinArray {
    static void subsetsum(int []arr,int idx,int sum){
        int n= arr.length;
        if(idx==n){
            System.out.println(sum);
            return;
        }
        subsetsum(arr,idx+1,sum+arr[idx]);
        subsetsum(arr,idx+1,sum);
    }
    public static void main(String[] args) {
        int[]arr={2,4,5};
        subsetsum(arr,0,0);
    }
}
