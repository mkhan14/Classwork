package arrays;

import java.util.ArrayList;

public class ListRunner {

	static ArrayList<Item> shoppingList;

	public static void main(String[] args) {
		String[] justDescriptions = getDescriptions();
		initList(justDescriptions);
		doSomeShopping();
		printPurchasedItems();
	}

	private static void printPurchasedItems() {
		for(int i = 0; i < shoppingList.size();i++){
			if(shoppingList.get(i).isPurchased()){
				System.out.println(shoppingList.get(i).getDescription());
				shoppingList.remove(i);
				//you can do this:
				//System.out.println(shoppingList.remove(i).getDescription();
				i--;
			}
		}
		
	}

	private static void doSomeShopping() {
		shoppingList.get(0).setPurchased(true);
		shoppingList.get(3).setPurchased(true);
		
	}

	private static void initList(String[] justDescriptions) {
		shoppingList = new ArrayList<Item>();//1 point
		for(String s: justDescriptions){//.5 point
			shoppingList.add(new Item(s));//.5 point adding, 1 point creating Item
		}
		//also acceptable
		//for(int i = 0; i < justDescriptions.length; i++){
			//shoppingList.add(new Item(justDescriptions[i]));
		//}
	}

	private static String[] getDescriptions() {
		String[] test = {"coffee","video games","potato chips","a life"};
		return test;
	}

}
