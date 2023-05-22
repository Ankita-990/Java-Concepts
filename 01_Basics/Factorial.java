public class Factorial {
    public static void main(String[] args) {
        
        int num = 6;
        int result = 0;

        result = fact(num);

        System.out.println(result);
    }

    public static int fact(int num) {

        int f = 1;

        for(int i=1; i<=num; i++) {
            f = f * i;
        }
        return f;
    }
}