public class control {
    public static void main(String[] args) {
        
        int num = -5;
        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println("Number is zero.");
        }

        int age = 20;
        if (age >= 0) {
            if (age < 13) {
                System.out.println("Child");
            } else if (age <= 19) {
                System.out.println("Teenager");
            } else {
                System.out.println("Adult");
            }
        } else {
            System.out.println("Invalid age.");
        }
    }
}