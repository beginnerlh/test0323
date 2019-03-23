/*
 * 
 * 我们把符合下列属性的数组 A 称作山脉：
A.length >= 3 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。

示例 1：
输入：[0,1,0]
输出：1

示例 2：
输入：[0,2,1,0]
输出：1
*/
package lianxi0323;

public class test0323 {
	public static void main(String[] args) {
		Solution S = new Solution();
		int[] A = new int[] { 0, 1, 2, 4, 3, 2, 1, 0};
		int a = S.peakIndexInMountainArray(A);
		System.out.println(a);
	}
}

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int i = 0;
        int len = A.length - 1;
        while(i < len){
            if(A[i] < A[i+1]){
                i ++;
            }
            if(A[len] < A[len-1]){
                len --;
            }
            if(i == len){
                break;
            }
        }
        return i;
    }
}
