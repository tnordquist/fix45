package dev.tnordquist;

/**
 * (This is a slightly harder version of the fix34 problem.) Return an array that contains exactly
 * the same numbers as the given array, but rearranged so that every 4 is immediately followed by a
 * 5. Do not move the 4's, but every other number may move. The array contains the same number of
 * 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear
 * anywhere in the original array. Ex. {new int[] {9, 4, 5, 4, 5, 9}, new int[] {5, 4, 9, 4, 9, 5}
 */

public class Fix45 {

  public static int[] fix45(int[] nums) {
    int index4 = 0;
    int index5 = 0;
    int k = 0;
    for (int i = 0; i < nums.length; ++i) {

      if (nums[i] != 4) {
        continue;
      } else {
        index4 = i;
      }
      for (int j = k; j < nums.length; ++j) {
        if (nums[j] != 5) {
          continue;
        } else {
          index5 = j;
          k = j;
        }

        if (nums[0] == 5) {
          index5 = 0;
        }
        int temp = nums[index5];
        nums[index5] = nums[index4 + 1];
        nums[index4 + 1] = temp;
      }

    }

    return nums;
  }
}