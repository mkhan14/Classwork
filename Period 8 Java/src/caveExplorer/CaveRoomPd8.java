package caveExplorer;

public class CaveRoomPd8 {

	private String description;
	private String directions; //tells u where to go wasd
	private String contents; //if there is monster in room treasure etc
	private String defaultContents;

	private CaveRoomPd8[] borderingRooms;
	private Door[] doors; 

	public static final int NORTH = 0; //final is constant, doesn't change. north is always 0
	//capitalized, if 2 words, then NORTH_DIRECTION
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;


	public CaveRoomPd8(String description){
		this.description = description;
		setDefaultContents("   ");
		contents = defaultContents;
		
		borderingRooms = new CaveRoomPd8[4];
		doors = new Door[4];
		/*for(int i = 0 ; i < borderingRooms.length; i++){
			borderingRooms[i] = null; //no bordering rooms..still have 4 directions but no door
			//new object arrays...automatically set to 0
			doors[i] = null;
		}*/
		setDirections();
	}

	protected void setDirections() {
		directions	= "";
		if(doors[NORTH] == null && 
				doors[EAST] == null &&
				doors[SOUTH] == null &&
				doors[WEST] == null){
			directions = "\n\nThis is a room with no exit. You will die here.";		
		}else{
			for(int dir = 0; dir < doors.length; dir++){
				if(doors[dir] != null){
					directions += "\n   There is a "+doors[dir].getDescription()+" to "+toDirection(dir)+". "+doors[dir].getDetails();
				}
			}
		}
	
	}

	public String getContents(){
		return contents;
		//tells u whats inside the room
	}
	
	public void enter(){
		contents = " X ";
	}
	
	public void leave(){
		contents = defaultContents;
	}
	
	public void setDefaultContents(String symbol){
		defaultContents = symbol;
	}
	

	public void addRoom(int direction, CaveRoomPd8 anotherRoom, Door door){
		borderingRooms[direction] = anotherRoom;
		doors[direction] = door;
		setDirections();
	}
	
	/**
	 * Gives this room access to anotherRoom (and vice-versa) and
	 * sets a door between them, and updates the directions
	 * @param direction
	 * @param anotherRoom
	 * @param door
	 */
	public void setConnection(int direction, CaveRoomPd8 anotherRoom, Door door){
		addRoom(direction, anotherRoom, door);
		anotherRoom.addRoom(oppositeDirection(direction), this, door);
		//adding rooms to each other
	}

	/**
	 * 
	 * @param dir
	 * @return opposite direction of dir (NORTH returns SOUTH...)
	 */
	public static int oppositeDirection(int dir){
		return (dir+2)%4;
	}

	
	public String getDescription(){
		return description+directions;
	}

	

	
	public Door getDoor(int dir){
		return doors[dir];
	}


	public void setDescription(String string) {
		description = string;
	}

	public void interpretAction(String input) {
		// TODO Auto-generated method stub
		
	}

}
