/*
997. Find the Town Judge

In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi. If a trust relationship does not exist in trust array, then such a trust relationship does not exist.

Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.

 

Example 1:

Input: n = 2, trust = [[1,2]]
Output: 2

*/

//Code :

class Solution {
    public int findJudge(int n, int[][] trust) {
       int[] indegree = new int[n+1];
       int[] outdegree = new int[n+1];
       for(int[] edge : trust){
        int a = edge[0];
        int b = edge[1];
        outdegree[a]++;
        indegree[b]++;
       } 
       for(int i = 1; i<= n ; i++){
        if(indegree[i]==n-1 && outdegree[i]==0)
        return i;
       }
       return -1;
    }
}