
public class TrianglePattern {
    public static void main(String[] args) {

        printPattern4(8);
    }

    //---------------------------------------------------------------------------
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *
     
    public static void printPattern1(int n) {

        // getting row count
        int x = 2 * n - 1;

        for (int i = 1; i <= x; i++) {

            //getting star count
            int y = i;

            if (i > n) {
                y = n - (i % n);
            }
            
            // printing stars
            for (int j = 1; j <= y; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
    
    //---------------------------------------------------------------------------  

        //      *
        //     ***
        //    *****
        //   *******
        //  *********

     public static void printPattern2(int n) {
         

         for (int i = 1; i <= n; i++) {

            // printing spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // getting star count
            int s = i;
            if(i > 1) s += (i-1);

            // printing stars
            for (int k = 1; k <= s; k++) {
                System.out.print("*");
            }

            System.out.println();

         }
    }

    //---------------------------------------------------------------------------  

        // *********
        //  *******
        //   *****
        //    ***
        //     *

        public static void printPattern3(int n) {
         

            for (int i = n; i >= 1; i--) {
   
               // printing spaces
               for (int j = 1; j <= n-i; j++) {
                   System.out.print(" ");
               }
   
               // getting star count
               int s = i;
               if(i > 1) s += (i-1);
   
               // printing stars
               for (int k = 1; k <= s; k++) {
                   System.out.print("*");
               }
   
                System.out.println();
   
            }

     }

    //---------------------------------------------------------------------------
    //      *
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *
    public static void printPattern4(int n) {
         

        for (int i = 1; i <= n; i++) {

           // printing spaces
           for (int j = 1; j <= n-i; j++) { 
               System.out.print(" ");
           }

           // getting star count
           int s = i;
           if(i > 1) s += (i-1);

           // printing stars
           for (int k = 1; k <= s; k++) {
               if(k%2 != 0)
               {
                 System.out.print("*");
               }
               else 
               {
                 System.out.print(" ");
               }
               
               
           }

            System.out.println();

        }

 }


}