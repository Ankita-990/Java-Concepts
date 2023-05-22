// import java.

class Memoiztion
{
    public static void main(String args[])
    {
        int pos = 0;
        int value = 0;

        // static Map<Integer, Integer> cache = new Map<>;

        value = fib(8);
        System.out.println(value);

    }

    public static int fib(int pos)
    {
        if(pos == 0)
            return 0;

        if(pos == 1)
            return 1;

        int result = fib(pos - 1) + fib(pos - 2);
        // cache.put(pos, result);

        return result;
    }
}
