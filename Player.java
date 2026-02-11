class Player {

		private String name = "";
		private int health = 100;
		private Inv inv = new Inv();
		private int attack = 5;
		private String location = "Home";

	Player(){
		String name = "";
		int health = 100;
		Inv inv = new Inv();
		int attack = 5;
		String location = "Home";
	}


	Player(String newName){
		String name = newName;
		int health = 100;
		Inv inv = new Inv();
		int attack = 5;
		String location = "Home";
	}










	//get methods
	
	public String getName(){
		return name;
	}


	public int getHealth(){
		return health;
	}


	public Inv getInv(){
		return inv;
	}

	public int getAttack(){
		return attack;
	}

	public String getLoc(){
		return location;
	}


	//set methods
	
	public void setName(String sName){
		name = sName;
	}
	
	public void setHealth(int sHealth){
		health = sHealth;
	}

	public void setInv(Inv sInv){
		inv = sInv;
	}

	public void setAttack(int sAttack){
		attack = sAttack;
	}

	public void setLoc(String sLoc){
		location = sLoc;
	}




}
