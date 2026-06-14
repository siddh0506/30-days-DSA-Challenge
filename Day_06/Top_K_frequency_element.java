347. Top K Frequent Elements

Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2

Output: [1,2]


Code:
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq= new HashMap<>();
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        List<Integer>[]  bucket = new ArrayList[nums.length+1];
        for(int key : freq.keySet()){
            int frequency = freq.get(key);
            if(bucket[frequency]==null){
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int[] result = new int[k];
        int index = 0;
        for(int i = bucket.length-1;i>=0 && index< k ; i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    result[index++] = num;
                    if(index==k){
                        break;
                    }
                }
            }
        }
        return result;
        }
    }