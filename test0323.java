/*
 * 
 * ���ǰѷ����������Ե����� A ����ɽ����
A.length >= 3 ���� 0 < i < A.length - 1 ʹ��A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
����һ��ȷ��Ϊɽ�������飬�����κ����� A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] �� i ��ֵ��

ʾ�� 1��
���룺[0,1,0]
�����1

ʾ�� 2��
���룺[0,2,1,0]
�����1
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
