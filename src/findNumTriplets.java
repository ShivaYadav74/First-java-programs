
class findtriplets{
    int find(int[]arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k =i+2;k<arr.length;k++) {
                    if (arr[i] + arr[j]+arr[k] == x) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
public class findNumTriplets {
    public static void main(String[] args) {
        findtriplets obj=new findtriplets();
        int []arr={1,4,5,6,3};
        int x=12;
        int ans = obj.find(arr,x);
        System.out.println("The total number of pairs are "+ans);
    }
}


