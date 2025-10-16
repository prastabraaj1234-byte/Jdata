public class arm {

    public static void main(String[] args){
        int num = 153, sum=0, temp=0;
        int real= num;

        while (num != 0){
            temp =num%10;
            sum =sum + (temp*temp*temp);
            num = num/10;   
        }

        if (real ==sum){
            System.out.println( real +" is Armstrong number");
        }
        else{
            System.out.println( real +" is not Armstrong number");
        }   


    }
}