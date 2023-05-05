package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {

    }

    public double FindMedianSortedArrays(int[] nums1, int[] nums2) {
        var ls = new ArrayList<Integer>();

        for (var number: nums1) {
            ls.add(number);
        }
        for (var number: nums2) {
            ls.add(number);
        }

        Collections.sort(ls);
        double res;

        if(ls.size() % 2 == 0){
            var indice1 = (ls.size() / 2) - 1;
            var indice2 = ls.size() / 2;
            res = (double) (ls.get(indice1) + ls.get(indice2)) / 2;
        }else{
            var indice = ls.size() / 2;
            res = ls.get(indice);
        }
        return res;
    }
}

/*
    Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

    The overall run time complexity should be O(log (m+n)).

    Example 1:

    Input: nums1 = [1,3], nums2 = [2]
    Output: 2.00000
    Explanation: merged array = [1,2,3] and median is 2.

    Example 2:

    Input: nums1 = [1,2], nums2 = [3,4]
    Output: 2.50000
    Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */
