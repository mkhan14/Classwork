package sort;

public class MainBattle {

	public MainBattle() {
		// TODO Auto-generated constructor stub
	}

	 public static void main(String[] args) {
		 Pokemon squirtle = new Pokemon("Squirtle",26);
		 Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		 squirtle.iChooseYou();
		 bulbasaur.iChooseYou();
		 System.out.println("Squirtle is preperaing to attack "
		 		+ "with water blast.");
		 //handle is variable name
		 //anonymous- no handle
		 //inner- passed to some other object...password phone analogy
		 //nothing u can do to change it
		 //type
		 //creating an attack right now, no way to change it after
		 //we do this
		 squirtle.attack(bulbasaur, new Attack() {
			
			@Override
			public void attack(Pokemon target) {
				int newHP = target.getHP()/2;
				target.setHP(newHP);	
			}
		});
		 bulbasaur.attack(squirtle, new Attack() {
			//poisons the target
			public void attack(Pokemon target) {
				target.setPoisoned(true);
			}
		});
		 
		 squirtle.lapse();
		 bulbasaur.lapse();
		 printScore(squirtle, bulbasaur);
	 }
	 
	 private static void printScore(Pokemon p1, Pokemon p2){
		 System.out.println(p1.getName()+", HP = "+p1.getHP());
		 System.out.println(p2.getName()+", HP = "+p2.getHP());
	 }

}
