import java.util.List;

/**
 * @Author: Json Wan
 * Created at: 2019/3/13.
 * Description:
 * 22. Generate Parentheses
Medium
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
For example, given n = 3, a solution set is:
[
"((()))",
"(()())",
"(())()",
"()(())",
"()()()"
]
 思路：
 1.最简单的思路：从所有的组合中过滤出合适的即可，C(2n,n)，复杂度n!；
 2.
 */
public class wanxu_pursue_0022 {

    public List<String> generateParenthesis(int n) {

    }

    public static void main(String[] args) {
        wanxu_pursue_0022 instance=new wanxu_pursue_0022();
        System.out.println(instance.generateParenthesis(1));
        System.out.println(instance.generateParenthesis(2));
        System.out.println(instance.generateParenthesis(3));
        System.out.println(instance.generateParenthesis(4));
    }
}
