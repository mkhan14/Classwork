package caveExplorer;

public class InventoryNockles {

	//write a way to display some type of map
	private boolean hasMap;
	private String map;
	
	public InventoryNockles() {
		hasMap = false;
		updateMap();
	}

	public void setHasMap(boolean hasMap) {
		this.hasMap = hasMap;
	}

	public void updateMap() {
		CaveRoomPd8[][] caves = CaveExplorer.caves;
		//convert these caves to a string representation
		//create the top side
		map = " ";
		//horizontal line across top row, except for last column width 4
		for(int i = 0; i < caves[0].length - 1; i++){
			map+="____";
		}
		map+="___\n";
		//each room
		for(CaveRoomPd8[] row: caves){
			//there are 3 rows of text
			for(int textRow = 0; textRow < 3; textRow++){
				//the text is for each room
				for(CaveRoomPd8 cr: row){
					String str = "|   ";
					String contents = cr.getContents();
					if(textRow == 1 && cr.getDoor(CaveRoomPd8.WEST) != null){
						str = "  "+contents+" ";
					}
					else if(textRow == 2){
						if(cr.getDoor(CaveRoomPd8.SOUTH) != null){
							str = "|___";
						}else{
							str = "|_ _";
						}
					}
					//adds to map
					map += str;
				}//end of row of caverooms
				map+="|\n";
			}
		}
	}

	public String getDescription() {
		if(hasMap)return map;
		else return "You have no inventory.";
	}

}
