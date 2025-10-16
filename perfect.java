public class perfect {
    public static void main(String[] args){
        int num = 10, sum =0, i=1;

        while(i<num){
            if(num%i==0){
                sum = sum + i;
            }
            i++;
        }

        if(sum==num){
            System.out.println(num + " is a perfect number");
        }
        else{
            System.out.println(num + " is not a perfect number");
        }
    }
}
