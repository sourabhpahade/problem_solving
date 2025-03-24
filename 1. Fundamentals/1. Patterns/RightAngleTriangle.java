
public class RightAngleTriangle {
    
    public static void main(String[] args) {
        
        printPattern2(7);
    }

    public static void printPattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    //---------------------------------------------------------------------------------------
    /*
     * Pattern :
     * 
     * 1
     * 7 2
     * 12 8 3
     * 16 13 9 4
     * 19 17 14 10 5
     * 21 20 18 15 11 6
     * 
     */

    public static void printPattern1(int n)
     {
        int x = 1;
        int[][] arr = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            int r = i;
            int c = 0;
            while (r < n) {
                arr[r][c] =  x;
                r++;
                c++;
                x++;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern2(int n)
    {  
       
       int s = 1;
       
       for (int i = 0; i < n; i++) {

           int temp = s;
           int subs = n-i;
           int add = n-i;

           for (int j = 0; j <= i; j++) {
               System.out.print(temp + " ");
               temp = temp - subs;
               subs += 1;
           }
           s += add;
           System.out.println();

       }

    }

    //---------------------------------------------------------------------------------------
}


