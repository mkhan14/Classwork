package sort;

import java.util.Arrays;

public class SortingAlgorithms {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayToSort={133,0,-5,31,12,12,2};
		System.out.println("- - - SELECTION SORT - - -");
		System.out.println(Arrays.toString(arrayToSort));
		selectionSort(copy(arrayToSort));
	}
	
	public static int[] copy(int[] arr){
		int[] copy = new int[arr.length];
		for(int i = 0; i < copy.length; i++){
			copy[i]=arr[i];
		}
		return copy;
	}
	
	public static void swap(int[] arr, int i, int j){
		System.out.println("Swapping "+arr[i]+" and "+arr[j]);
		int placeHolder=arr[j];
		arr[j]=arr[i];
		arr[i]=placeHolder;
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arrayToSort){
		int minIndex=0;
		int minimum=arrayToSort[0];
		for(int i=0;i<arrayToSort.length;i++){
			minIndex=i;
			minimum=arrayToSort[i];
			for(int j=i;j<arrayToSort.length;j++){
				if(arrayToSort[j]<minimum){
					minimum=arrayToSort[j];
					minIndex=j;
				}
			}
			swap(arrayToSort, i, minIndex);
		}
	}
	
	public static void bubbleSort(int[] arrayToSort){
		/*for(int i = 0; i < arrayToSort.length - 1; i++){
			for(int j = 0; j < )
		}*/
		System.out.println("Bubble sort with "+Arrays.toString(arrayToSort));
	    for(int i=0; i < arrayToSort.length-1; i++){
	        for(int j=1; j < arrayToSort.length-i; j++){
	            if(arrayToSort[j-1] > arrayToSort[j]){
	                swap(arrayToSort,j-1,j);
	                System.out.println("becomes "+Arrays.toString(arrayToSort));
	            }
	        }
	System.out.println("Ends as "+Arrays.toString(arrayToSort));
	    }
	}
	
	public static int[] mergeSort(int[] arrayToSort){
		if(arrayToSort.length==1)return arrayToSort;
	    int half = arrayToSort.length/2;//rounds down
	    int[] firstHalf = new int[half];
	    int[] secondHalf = new int[arrayToSort.length - half];
	    for(int i=0; i<firstHalf.length; i++){
	        firstHalf[i]=arrayToSort[i];
	    }
	    for(int i=0; i<secondHalf.length; i++){
	        secondHalf[i]=arrayToSort[i+firstHalf.length];
	    }
	    return merge(mergeSort(firstHalf),mergeSort(secondHalf));
	}
	
	public static int[] merge(int[] a, int[] b){
	    //code not shown
		int aLength = a.length;
		int bLength = b.length;
		int[] abArray = new int[aLength + bLength];
		for(int i = 0; i < aLength - 1; i++){
			abArray[i] = a[i]; 
		}
		for(int j = 0; j < bLength - 1; j++){
			abArray[j + aLength] = b[j];
		}
		return abArray;
	}
	
	public static void quickSort(int[] arrayToSort){
		for(int i = 0; i < arrayToSort.length; i++){
			if(arrayToSort[i] < arrayToSort[arrayToSort.length - 1]){
				
			}
		}
	}
	
	public static void insertionSort(int[] arrayToSort){
		
	}
}
