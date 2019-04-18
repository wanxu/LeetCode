/**
 * @Author: Json Wan
 * Created at: 2019/4/1.
 * Description:
 * 29. Divide Two Integers
 * Medium
 * Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.
 * Return the quotient after dividing dividend by divisor.
 * The integer division should truncate toward zero.
 * Example 1:
 * Input: dividend = 10, divisor = 3
 * Output: 3
 * Example 2:
 * <p>
 * Input: dividend = 7, divisor = -3
 * Output: -2
 * Note:
 * Both dividend and divisor will be 32-bit signed integers.
 * The divisor will never be 0.
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [?231,  231 ? 1]. For the purpose of this problem, assume that your function returns 231 ? 1 when the division result overflows.
 * 思路：
 * 1.题意理解：不准用乘除与取余运算，求32位有符号整数除法的商，若溢出返回2^31-1；
 * 2.除法的本质？减法
 * 3.需要注意0x80000000作为除数与被除数时越界的情况，要注意到x=-x这句话会越界；
 *
 */
public class wanxu_pursue_0029 {

    //利用移位的操作去做，优秀！
    public int bestDivide(int a, int b) {
        int flag = (a ^ b) < 0 ? -1 : 1;
        long res = 0;
        long x = Math.abs((long)a);
        long y = Math.abs((long)b);
        while(x >= y)
        {
            int cnt = 0;
            while(x >= y << cnt)
            {
                res += (1 << cnt);
                x -= y << cnt;
                cnt ++;
            }
        }
        //最后剩下的x是余数
        res *= flag;
        if(res > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        return res < Integer.MIN_VALUE ? Integer.MAX_VALUE : (int)res;
    }

    //AC,0.1616，若不作特殊情况处理直接超时，可见特殊情况的处理还是很重要的！！
    public int divide(int dividend, int divisor) {
        //特殊情况处理
        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }
        if(dividend==Integer.MIN_VALUE&&divisor==-1){
            return Integer.MAX_VALUE;
        }else if(divisor==-1){
            return -dividend;
        }
        if(dividend==divisor){
            return 1;
        }
        if(divisor==1){
            return dividend;
        }
        int result = 0;
        if (dividend < 0 && divisor < 0) {
            while (dividend < 0) {
                dividend -= divisor;
                if (dividend <= 0) {
                    result++;
                }
            }
            return result;
        } else if (dividend < 0) {
            //被除数<0，除数>0的情况
            while (dividend < 0) {
                dividend -= -divisor;
                if (dividend <= 0) {
                    if(result==Integer.MAX_VALUE){
                        return Integer.MIN_VALUE;
                    }
                    result++;
                }
            }
            return -result;
        } else if (divisor < 0) {
            //被除数>0，除数<0的情况
            while (dividend > 0) {
                dividend -= -divisor;
                if (dividend >= 0) {
                    if(result==Integer.MAX_VALUE){
                        return Integer.MIN_VALUE;
                    }
                    result++;
                }
            }
            return -result;
        }else {
            while (dividend > 0) {
                dividend -= divisor;
                if (dividend >= 0) {
                    result++;
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        wanxu_pursue_0029 instance = new wanxu_pursue_0029();
        System.out.println(instance.divide(7, -3) == -2);
        System.out.println(instance.divide(10, 3) == 3);
        System.out.println(instance.divide(-2147483648, 1) == -2147483648);
        System.out.println(instance.divide(-2147483648, -1) == 2147483647);
        System.out.println(instance.divide(2147483647, 1) == 2147483647);
    }
}
