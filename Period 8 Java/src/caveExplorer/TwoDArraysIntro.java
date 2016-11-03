package caveExplorer;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArraysIntro {

	public static Scanner in = new Scanner(System.in);
	static String[][] arr2D;
	static String[][] pic;
	static int starti;
	static int startj;
	static int treasurei;
	static int treasurej;
	
	public static void main(String[] args) {
		arr2D = new String[5][5];
		pic = new String[5][5];
		for(int row = 0; row < arr2D.length; row++){
			//populate with coordinates
			for(int col = 0; col < arr2D[row].length; col++){
				arr2D[row][col] = "("+row+", "+col+")";
			}
		}
		
		starti = 2;
		startj = 2;
		treasurei = 4;
		treasurej = 3;
		startExploring();
	}
	
	private static void startExploring() {
		while(true){
			printPic(pic);
			//as you move make x move
			//prints description of rooms
			System.out.println("You are in room"+arr2D[starti][startj]+".");
			if(starti == treasurei && startj == treasurej){
				break;
			}
			System.out.println("What do you want to do?");
			String input = in.nextLine();
			
			int[] newCoordinates = interpretInput(input);
			starti = newCoordinates[0];
			startj = newCoordinates[1];
			
			for(row = 0; row < arr2D.length)
				//then make col for loop, then if mine[row][col] then field[row][col
		}
		
	}

	private static int[] interpretInput(String input) {
		//verify input is valid
		while(!isValid(input)){
			System.out.println("Sorry, in this game, you can only use the w, a, s, d controls.");
			System.out.println("Tell me again what you would like to do.");
			input = in.nextLine();
		}
		int currenti = starti;
		int currentj = startj;
		input = input.toLowerCase();
		if(input.equals("w")){
			currenti--;
		}
		if(input.equals("s")){
			currenti++;
		}
		if(input.equals("a")){
			currentj--;
		}
		if(input.equals("d")){
			currentj++;
		}
		int[] newCoordinates = {starti, startj};
		if(currenti >= 0 && currenti < arr2D.length && currentj >= 0 && currentj < arr2D[0].length){
			newCoordinates[0] = currenti;
			newCoordinates[1] = currentj;
		}else{
			System.out.println("Sorry, you have reached the endge of the known universe. You may go no fartehr in that "
			+ "direction");
		}
		return newCoordinates;
	}

	private static boolean isValid(String input) {
		String[] validKeys = {"w", "a", "s", "d"};
		for(String key: validKeys){
			if(input.toLowerCase().equals(key)){
				return true;
			}
		}
		return false;
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
	
	public static void mines(){
		boolean[][] mines = new boolean[6][6];
		plantMines(mines);
		String[][] field = createField(mines);
		printPic(field);
	}

	private static String countNearby(boolean[][] mines, int row, int col) {
		//arraysindexoutofboundsexception ap exam obsessed
		//neg number or greater than length (index)
		//this is faster
		//for(int r = row - 1; r <= row + 1; r ++){
		//	for(int c = col - 1; c <= col+1; c++){
				//check that this element exists
				//check if its in the bounds of the arrays
		//		if(r >= 0 && r < mines.length && c >= 0 && c < mines[0].length){
					
		//		}
		//	}
		//}
		
		//this method only considers actual elements
		//this is slower, checking every item on the grid
		//int count = 0;
		//for(int r = 0; r < mines.length; r++){
		//	for(int c = 0; c < mines[r].length; c++){
			//	if(Math.abs(r - row) + Math.abs(c - col) == 1 && mines[r][c]){
			//		count++;
			//	}
			//}
		//}
		//return ""+count;
		
		//this method allows you to be most specific
		//for example you only want north and east
		int count = 0;
		count += isValidandTrue(mines, row - 1, col);
		count += isValidandTrue(mines, row + 1, col);
		count += isValidandTrue(mines, row - 1, col - 1);
		count += isValidandTrue(mines, row - 1, col + 1);
		return ""+count;
	}

	private static int isValidandTrue(boolean[][] mines, int i, int j) {
		if(i >= 0 && i < mines.length && j >= 0 && j < mines[0].length && mines[i][j])
			return 1;
		else return 0;
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
	
	private static void makeGrid(){
		//make box grid for hw for 11/4
		/*for(int col = 0; col < pic[0].length; col++){
			pic[0][col] = "_";
			pic[pic.length - 1][col] = "_";
		}
		
		for(int row = 1; row < pic.length; row++){
			pic[row][0] = "|";
			pic[row][pic[0].length - 1] = "|";
		}*/
		String[][] pic = new String[6][6];
		for(int row = 0; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = "| ";
			}
		}
		for(int col = 0; c)
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
		//pic[(int) (Math.random()* 5)][(int) (Math.random()* 5)] = "<(o.o)>";
		
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
