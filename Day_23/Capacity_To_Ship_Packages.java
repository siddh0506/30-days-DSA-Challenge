/*
1011. Capacity To Ship Packages Within D Days
Medium
Topics
premium lock icon
Companies
Hint
A conveyor belt has packages that must be shipped from one port to another within days days.

The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.

 

Example 1:

Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
Output: 15

*/

// Code :

class Solution {

    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        for (int weight : weights) {

            low = Math.max(low, weight);
            high += weight;
        }

        int answer = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int requiredDays = 1;
            int currentWeight = 0;

            for (int weight : weights) {

                if (currentWeight + weight > mid) {

                    requiredDays++;
                    currentWeight = 0;
                }

                currentWeight += weight;
            }

            if (requiredDays <= days) {

                answer = mid;
                high = mid - 1;

            } else {

                low = mid + 1;
            }
        }

        return answer;
    }
}