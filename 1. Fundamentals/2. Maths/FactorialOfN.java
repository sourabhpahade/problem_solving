public class FactorialOfN {
    
    public static void main(String[] args) {
        
    }


    //iterative solution
    public static int sol1(int n)
    {
        int res = 1;

        for(int i = 2; i <= n; i++){
            res *= i;
        }

        return res;
    }

    // recursive solution
    public static int sol2(int n)
    {
        if(n == 0 || n == 1)
        return 1;

        return n * sol2(n-1);
    }
}
