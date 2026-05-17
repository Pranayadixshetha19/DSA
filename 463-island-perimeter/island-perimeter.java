class Solution {
    public int islandPerimeter(int[][] grid) {
        int iL = 0;
        int n = 0;

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                if(grid[i][j] == 1)
                {
                    iL++;
                    if( i < grid.length - 1 && grid[i+1][j] == 1)
                    {
                        n++;
                    }
                    if(  j < grid[i].length - 1 && grid[i][j+1] == 1)
                    {
                        n++;
                    }
                }
            }
        }
        return iL * 4 - n * 2;
    }
}