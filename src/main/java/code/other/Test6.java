package code.other;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test6 {
    //单词拆分
    public static boolean wordBreak(String s, List<String> wordDict) {

        Set<String> wordDictSet = new HashSet(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                // substring()
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];





    }

    public static void main(String[] args) {
        List<String> dict = Arrays.asList("cats","dog","sand","and","cat");
        System.out.println(wordBreak("catsandog", dict));
    }

}
