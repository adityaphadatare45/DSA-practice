
import java.util.HashMap;

class Twosum{

    // Better approach using hashing.
    public  int[] two_sum( int[] nums, int  target){
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int moreNeeded = target - num;
            if(mpp.containsKey(moreNeeded)){
                return new int[]{mpp.get(moreNeeded), i};
            }
            mpp.put(num,i);
        }
        return new int[]{-1 ,-1};
    }
     // Optimal approach using two-pointer
     
    public static void main(String[] args) {
        int[] nums = {2,6,5,8,11};
        int target = 14;
        
        int[] result = new Twosum().two_sum(nums, target);
        System.out.println("This is the answer for indices: " + result[0] + " and " + result[1]);

    }   
}