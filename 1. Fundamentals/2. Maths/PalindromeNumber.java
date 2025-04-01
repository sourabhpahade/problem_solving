public class PalindromeNumber {
    
    public static void main(String[] args) {
        
        System.out.println(solution1(10));
    }

    // bruteforce
    // logic :  Will reverse the number, if given number == reverse number, then true (palindrome)
    // time complexity : theta(no. of digits), space complexity : size of n
    public static boolean solution1(int n)
    {

        int reverse = 0;
        int temp = n;

        while(temp > 0)
        {   
            reverse = (reverse*10) + (temp%10);
            temp /= 10;
        }

        return reverse == n;
    }

    // Better approach 
    // if it is a palindrome number, sum of 1st half ==  2nd half
    public static boolean solution2(int n)
    {
        int secondHalf = 0;
        int temp = n;

        while(temp > 0) 
        {
            secondHalf += (secondHalf*10) + (temp%10);
        }
        return true;
    }

}
