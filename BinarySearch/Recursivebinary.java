class Recursivebinary{
    static int binary_search( int [] nums , int target ,int low, int high){
        // int n = nums.length;
         // int low = 0, high = n -1;

         if(low > high){
            return  -1;
         }

         int mid = (low + high)/2;

         if(nums[mid] == target){
            return mid;
         } else if(target> nums[mid]){
            return binary_search(nums, target, mid + 1, high);
         }else{
          return binary_search(nums, target, low, mid - 1);
        }
    }
    public static void main(String[] args) {
        int [] nums = { 3, 4, 6, 7, 9, 12, 16, 17};
        int target = 16;
        int low = 0;
        int high = nums.length - 1;
        int index = binary_search(nums, target, low, high);
         if(index == -1 ){
          System.out.println(" The target is not present"); 
         }else {
           System.out.println("The target is at index : " + index);
        }
    }
}