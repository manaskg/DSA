class Solution {
    public int triangleNumber(int[] nums) {

        // Two-pointers

        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;

        // for(int i = 0; i < n - 2; i++){
        //     for (int j = i + 1; j < n-1; j++){
        //         for (int k = j + 1; k < n; k++){
        //             if(nums[i]+nums[j]>nums[k]){
        //                 count++;
        //             }
        //         }
        //     }
        // }

        // return count;

        for (int k = n - 1; k >= 2; k--) {
            int i = 0;
            int j = k-1;
            while(i<j) {
                int sum = nums[i] + nums[j];
                if (sum>nums[k])
                {
                    count += (j-i);
                    j--;
                }
                else {
                    i++;
                }
            }
        }

        return count;
    }
}