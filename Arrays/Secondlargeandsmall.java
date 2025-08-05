 public class Secondlargeandsmall{

     // Second smallest
     static int secondSmallest(int []arr, int n){
      if(n < 2){
        return  -1;
      }
      int small = Integer.MAX_VALUE;
      int second_Small = Integer.MAX_VALUE;
       for (int i = 0; i < n; i++) {
           if(arr[i]< small){
            second_Small = small;
            small = arr[i];
          }else if (arr[i] < second_Small && arr[i] != small){
            second_Small = arr[i];
          }
       }
       return second_Small;
     }
     // Second largest

    static int secondLargest(int [] arr, int n){
      if(n<2){
        return -1;
      }
      int largest = Integer.MIN_VALUE;
      int second_Largest = Integer.MIN_VALUE;

      for (int i = 0; i < n; i++) {
        if(arr[i]> largest){
         second_Largest = largest;
         largest = arr[i];
        } else if( arr[i] > second_Largest && arr[i] != largest){
          second_Largest = arr[i];
        }         
      }
      return second_Largest;
   }

   public static void main(String[] args) {
       int [] arr = {1,3,4,5,7,7};
       int n = arr.length;

       int secondSmall = secondSmallest(arr, n);
       int secondLarge = secondLargest(arr, n);

       System.out.println("Second smallest is :" + secondSmall);
       System.out.println("Second smallest is :" + secondLarge);
   }
}