package algorithms;

/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
return indices of two numbers such that their sum is equal to target.
*/

public class IndicesOfTwoMembers {
    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 7, 8};
        int target = 11;

        twoSum(nums, target);
      /*  for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(i + " " + j);
                }
            }
        }*/
    }
}
