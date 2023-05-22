public class Fibonacci
{
    public static void main(String args[])
    {
        int value = 0;

        value = fib(8);

        System.out.println(value);

    }

    public static int fib(int pos)
    {

        if(pos == 0)
            return 0;

        if(pos == 1 || pos == 2)
            return 1;

        return fib(pos - 1) + fib(pos - 2);











        // int a = 0;
        // int b = 1;
        // int c = 0;
        // for(int i=2; i<=pos; i++) {
        //     c = a + b;
        //     a = b;
        //     b = c;
        // }
        // return c;
    }
}
