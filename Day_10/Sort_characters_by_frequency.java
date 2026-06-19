451. Sort Characters By Frequency

Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.

 

Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.


Code:

class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        StringBuilder result = new StringBuilder();
        while(!pq.isEmpty()){
            char ch =pq.poll();
            int freq = map.get(ch);
            for(int i=0;i<freq;i++){
                result.append(ch);
            }
        }
        return result.toString();
    }
}