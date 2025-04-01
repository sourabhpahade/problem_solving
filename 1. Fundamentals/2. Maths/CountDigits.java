
public class CountDigits {

    public static void main(String[] args) {
        System.out.println(solution1(1));
    }

    // solution 1 
    // time complexity : theta(d) ; d = no. of digits
    public static int solution1(int n)
    {
        if(n >= -9 && n <= 9) return 1;

        int res = 0;
        
        // traversing through digits of n
        while(n>0) {
            n = n/10;
            res++;
        }

        return res;
    }


    // Variation of Count Digits.
    // Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder).
    //  Return the total number of such digits.
    // A digit d of n divides n evenly if the remainder when n is divided by d is 0 (n % d == 0).
    // Digits of n should be checked individually. If a digit is 0, it should be ignored because division by 0 is undefined.

    static int evenlyDivides(int n) {
       
        int res = 0;
        int t = n;
        
        while(t>0) {
            int l = t%10;
            t = t/10;
            
            if(l!=0 && n%l==0)
            res++;
        }

        return res;
    }

}