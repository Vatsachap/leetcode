package org.example;

public class MinOperations {
        public int minOperations(int[] nums) {
            int ops=0,n=nums.length;
            for(int i=0;i<=n-3;i++){
                if(nums[i]==0){
                    nums[i] ^=1;
                    nums[i+1] ^=1;
                    nums[i+2] ^=1;
                    ops++;
                }
            }
            for(int num:nums){
                if(num==0){
                    return -1;
                }
            }
            return ops;
        }

}

