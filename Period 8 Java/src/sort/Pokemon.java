package sort;

public class Pokemon {

	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	
	public void Pokemon(String name, int level){
		this.name = name;
		this.level = level;
		hp = 100;
		this.poisoned = false;
	}
	
	public void attack(Pokemon target, Attack attack){
		if(Math.random() < .9){
			attack.attack(target);
			System.out.println("The attack is hit");
		}else{
			System.out.println("The attack is missed");
		}
	}
	
	public void iChooseYou(){
		System.out.println(name+", "+name+"!");
	}
	
	public String getName(){
		return name;
	}
	
	public int getHP(){
		return hp;
	}
	
	public void setHP(int newHP){
		hp = newHP;
	}
	
	public void setPoisoned(boolean b){
		poisoned = b;
	}
	
	public void lapse(){
		if(poisoned){
			hp -= 15;
		}
	}

	public void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
