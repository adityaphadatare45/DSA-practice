class Recursivebinary{
    static int binary_search( int [] nums , int target){
         int n = nums.length;
         int low = 0, high = n -1;
        return  -1;
    }
    public static void main(String[] args) {
        int [] nums = { 3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int index = binary_search(nums, target);
         if(index == -1 ){
          System.out.println(" The target is not present"); 
         }else {
           System.out.println("The target is at index : " + index);
        }
    }
}