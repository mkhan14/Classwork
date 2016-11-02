package caveExplorer;

import java.util.Arrays;

public class TwoDArraysIntro {

	public static void main(String[] args) {
		
		boolean[][] mines = new boolean[6][6];
		plantMines(mines);
		String[][] field = createField(mines);
		printPic(field);
	}
	
	private static String[][] createField(boolean[][] mines) {
		String[][] field = new String[mines.length][mines[0].length];
		for(int row = 0; row < field.length; row++){
			for(int col = 0; col < field[row].length; col++){
				if(mines[row][col])field[row][col]="X";
				else{
					field[row][col] = countNearby(mines, row, col);
				}
			}
		}
		return field;
	}

	private static String countNearby(boolean[][] mines, int row, int col) {
		//arraysoutofboundsindex ap exam obsessed
		for(int r = row - 1; r <= row + 1; r ++){
			for(int c = col - 1; c <= col+1; c++){
				//check that this element exists
				//check if its in the bounds of the arrays
				if(r>=0 && r < mines.length && c >= 0 && c < mines[0].length){
					
				}
			}
		}
	}

	private static void plantMines(boolean[][] mines) {
		int numberOfMines = 10;
		while(numberOfMines > 0){
			int row = (int)(Math.random() * mines.length);
			int col = (int)(Math.random() * mines[0].length);
			//this prevents the same mine being selected twice
//			while(mines[row][col]){
//				int row = (int)(Math.random() * mines.length);
//				int col = (int)(Math.random() * mines[0].length);
//			}
			if(!mines[row][col]){
				mines[row][col] = true;
				numberOfMines--;
			}
		}
		
	}

	public static void other(){
		String [][] pic = new String [10][8];
		for(int row = 0; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = " ";
			}
		}
		//sun
		pic[1][3] = "O";
		pic[0][3] = "|";
		pic[2][3] = "|";
		pic[1][2] = "-";
		pic[1][4] = "-";
		pic[(int) (Math.random()* 5)][(int) (Math.random()* 5)] = "<(o.o)>";
		
		//grassy field
		for(int row = 5; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = "w";
			}
		}
		//top row and bottom row should be an underscore
		for(int col = 0; col < pic[0].length; col++){
			pic[0][col] = "_";
			pic[pic.length - 1][col] = "_";
		}
		
		for(int row = 1; row < pic.length; row++){
			pic[row][0] = "|";
			pic[row][pic[0].length - 1] = "|";
		}
	}
	
	public static void printPic(String[][] pic){
			for(String[] row: pic){
				for(String col: row){
					System.out.print(col);
				}
				System.out.println();
			}
		}
	
	public static void intro(){
		String[] xox = {"x", "o", "x", "o", "x"};
		System.out.println(Arrays.toString(xox));
		//a 1D array prints a horizontal string
		
		String[][] arr2D = new String[5][4];
				//length of 2d array is 5
				//the length of each array in this 2d array is 4
		System.out.println("The height is "+arr2D.length);
		System.out.println("The width is "+arr2D[0].length);
		for(int row = 0; row < arr2D.length; row++){
			
			//populate with coordinates
			for(int col = 0; col < arr2D[row].length; col++){
				arr2D[row][col] = "("+row+", "+col+")";
			}
		}
		
		//print the 2D array
		//Every element in a 2D array IS itself an array
		//so a for-each loop looks like this:
		for(String[] row: arr2D){
			System.out.println(Arrays.toString(row));
		}
		//caveRoom[] borderingRooms;
		//Door[] doors;
		//door open locked
		//[null, null, (1,4), (0,3)]
		//string: description, directions, content
		//controls
		//inventory of objects like water backpack etc.
		//String map
		//one codes caves-connect doors one codes map-how print it out
	}

}
