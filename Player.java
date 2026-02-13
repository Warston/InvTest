class Player extends Character{

		private String location = "Home";

	Player(){
		super();
		location = "Home";
	}

	Player(String newName){
		super(newName, 100, 5);
		location = "Home";


	}


	Player(String newName, int hlt, int att, String loc){
		super (newName, hlt, att);
		location = loc;
	}

	Player(String newName, int hlt, int att){
		super (newName, hlt, att);
		location = "Home";
	}



	public String getLoc(){
		return location;
	}


	public void setLoc(String sLoc){
		location = sLoc;
	}




}
