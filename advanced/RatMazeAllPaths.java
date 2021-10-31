package backtracking;

public class RatMazeAllPaths {

	public static void ratMaze(int[][] maze) {
		int n=maze.length;
		int[][] path = new int[n][n];
		printAllPath(maze, 0, 0,path);
	}
	
	public static void printAllPath(int[][] maze,int i,int j,int path[][]) {
		int n= maze.length;
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1 ) {
			System.out.println("No Possible Path");
			return;
		}
//		current pos
		path[i][j]=1;
		
		if(i == n-1 && j == n-1) {
			for(int r=0; r<n; r++) {
				for(int c=0;c<n;c++) {
					System.out.print(path[r][c]+" ");
				}
			System.out.println();
			}
			System.out.println();
			path[i][j]=0;
			return;
		}
//		top
		printAllPath(maze, i-1, j, path);
//		right
		printAllPath(maze, i, j+1, path);
//		down
		printAllPath(maze, i+1, j, path);
//		left
		printAllPath(maze, i, j-1, path);
		path[i][j]=0;
	}
	
	
	public static void main(String[] args) {
		int[][] maze = {{1,1,0},{1,1,0},{1,1,1}};
		ratMaze(maze);
		

	}

}
