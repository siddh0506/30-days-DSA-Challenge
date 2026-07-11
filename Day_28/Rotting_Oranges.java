/*
994. Rotting Oranges

You are given an m x n grid where each cell can have one of three values:

0 representing an empty cell,
1 representing a fresh orange, or
2 representing a rotten orange.
Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.

 

Example 1:


Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
Output: 4

*/

//Code :

class Solution {

    public int orangesRotting(int[][] grid) {

        Queue<int[]> queue = new LinkedList<>();

        int fresh = 0;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 2)
                    queue.offer(new int[]{i, j});

                else if (grid[i][j] == 1)
                    fresh++;
            }
        }

        if (fresh == 0)
            return 0;

        int minutes = 0;

        int[][] dir = {
                {1,0},
                {-1,0},
                {0,1},
                {0,-1}
        };

        while (!queue.isEmpty()) {

            int size = queue.size();

            boolean rottenThisMinute = false;

            for (int i = 0; i < size; i++) {

                int[] cell = queue.poll();

                int row = cell[0];
                int col = cell[1];

                for (int[] d : dir) {

                    int nr = row + d[0];
                    int nc = col + d[1];

                    if (nr >= 0 &&
                            nc >= 0 &&
                            nr < grid.length &&
                            nc < grid[0].length &&
                            grid[nr][nc] == 1) {

                        grid[nr][nc] = 2;

                        fresh--;

                        queue.offer(new int[]{nr, nc});

                        rottenThisMinute = true;
                    }
                }
            }

            if (rottenThisMinute)
                minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
}