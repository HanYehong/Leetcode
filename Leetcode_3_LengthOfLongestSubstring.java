import java.util.HashMap;
import java.util.Map;

/**
 * @author HanYehong
 *
 * @date 2019.1.1
 */

/**
 * @description
 *
 * 给定一个字符串，请找出其中不含有重复字符的最长子串的长度。
 */

public class Leetcode_3_LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int len = s.length(), maxSubLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0, i = 0; j < len; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i); //判断map.get(...)是否在i-j范围内
            }
            maxSubLen = Math.max(maxSubLen, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return maxSubLen;
    }

}
