package com.huas.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class dddddd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println( findRepeatNumber(a));
    }
    public static int findRepeatNumber(int[] nums) {
        int m = -1;
        for(Integer i=0;i<nums.length;i++){
            if(nums[i]<0 || nums[i]>10000){
                return m;
            }
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if (!set.add(num)) {
                m = num;
                return m;
            }
        }
        return m;
    }
}
