package dev.tnordquist;

import java.util.LinkedList;
import java.util.List;

/**
 * (This is a slightly harder version of the fix34 problem.) Return an array that contains exactly
 * the same numbers as the given array, but rearranged so that every 4 is immediately followed by a
 * 5. Do not move the 4's, but every other number may move. The array contains the same number of
 * 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear
 * anywhere in the original array. Ex. {new int[] {9, 4, 5, 4, 5, 9}, new int[] {5, 4, 9, 4, 9, 5}
 */

public class Fix45 {

  public static int[] fix45(int[] nums) {

    List<Integer> fives = new LinkedList<>();

    for (int k = 0; k < nums.length; ++k) {
      if (nums[k] == 5) {
        fives.add(k);
      }
    }

    for (int i = 0; i < nums.length; ++i) {

      if (nums[i] == 4) {
        if(nums[i+1]==5){
        }
        int temp = nums[i + 1];
        nums[i + 1] = nums[fives.get(fives.size()-1)];
        nums[fives.remove(fives.size()-1)] = temp;
      }

    }
    return nums;
  }


}
