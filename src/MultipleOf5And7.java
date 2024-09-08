public class MultipleOf5And7 {
    public static void main(String[] args) {
        int i;
        for( i =1;i<=50;i++)
        {
            if((i%3==0))
            {
                continue;
            }
            System.out.println("The number is : "+i);
        }
    }
}
