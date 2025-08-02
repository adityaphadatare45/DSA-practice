
import java.util.Arrays;


public class Largeelement{
    public static void main(String[] args) {
        int arr [] = {1,3,4,5,6,7};
        System.out.println("Largest element in array is : "+ sort(arr));
        System.out.println("Largest element in array is : "+ findLargestElement(arr));
    }
     // Brute force approach.
     static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length - 1];
     }
     // optimal approach.
    static int findLargestElement(int arr[]){
         int max = arr[0];
          for (int i = 0; i < arr.length; i++) {
              if(arr[i]> max){
                max = arr[i];
            }
          }
          return  max;
    }
}