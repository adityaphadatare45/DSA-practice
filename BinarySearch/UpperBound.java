class UpperBound{
    static int upper_bound( int [] nums, int x){
        int n = nums.length;
        int ans = n;
        int low = 0, high = n-1;

        while(low <= high){
        int mid = (low + high)/ 2;

        if (nums[mid] > x) {
            ans = mid;
            high = mid -1 ;
        }else{
         low = mid + 1;
        }
      }
        return ans;
    }
     public static void main(String[] args) {
        int [] nums ={3,4,5,6,7,8,9,10};
        int x = 8;
        
        int ind = upper_bound(nums, x);

        System.out.println("The lower bound is the index : " + ind);
    }
}