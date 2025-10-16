public class perfect {
    public static void main(String[] args){
        int num = 10, sum =0, i=1;

        for(i=1; i<num; i++){
            if(num%i==0){
                sum = sum + i;
            }
        }

        if(sum==num){
            System.out.println(num + " is a perfect number");
        }
        else{
            System.out.println(num + " is not a perfect number");
        }
    }
}

// for loop works exax=ctly like while loop but with less lines of code the only difference is the syntax and the way of writing it
