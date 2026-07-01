/*

438. Find All Anagrams in a String

Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

 

Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

*/

//Code :

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(p.length()>s.length())
        return ans;
        int[] pfreq = new int[26];
        int[] window = new int[26];
        for(char ch : p.toCharArray()){
            pfreq[ch - 'a']++;
        }
        int k = p.length();
        for(int right = 0; right < s.length(); right ++){
            window[s.charAt(right)-'a']++;
            if(right >= k){
                window[s.charAt(right-k)-'a']--;
            }
            if(Arrays.equals(pfreq,window)){
                ans.add(right - k + 1);
            }
        }
        return ans;
    }
}