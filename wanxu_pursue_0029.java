/**
 * @Author: Json Wan
 * Created at: 2019/4/1.
 * Description:
 * 29. Divide Two Integers
Medium
Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.
Return the quotient after dividing dividend by divisor.
The integer division should truncate toward zero.
Example 1:
Input: dividend = 10, divisor = 3
Output: 3
Example 2:

Input: dividend = 7, divisor = -3
Output: -2
Note:
Both dividend and divisor will be 32-bit signed integers.
The divisor will never be 0.
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [?231,  231 ? 1]. For the purpose of this problem, assume that your function returns 231 ? 1 when the division result overflows.
 思路：
 1.题意理解：不准用乘除与取余运算，求32位有符号整数除法的商，若溢出返回2^31-1；
 2.
 */
public class wanxu_pursue_0029 {

    public int divide(int dividend, int divisor) {

        return 0;
    }

    public static void main(String[] args) {
        wanxu_pursue_0029 instance=new wanxu_pursue_0029();
        System.out.println(instance.divide(10,3)==3);
        System.out.println(instance.divide(7,-3)==-2);
    }
}
