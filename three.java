public class three {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;
        int max;
        if (a >= b) {
            if (a >= c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b >= c) {
                max = b;
            } else {
                max = c;
            }
        }
        System.out.println("Maximum is: " + max);
    }
}