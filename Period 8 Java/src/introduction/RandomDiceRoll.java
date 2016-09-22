package introduction;

public class RandomDiceRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] results = new int[6]; //fill the array with 6 0's
		
		//System.out.println(results[0]);
		
		//logic tests are boolean operators:
		//<,>,!=,==,>=,<=,&&,||
		//declare variable, logic test, increment
		int totalRolls = 10000;
		for(int index = 0; index < totalRolls; index ++){
		int result = rollFairDie();	
		System.out.println("Roll #" + (index+1)+": "+result);
		results[result-1] ++;
		}
		
		for(int i = 0; i < 6; i ++){	
			double percentage = ((int) (1000*(double)results[i]/totalRolls))/10.0;
			System.out.println((i+1)+" appeared " + percentage+ " %");
		}
		//for(int index = 0; index < 10; index ++){
			//System.out.println("Roll #" + (index+1)+": "+rollUnfairDie());
		
	}
	
	//return 1,2,3,4,5,6 with equal probability
	public static int rollFairDie(){
		double rand = Math.random(); //math is a class that has a lot of methods... returns a double between 0 and 1. (0,1)
		int roll = (int) (6*rand);//[0,5]
		roll ++; //[1,6]
		return roll;
	}
	
	/*public static int rollUnfairDie(){
		//how many times a dice is rolled
		
		double rand = Math.random(); //math is a class that has a lot of methods... returns a double between 0 and 1. (0,1)
		double otherRand = Math.random();
		
		int unfairRoll = (int) (6*rand);
		unfairRoll ++;
				
		if(unfairRoll == 2) {return "2";}
		
		else{
			rollFairDie();
			
		}
		
		//uneven distribution
		//imperical probability
		//int roll = (int) (6*rand);//[0,5]
		//roll ++; //[1,6]
		
	}
	*/

}
