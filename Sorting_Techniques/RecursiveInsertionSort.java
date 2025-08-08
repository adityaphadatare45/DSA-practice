public class RecursiveInsertionSort{
    static void insertion_sort(int [] nums, int n, int i){

        // Base condition
       if(i == n) {
        return;
       }    
       int j = i;   

       while(j>0 && nums[j-1] > nums[j]){
        int temp = nums[j-1];
        nums [j-1] = nums[j];
        nums [j] = temp;
        j--;
       } 
       insertion_sort(nums, n, i + 1 );
    }
    public static void main(String[] args) {
        int [] nums = {13, 46, 24, 52, 20, 9};
        int n = nums.length;
         System.out.println("Before recursive insertion sort : ");
          for (int i = 0; i < n; i++) {
              System.out.println(nums[i] + " ");
          }
          System.out.println();
          insertion_sort(nums, n, 0);
          System.out.println("After recursive insertion sort : ");
          for (int i = 0; i < n; i++) {
              System.out.println(nums[i] + " ");
          }
        System.out.println();
    }
}