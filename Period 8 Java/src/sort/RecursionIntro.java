package sort;

public class RecursionIntro {

	public static void main(String[] args) {
		/*System.out.println("Using a for loop:");
		for(int i = 0; i < 5; i++){
			System.out.println("Hello world! x"+i);
		}
		System.out.println("Without using a for loop:");
		//ctrl space
		//recursion: no state change- only affects local variables
		forLoop(5, new Action() {
			
			private int value = 0;
			
			public void act() {
				System.out.println("Hello world! x "+value);
				value++;
			}
		});*/
		hanoiSolution(3, "A", "B", "C");
	}
	//you can pass method as parameter
	//recursion is useful whenever a problem is based off a "trivial"
	//case...though sometimes a for loop accomplishes the same thing
	//multiple choice only for recursion in ap exam...4 cycles is enough

	private static void forLoop(int i, Action action) {
		if(i <= 0){
			return; //base case
		}else{
			//standard action
			action.act();
			//recursive call
			forLoop(i - 1, action);
		}
	}
	
	private static int factorial(int num){
		if(num == 1){
			return 1;
		}else{
			return num * factorial(num - 1);
		}
	}
	
	//public static int forLoopFactorial(int x){
		
	//}
	
	//using recursion:
	/*if(x > 1){
		return x * factorial(x-1);
	}
	return 1;*/

	public static void hanoiSolution(int numberOfDiscs, String startPeg, String midPeg, String endPeg){
		//built off a trivial case
		if(numberOfDiscs <= 1){
			System.out.println("Move "+startPeg+" to "+endPeg);
		}else{
			hanoiSolution(numberOfDiscs-1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(numberOfDiscs-1, midPeg, startPeg, endPeg);
		}
	}
}
