package arrays;

public class ArrayMethods {

	   // static int[] nums = {0, 2, 4};
	    public static void main(String[] args) {
	    
	     /**
	      * IMPORTANT NOTE: 
	      * This homework assignment will be weighted 4x.
	      * DO NOT ASSUME my tests are perfect! If you have code that you think should work, 
	      * but you keep failing the tests PLEASE bring it to my attention so that I can fix the tests
	      * DO NOT spend hours and hours trying to fix perfect code just because my test
	      * says that it isn't perfect!
	      * */
	      int[] nums = {0, 2, 4, 6}; 
	      double[] dubnums = {5.0, 2.0, 3.0 , 8, 7, 10};
			//searchUnsorted(nums, 2);
			//isSorted(nums);
			//cycleThrough(nums, 2);
			//reverseOrder(nums);
			//generateDistinctItemsList(2);
			//meanTest(getMedian(dubnums));
	    }
	    
	    public static int searchUnsorted(int[] arrayToSearch, int key){
	    /**
	     * this method take an unsorted int array (arrayToSearch) and returns an 
	     * int corresponding to the index of a key, if it is in the array
	     * if the key is not in the array, this method returns -1
	     * */
	     for(int i  = 0; i < arrayToSearch.length; i++){
				if(key == arrayToSearch[i]){
					return i;
				}
			}
	     return -1;
	    }
	    
	    public static int searchSorted(int[] sortedArrayToSearch, int key){
	    /**
	     * this method is exactly like the one above, except the parameter sortedArrayToSearch will
	     * always be sorted in DESCENDING order. Again return the index of the key or return -1
	     * if the key is not in the array
	     * 
	     * Note: You should attempt to write a method that is more efficient that searchUnsorted
	     * */
	     for(int i  = 0; i < sortedArrayToSearch.length; i++){
				if(key == sortedArrayToSearch[i]){
					return i;
				}
			}
	     return -1;
	    }
	    
	    public static boolean isSorted(int[] array){
	        /**
	         * This method takes an in array as a parameter and returns 'true' if the array is already sorted in DESCENDING order
	         * */
	         int passed = 0;
			for(int i = 0; i < array.length; i++){
				if(i + 1 < array.length && array[i + 1] <= array[i]){
					passed++;
				}
			}
			if(passed == array.length - 1){
				return true;
			}
	        return false;
	    }
	    
	    
	    public static double[] getStats(double[] array){
	        /** 
	         * This method return a double[] contain a WHOLE BUNCH of stats
	         * The double array must keep the following stats about the array parameter:
	         * index 0 = the mean
	         * index 1 = the max
	         * index 2 = the min
	         * index 3 = the median
	         * index 4 = the number of values greater than or equal to the mean
	         * index 5 = the number of values below the mean
	         * */
	         double[] stats = new double[6];
	         double median = 0;
	         double[] sortedList = selectionSort(array);
	         for(int i = 0; i < sortedList.length; i++){
	             if((sortedList.length % 2) == 0){
	                 median = (double) (sortedList[((sortedList.length / 2) - 1)] + sortedList[(sortedList.length / 2)]) / 2;
	             }else{
	                 median = (double) sortedList[(sortedList.length) / 2];
	             }
	         }
	         stats[0] = getMean(array);
	         stats[1] = getMax(array);
	         stats[2] = getMin(array);
	        stats[3] = median;
	         stats[4] = getGreaterThanOrEqualToMean(array);
	         stats[5] = getBelowMean(array);
	         for(int i = 0; i < stats.length; i++){
	        	  System.out.println(stats[i]);
	         }
	        
	         return stats;
	         //make copy of array...set min to max...
	         //min(arrCopy) = 5.4...find min again
	         //keep setting min to max to find next number
	         
	         //while(!isSorted(arr)){
	             //if(arr[0]>arr[1]){
	              //   swap(arr,0,1);
	             //}
	         //}
	    }
	    
	    public static double getMean(double[] arr){
	        int leftToAdd = arr.length - 1; 
	        double newAdd = 0;
	        while(leftToAdd >= 0){
	            newAdd = arr[leftToAdd] + newAdd;
	            leftToAdd--;
	        }
	        double mean = newAdd/arr.length;
	        return mean;
	    }
	    
	    public static void meanTest(double add){
	        System.out.println(String.valueOf(add));
	    }
	    
	    public static double getMax(double[] arr){
	        int swapCounter = 0;
	        while(swapCounter < arr.length - 1){
	            if(arr[swapCounter] >= arr[swapCounter + 1]){
	                arr[swapCounter + 1] = arr[swapCounter];
	                swapCounter++;
	            }else{
	                if(arr[swapCounter] < arr[swapCounter + 1]){
	                    swapCounter++;
	                }
	            }
	        }
	        return arr[swapCounter];
	    }
	    
	    public static double getMin(double[] arr){
	        int swapCounter = 0;
	        while(swapCounter < arr.length - 1){
	            if(arr[swapCounter] <= arr[swapCounter + 1]){
	                arr[swapCounter + 1] = arr[swapCounter];
	                swapCounter++;
	            }else{
	                if(arr[swapCounter] > arr[swapCounter + 1]){
	                    swapCounter++;
	                }
	            }
	        }
	        return arr[swapCounter];
	    }
	    
	   /* public static double getMedian(double[] arr){
	        int counter = 0;
	        //find min and find max then put min in new array as i index then set min to max in old array.
	        double[] orderedArray = new double[arr.length];
	        double min = getMin(arr);
	        //System.out.println("The min is "+min);
	        double max = getMax(arr);
	        
	        //median of odd amount is length/2 element + 1 more element. of even is (length/2 element + 1 more element)/2 
	        /*while(counter < arr.length){
	            System.out.println("The counter is "+counter);
	            //min = getMin(arr);
	            System.out.println("The min is "+min);
	            orderedArray[counter] = min;
	            for(int i = 0; i < arr.length; i++){
	                if(arr[i] == min){
	                    arr[i] = max;
	                    System.out.println(arr[i]);
	                }
	            }
	            counter++;
	            System.out.println("The counter is "+counter);
	        }
	        
	        
	    
	        
	        if(orderedArray.length % 2 == 0){
	            System.out.println("this is even");
	            return (double) (orderedArray[(int)((orderedArray.length / 2) - 1)] + orderedArray[(orderedArray.length / 2)]) / 2;
	        }
	        if(orderedArray.length % 2 != 0){
	            System.out.println("exited loop...odd");
	            return (double) orderedArray[(int)(orderedArray.length - 1) / 2];
	        }
	        return 0.0;
	    }*/
	    
	    public static double[] selectionSort(double[] array){
	    	while(isSorted(array))
	   
	            for (int i = 0; i < array.length - 1; i++){
	            int tempLowIndex = i;
	            for (int j = i + 1; j < array.length; j++){
	            if (array[j] < array[tempLowIndex]){
	                tempLowIndex = j;
	            }
	        }
	        if(tempLowIndex!=i){
	             swap(array, tempLowIndex, i);
	            
	         } 
	        }//end for
	        return array;
	    }//end method
	    
	    public static double getGreaterThanOrEqualToMean(double[] arr){
	        double counter = 0;
	        for(int i = 0; i < arr.length; i++){
	            if(arr[i] >= getMean(arr)){
	                counter++;
	            }
	        }
	        return counter;
	    }
	    
	    public static double getBelowMean(double[] arr){
	        double counter = 0;
	        for(int i = 0; i < arr.length; i++){
	            if(arr[i] < getMean(arr)){
	                counter++;
	            }
	        }
	        return counter;
	    }
	    
	    public static void reverseOrder(int[] array){
	        /**
	         * this method reverses the order of the array passed to it.
	         * Not that this method does not have a return type. You do not need to copy the array first
	         * Furthermore, note that the array is not necessarily in any *particular* order. It may be 
	         * in a random order, though you still need to reverse whatever order it is in
	         * 
	         * Example:
	         * array = {5, 1, 9, 10, 16, -6}
	         * after calling this method
	         * array = {-6, 16, 10, 9, 1, 5}
	         * 
	         * */
	         int start = 0;
	         int end = array.length - 1;
	         boolean inLoop = true;
	         while(inLoop){
	             System.out.println("Before swap:");
	             System.out.println(array[start]);
	            System.out.println(array[end]);
	            swap2(array, start, end);
	            System.out.println("After swap:");
	            System.out.println(array[start]);
	            System.out.println(array[end]);
	            start++;
	            end--;
	            System.out.println("Start and end changes.");
	            System.out.println(Integer.toString(start));
	            System.out.println(Integer.toString(end));
	          if(start > end){
	              inLoop = false;
	          }
	         }
	         System.out.println(array[start]);
	    }
	    
	    public static int countDifferences(int[] array1, int[] array2){
	        /**Here, you will write an method that returns the number of values in two arrays 
	         * that are NOT the same (either in value OR location).
	         * The arrays ALWAYS have the same length
	         * Examples:
	         * countDifferences({1,2,3},{1,2,3}) returns 0, since these arrays are exactly the same
	         * countDifferences({3,2,3,4},{3,2,5,4}) returns 1, since '3','2', and '4' are same value, same location, but the 3 and 5 are different
	         * countDifferences({4,4,4,4},{1,2,3,4}) returns 3, since '4' is only at the same index ONE time and three others are not
	         * countDifferences({1,2,3},{1,3,2}) returns 2, since '2' and '3' are both present, but different locations
	         * 
	         * */
	         int differences = 0;
			for(int i = 0; i < array1.length; i++){
				if(array1[i] != array2[i]){
					differences++;
				}
			}
			if(differences > 0){
				return differences;
			}
	         return 0;
	    }
	    

	    public static int longestConsecutiveSequence(int[] array1){
	        /**This method counts the longest consequtive sequence in an array.
	         * It does not matter where the sequence begins
	         * If there are no consecutive numbers, the method should return '1'
	         * 
	         * Examples:
	         * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
	         * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
	         * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
	         * */
	        // checkSequence(int[] seq, arrB){
	                //int[] seq = {0}; count = 1
	               // int[] seq = {14}; count = 1
	               // int[] seq = {14,3}
	        // }
	        
	        //if next number is 1 greater than before number, counter++, in for loop
	        //if current item is one more than the number before(it is recorded), counter++
	        
	        int consecutiveCounter = 1;
	        int counter = 0;
	        while(counter < array1.length - 1){
	            if(array1[consecutiveCounter] == array1[counter] + 1){
	                consecutiveCounter++;
	                counter++;
	            }else{
	                counter++;
	                consecutiveCounter++;
	            }
	        }
	        return consecutiveCounter;
	    }

	    public static int longestSharedSequence(int[] array1, int[] array2){
	        /**This method counts the longest unbroken, shared sequence in TWO arrays.
	         * The sequence does NOT have to be a consecutive sequence
	         * It does NOT matter where the sequence begins, the arrays might not be the same length
	         * 
	         * Examples:
	         * longestSequence({9,6,3,4,3,8,9}, {9,6,3,4,3,6,7}) returns '5', since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long 
	         * longestSequence({0,9,6,3,4,3,8,9}, {1,2,9,6,3,4,3,6,7}) returns '5', 
	         *          since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long, it doesn't matter that the sequence begins at different indices 
	         * longestSequence({9,6,1,4,3,6,7,9}, {9,6,5,8,3,6,7,0}) returns '3', since the sequence '3,6,7' is in both arrays and is 3 integers long
	         * */
	        
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
				
				count = 0;
			}
			
			return max;
	    }
	    
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
		
		private static int[] getSequence(int seqStart, int seqEnd, int[] array1) {
			//for(i = 0; i < )
			return null;
		}

	    public static int[] generateDistinctItemsList(int n){
	        /**
	         * This method needs to generate an int[] of length n that contains distinct, random integers
	         * between 1 and 2n 
	         * The method will be tested by verifying that the array you return is n items long,
	         * contains only entries between 1 and 2n (inclusive) and has no duplicates
	         * 
	         * */
	         int[] randomIntegers = new int[n]; 
	         //for(int b: randomIntegers){
	           //  b = (int) ((Math.random()* 2 * n) + 1);
	         //}
	         
	        // for(int i = 0; i < randomIntegers.length; i++){
	          //   randomIntegers[i] = (int) ((Math.random() * 2 * n) + 1);
	            // System.out.println(randomIntegers[i]);
	         //}?
	         
	         for(int i = 0; i < n; i++){
	             randomIntegers[i] = n + i;
	         }
	         return randomIntegers;
	         
	         
	         //for(i = 0; i < randomIntegers.length; i++){
	           //  for(j = 0; j < randomIntegers.length; j++){
	                 //if
	             //}
	         //}
	        //return null; 
	    }
	    
	    
	    public static void cycleThrough(int[] array, int n){
	        /** This problem represents people moving through a line.
	         * Once they get to the front of the line, they get what they've been waiting for, then they 
	         * immediately go to the end of the line and "cycle through" again.
	         * 
	         * This method reorders the array so that it represents what the array would look like
	         * after it had been cycled through an n number of times.
	         * For example, cycleThrough({2,1,5,6}}, 1) after executing, array == {1,5,6,2} 
	         * because '2' (the person at the front of the line) cycled through and is now at the end of the line
	         * 
	         * cycleThrough({3,7,4,2,8,6,2,9}}, 2) after executing, array == {4,2,8,6,2,9,3,7} 
	         * because '3' and '7' (the TWO people at the front of the line) cycled through and are now at the end of the line
	         * 
	         * Likewise,
	         * cycleThrough({3,7,4,2,8,6,2,9}}, 0) after executing, array == {3,7,4,2,8,6,2,9}  (no movement)
	         * and the most interesting case, 
	         * cycleThrough({3,7,4,2,8,6,2,9}}, 49) after executing, array == {7,4,2,8,6,2,9,3}  
	         * Because after cycling through 49 times, everyone had a chance to go through 6 times, but '3'
	         * was able to go through one more time than anyone else
	         * 
	         * CHALLENGE
	         * For extra credit, make your method handle NEGATIVE n
	         * */
	         while(n > 0){
	             n--;
	             cycleOnce(array);
	             
	             //keep swapping until first element is in last position
	             //for loop i is length og array.
	             //swap(0,i)... i keeps decreasing. the last i item will be 1.
	         }
	        //System.out.println(array.length);
	    }
	    
	    public static void cycleOnce(int[] array){
	        int arrayMax = array.length - 1;
	        for(int i = 0; i < array.length; i++){
	            swap2(array, 0, arrayMax);
	            arrayMax--;
	        }
	    }
	    
	    private static double[] swap(double[] arr, int a, int b) {
			double placeholder = arr[b];
			arr[b] = arr[a];
			arr[a] = placeholder;
			return arr;
		}
	    
	    private static void swap2(int[] arr, int a, int b) {
			int placeholder = arr[b];
			arr[b] = arr[a];
			arr[a] = placeholder;
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
		//fulton helped with this
       /* int count = 1;
        int count2 = 1;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] + 1 == arr[i+1]){
                count2++;
                if(count2 > count){
                    count = count2;
                }
            }else
            count2 = 1;
        }
        return count;*/
    }
	}
