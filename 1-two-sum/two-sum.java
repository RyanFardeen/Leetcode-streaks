class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] arr = new int[2];
        int rem;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i=0; i < nums.length; i++) {
            // int num = nums[i];
            // if(nums[i] <= target) {
                // int rem = target - nums[i];
                // if(nums[i] < 0) {
                //     rem = target - (nums[i] * -1);
                // }
                // else{
                    rem = (nums[i] < 0) ? (target - (nums[i])) : (target - nums[i]);
                // }
                if(mpp.containsKey(rem)) {
                    arr[0] = i;
                    arr[1] = mpp.get(rem);
                    return arr;
                }
            // }
            mpp.put(nums[i], i);
        }
        return arr;
    }
}

// import java.util.*;
// class Solution {
//     public int[] twoSum(int[] arr, int target) {
//         int n = arr.length;

//         int[][] numsWithIndex = new int[n][2];

//         for(int i=0; i<n; i++) {
//             numsWithIndex[i][0] = arr[i];
//             numsWithIndex[i][1] = i;
//         }


//         Arrays.sort(numsWithIndex, (a,b) -> Integer.compare(a[0], b[0]));

//         int left = 0 , right = n-1;

//         while(left < right) {
//             int total = numsWithIndex[left][0] + numsWithIndex[right][0];
            
//             if(total == target) {
//                 return new int[] {numsWithIndex[left][1], numsWithIndex[right][1]};
//             }

//             else if(total < target) {
//                 left++;
//             }
//             else {
//                 right--;
//             }
//         }

//         return new int[] { -1, -1 };
//     }
// }