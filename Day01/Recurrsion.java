public class Recurrsion
{
    public static void main(String[] args) {
        
        int num = 7;
        int result = 0;

        result = fact(num);

        System.out.println(result);
    }

    public static int fact(int num) {

        if(num == 1)
            return 1;

        return num * fact(num - 1);
        
    }
}