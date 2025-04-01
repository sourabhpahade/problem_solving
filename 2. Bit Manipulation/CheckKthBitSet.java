
public class CheckKthBitSet {

    public static void main(String[] args) {
        
    }
    
    //Check kth bit set or not : Ex n = 5 --> 0101 if k=1 => ans. is True as 1st bit is set.

    //Approach 1 : To check if the 1st bit set or not we can find by (n&1) != 0, 
    //so to find kth bit set or not we just need to shift the 1st bit to the kth position
    //we can do this by using a loop  by iterating from 0 to k-1 and finding kth bit set by n&(2^(k-1)).
    //Same way we can shift (1<<(k-1)) to get kth set bit and then do n&(1<<(k-1)).

    public static boolean sol1(int n, int k)
    {
        if((n & (1 << (k-1))) != 0) {
            return true;
        }

        return false;
    }

    //Approach 2 : Same way we can right shift kth bit of n to the 1st bit.

    public static boolean sol2(int n, int k)
    {
        if(((n >> (k-1)) & 1) != 0) {
            return true;
        }

        return false;
    }

    
}