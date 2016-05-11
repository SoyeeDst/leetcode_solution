package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/5/11.
 */
public class LeetCode4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        return find_med(nums1, 0, len1 - 1, nums2, 0, len2 - 1);
    }

    double find_med(int[] nums1, int start1, int end1, int[] nums2, int start2,
                    int end2) {
        if (end1 < start1 && end2 < start2) {
            return 0;
        } else if (end1 == start1 && end2 == start2) {
            return (double) (nums1[start1] + nums2[start2]) / 2;
        } else if (end1 >= start1 && end2 < start2) {
            return (end1 + start1) % 2 == 0 ? nums1[(end1 + start1) / 2]
                    : (double) (nums1[(end1 + start1) / 2] + nums1[(end1 + start1) / 2 + 1]) / 2;
        } else if (end1 < start1 && end2 >= start2) {
            return (end2 + start2) % 2 == 0 ? nums2[(end2 + start2) / 2]
                    : (double) (nums2[(end2 + start2) / 2] + nums2[(end2 + start2) / 2 + 1]) / 2;
        } else {
            if (nums1[start1] >= nums2[start2]) {
                if (nums1[end1] <= nums2[end2]) {
                    return find_med(nums1, start1, end1, nums2, start2 + 1,
                            end2 - 1);
                } else {
                    return find_med(nums1, start1, end1 - 1, nums2, start2 + 1,
                            end2);
                }
            } else {
                if (nums1[end1] <= nums2[end2]) {
                    return find_med(nums1, start1 + 1, end1, nums2, start2,
                            end2 - 1);
                } else {
                    return find_med(nums1, start1 + 1, end1 - 1, nums2, start2,
                            end2);
                }
            }
        }
    }

}
