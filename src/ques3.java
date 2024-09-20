public class ques3 {
    public static void main(String[] args) {
        int arr[]={1,5,3};
        int x=5;
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                index=i;
            }
        }
        System.out.println("the index value of"+x+"is "+index);
    }
}
