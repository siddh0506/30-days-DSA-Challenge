49. Group Anagrams
Medium
Topics
premium lock icon
Companies
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]


Code:
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String Key = new String(chars);
            map.putIfAbsent(Key, new ArrayList<>());
            map.get(Key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}