class findpairs{
    int find(int[]arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    count++;
                }
            }
        }
        return count;
    }
}
public class SumOfPairs {
    public static void main(String[] args) {
        findpairs obj=new findpairs();
        int []arr={4,6,3,5,8,2};
        int x=7;
        int ans = obj.find(arr,x);
        System.out.println("The total number of pairs are "+ans);
    }
}


