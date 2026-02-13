class Character{
	private String name;
	private int maxHealth;
	private int health;
	private int attack;
	private Inv inv;

	Character(){
		name = "";
		maxHealth = 10;
		health = maxHealth;
		attack = 1;
		inv = new Inv();
	}

	Character(String newName){
		name = newName;
		maxHealth = 10;
		health = maxHealth;
		attack = 1;
		inv = new Inv();
	}

	Character(String newName, int hlt, int att){
		name = newName;
		maxHealth = hlt;
		health = hlt;
		attack = att;
		inv = new Inv();
	}


	public void rest(){
		int hltRegen = 5;
		if(maxHealth - health < hltRegen)
			hltRegen = maxHealth - health;
		health += hltRegen;
		System.out.printf("%s rests and gains %d health. %s has %d health.\n", 
				name, hltRegen, name, health);

	}


	//get methods
	
	public String getName(){
		return name;
	}

	public int getMaxHealth(){
		return maxHealth;
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



	//set methods
	
	public void setName(String sName){
		name = sName;
	}

	public void setMaxHealth(int sMaxHealth){
		maxHealth = sMaxHealth;
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



}
