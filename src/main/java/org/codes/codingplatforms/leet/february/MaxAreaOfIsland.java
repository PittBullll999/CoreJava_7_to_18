package org.codes.codingplatforms.leet.february;

public class MaxAreaOfIsland {
    public static void main(String[] args) {
        int t[][]=new int[][]{{0,1,1},{0,1,1},{0,0,1}};
        MaxAreaOfIsland m=new MaxAreaOfIsland();
        System.out.println(m.maxAreaOfIsland(t));


    }
    int maxarea=0;
    public int maxAreaOfIsland(int[][] grid) {
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                calcArea(grid,i,j);
            }
        }
        return maxarea;

    }
    private int calcArea(int[][] grid,int i,int j)
    {
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]!=1)
        {
            return 0;
        }
        else {
            grid[i][j]=2;
            int t=calcArea(grid,i+1,j);
            int l=calcArea(grid,i-1,j);
            int u=calcArea(grid,i,j+1);
            int d=calcArea(grid,i,j-1);
            int area=1+u+d+l+t;
            if(area>maxarea)
            {
                maxarea=area;
            }
            return (area);
        }
    }
}
