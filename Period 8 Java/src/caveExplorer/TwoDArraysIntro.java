package caveExplorer;

import java.util.Arrays;

public class TwoDArraysIntro {

	public static void main(String[] args) {
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
