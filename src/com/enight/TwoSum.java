package com.enight;

import java.util.HashMap;

/**
 *  Given an array of integers, return indices of the two numbers such that they add up to a specific target.

	You may assume that each input would have exactly one solution.
	
	Example:
	
	Given nums = [2, 7, 11, 15], target = 9,
	
	Because nums[0] + nums[1] = 2 + 7 = 9,
	
	return [0, 1].
	
	UPDATE (2016/2/13):
	
	The return format had been changed to zero-based indices. Please read the above updated description carefully.
 * 
 *  @author apple
 *
 */

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 12, 7, 15};
		int target = 9;
		TwoSum t = new TwoSum();
		for (int i : t.twoSum(nums,target)) {
			System.out.println(i);
		}
	}
	
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] result = {0,0};
        for(int i=0;i<=nums.length;i++){
            if(map.get(nums[i])!=null){
                int[] res = {map.get(nums[i]),i};
                return res;
            }
            map.put(target-nums[i],i);
        }
        return result;
    }

}
