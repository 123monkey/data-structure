package leetcode_algorithm.Length_Of_Last_Word;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * <p>
 * For example,
 * Given s = "Hello World",
 * return 5.
 */

public class Solution {


    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("Hello World"));
    }

    /**
     * ���˽ⷨ
     *
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        String[] results = s.trim().split(" ");
        return results[results.length - 1].length();
    }


    /**
     * �Ƽ��ⷨ
     *
     * @param s
     * @return
     */
    public int lengthOfLastWord2(String s) {
        s = s.trim();
        int lastIndex = s.lastIndexOf(' ') + 1;
        return s.length() - lastIndex;
    }
}
