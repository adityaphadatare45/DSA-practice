/* Problem Statement : Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, 
she eats all of them instead and will not eat any more bananas during this hour.Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours.

Test cases : 

Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:

Input: piles = [30,11,23,4,20], h = 5
Output: 30
Example 3:

Input: piles = [30,11,23,4,20], h = 6
Output: 23

/// Answer :

Step 1 : First find the largest element in the array, this will decide the max banana's that can koko eat's in 1 hrs.
         ... here max can be in between range of the array 
         
Step 2 : Find the total hours it can take to complete the task.
         where h = given no. of hrs to complte the task 
         ... here we need to find totalHrs less than h, to complete the task.

Step 3 : In this step do binary search and find out the answer.
        ... here ans = high
         
*/


class KokoEats{
   
   // To find out the max element
   public static int maxElement(int [] piles){
    int max = 0;
     for (int pile : piles) {
         if(pile > max){
            max = pile;
         }
     }
    return max;
   }

   // To find out the hourly rate.

   public static int totalHrs(int [] piles, int hours){
     int totalhrs = 0;

     for(int pile : piles){
       totalhrs += Math.ceil((double)pile/ hours);
    }
    return totalhrs;
   }

   // To finad out the minimum eating speed.

   public static int  mineatingSpeed(int []piles, int h){
    int low = 0, high = maxElement(piles);
    int ans = high;

    while(low <= high){
        int mid = (low + high)/ 2;
        int totalhrs = totalHrs(piles, mid);

        if(totalhrs <= h){
            ans = mid ;
            high = mid -1;
        }else{
            low = mid +1;
        }
    }
    return ans;
   }

   public static void main(String[] args) {
        int[] piles = {7, 15, 6, 3};
        int h = 8;
        int ans = mineatingSpeed(piles, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
}