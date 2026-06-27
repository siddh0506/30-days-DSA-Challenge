/*

933. Number of Recent Calls

You have a RecentCounter class which counts the number of recent requests within a certain time frame.

Implement the RecentCounter class:

RecentCounter() Initializes the counter with zero recent requests.
int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number of requests that has happened in the past 3000 milliseconds (including the new request). Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.

 

Example 1:

Input
["RecentCounter", "ping", "ping", "ping", "ping"]
[[], [1], [100], [3001], [3002]]
Output
[null, 1, 2, 3, 3]

*/

//CODE:

class RecentCounter {
     Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<>();

    }
    
    public int ping(int t) {
       queue.offer(t);
       while(queue.peek()<t-3000){
        queue.poll();
       }
       return queue.size();
    }
}