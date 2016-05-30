package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/5/30.
 *
 * Greedy algorithm to get minimum path from beginning to end,
 *
 * Not sure whether it is right, but conform to the answers required, that's why it would be presented here.
 */
public class LeetCode45V2 {

        public int jump(int[] nums) {
            int len = nums.length;
            if (len < 2) {
                return 0;
            }

            int near = 0;
            int far  = 0;
            int reach = 0;
            int jump  = 0;
            for (; reach < len -1; jump ++) {
                for (int i = near; i <= far; i ++) {
                    reach = Math.max(reach, (i + nums[i]));
                }
                near = far + 1;
                far = reach;
            }

            return jump;
        }

}
