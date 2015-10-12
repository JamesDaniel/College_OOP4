package lab5;

public class BinarySearchDemo
{
   public static void main(String[] args)
   {
        int[] list = {4, 6, 7, 10, 12, 13};

        int index = binarySearch(list, 6);
        //System.out.println("6 was found at position " + index);
        int answer = myPowRecursive(5,3);
        System.out.println("5 to the power of 3 is " + answer);
           
                
    }	

   // Binary search
   public static int binarySearch( int array[], int key ) 
   {
      int low = 0;                  // low subscript
      int high = array.length - 1;  // high subscript
      int middle;                   // middle subscript

      while ( low <= high ) {
         middle = ( low + high ) / 2;

         if ( key == array[ middle ] )  // match
            return middle;
         else if ( key < array[ middle ] )
            high = middle - 1;  // search low end of array
         else
            low = middle + 1;   // search high end of array
      }

      return -1;   // searchKey not found
   }
   /*
   * IF y == 0
   *     return x * x
   * ELSE
   *     return x * myPowRecursive(x, y-1)
   */
   public static int myPowRecursive(int x, int y)
   {
       if (y == 0)
       {
           return 1;
       }
       else
       {
           return x * myPowRecursive(x, y-1);
       }
   }
}