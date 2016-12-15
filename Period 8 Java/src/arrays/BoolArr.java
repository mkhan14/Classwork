package arrays;

public class BoolArr {

	private static boolean[][] grid;
	
	public static void main(String[] args) {
		grid = new boolean[5][5];
		printGrid(grid);
		buttonClick(3, 3);
		printGrid(grid);
		buttonClick(3, 3);
		printGrid(grid);
	}
	
	public static void switchRow(boolean[] row, int x){
		//switch row[x-1], row[x], row[x+1] IF THEY EXIST
		for(int i =-1;i < 2; i++){
			if(x+i >= 0 && x +i < row.length)row[x+i]=!row[x+i];
		}
	}
	
	public static void switchColumn(boolean[][] grid, int r, int c){
		//switches ABOVE and BELOW the value in row r and column c
		switchIfValid(grid, r-1, c);
		switchIfValid(grid, r+1, c);
	}
	
	public static void switchIfValid(boolean[][] grid, int r, int c){
		if(r >= 0 && r < grid.length && c >= 0 && c < grid[r].length){
			grid[r][c] = !grid[r][c];
		}
	}
	
	public static void buttonClick(int r, int c) {
		if(r >= 0 && r < grid.length){//technically correct, but not graded
			//specify a specific row
			switchRow(grid[r], c);
		}
		switchColumn(grid, r, c);
		//all above is 1 point, any error = 0 points
		
		//check if a single light is on
		for(int row = 0; row < grid.length; row++){
			for(int col = 0; col < grid[row].length; col++){
				//1 of 2 points
				if(grid[row][col])return; //1 of 2 points
			}
		}
		//check all lights first then say you won
		System.out.println("You have solved the puzzle!");
	}

/*	public static void printArr(boolean[][] 2Darr){
		for(int i = 0; i < 2Darr.length; i++){
			for(int j = 0; j < 2Darr[0].length; j++ ){
				
			}
		}
		System.out.println(arg0);
	}*/
	
	public static void printGrid(boolean[][] grid){
		for(boolean[] row:grid){
			for(boolean b:row){
				if(b)System.out.print("O");
				else System.out.print("X");
			}
			System.out.print("\n");
		}
		System.out.println("- - - - - -");
	}

}
