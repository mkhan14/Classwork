package arrays;

public class AdvancedArrayMethods {

	static int[] array;
	
	public static void main(String[] args) {
		/*array = new int[100]; //full of zeroes
		int[] someArray = new int[50];
		someArray = array;
		System.out.println(someArray.length);
		someArray[30] = 1;
		//someArray is 100 zeroes and 1 one.
		System.out.println(array[30]);
		
		//methodA(someArray);*/
		
		/*String[] array;
		array = new String[26];//full of zeroes
		char character = 'a';
		for(int i = 0; i < array.length; i++){
			String element = new String(character+i)+"";
			System.out.println(element);
			//characters are primitive types...can use characters in AP exam
		} doesn't work*/
		
		String[] array = {"a", "b", "c", "d", "e", "f", "g", "h"};
		//swap(array, 0,array.length -1);
		shuffle(array);
	}
	
	private static void shuffle(Object[] array) {
		for(int i = 0; i < array.length; i++){
			int random = (int)(Math.random()*6);
			swap(array, i, random);
			//come in class monday prepared to ask about arrayMethods confusion.
			//for reverse order, the array that is passed is itself changed.
			//for getstats, make sure u get indices right
		}
		
	}
	
	public static int longestSharedSequence(int[] array1, int[] array2){
		int max = 0; //represents longest shared seq and its length
		int count = 0;
		
		for(int seqStart = 0; seqStart < array1.length; seqStart++){
			//has to be in a loop
			int seqEnd = seqStart;
			int[] seq = getSequence(seqStart, seqEnd, array1);
			if(checkSequence(seq, array2)){
				count++; //could just do sequence.length
				if(count > max){
					max = count;
				}
			}
			//until this...seqEnd has to be increased after loop repeats
			//somehow loop so sequence bcome longer
			//until u cant find the sequence anymore
			//reset the count after every sequence ahs been checked
			count = 0;
		}
		
		return max;
	}

	//returns true if sequence is found inside array2
	private static boolean checkSequence(int[] seq, int[] arr) {
		//return true if swq iis found insdie array
		A: for(int i = 0; i < arr.length; i++){
			//j checks every element in seq
			B: for(int j = 0; j < seq.length; j++){
				if(seq[j] != arr[j+i]){
					//j = seq.length; not that efficient
					//breaks out of inner-most for loop
					//unless particular for loop is specified
					break;
				}else if(j == seq.length-1){
					return true;
				}
			}
		}
		return false;
	}

	//returns a sub-array containing the elements in array1 from seqStart
	//to seqEnd
	private static int[] getSequence(int seqStart, int seqEnd, int[] array1) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void swap(Object[] arr, int a, int b) {
		//AP exam obsessed with this method
		//2 elements
		//create placeholder
		//store b in placeholder
		//a is equal to placeholder
		Object placeholder = arr[b];
		arr[b] = arr[a];
		arr[a] = placeholder;
		
	}

	private static void methodA(int[] someArray){
		int[] newArray = new int[someArray.length];
	}
	
	public static void copyArray(int[] original, int[] target){
		//target = original wouldn't work because passbyvalue
		//only assigns it, doesn't change the elements of array
		if(original.length == target.length){
			for(int i = 0; i < original.length; i++){
				target[i] = original[i];
			}
		}else{
			//print an "error" message
			System.out.println("ERROR: tried to copy array of two different lengths.");
		}
	}

}
