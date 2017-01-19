package leetcode_algorithm.Count_And_Say;

/**
 *
     The count-and-say sequence is the sequence of integers beginning as follows:
     1, 11, 21, 1211, 111221, ...

     1 is read off as "one 1" or 11.
     11 is read off as "two 1s" or 21.
     21 is read off as "one 2, then one 1" or 1211.
     Given an integer n, generate the nth sequence.

 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().countAndSay(1));
        System.out.println(new Solution().countAndSay(2));
        System.out.println(new Solution().countAndSay(3));
        System.out.println(new Solution().countAndSay(4));
        System.out.println(new Solution().countAndSay(5));
        System.out.println(new Solution().countAndSay(11));
    }

    /**
     * ���˽ⷨ
     * @param n
     * @return
     */
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String prev = countAndSay(n - 1);
        StringBuilder sb =new StringBuilder();
        int count = 1;
        char prevNum = prev.charAt(0);
        for(int i = 1; i < prev.length(); ++i) {
            char curNum = prev.charAt(i);
            if (curNum == prevNum) {
                ++count;
            }else {
                sb.append(count);
                sb.append(prevNum);
                count = 1;
            }
            prevNum = curNum;
        }
        sb.append(count);
        sb.append(prevNum);
        return sb.toString();
    }

}
