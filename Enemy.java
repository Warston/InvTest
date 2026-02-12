class Enemy {

	private int health = 100;
	private String name = "";
	private int attack = 2;


	Enemy(String eName, int eHealth, int eAtt){
		name = eName;
		health = eHealth;
		attack = eAtt;
	}

	

	String getName(){
		return name;
	}

	int getHealth(){
		return health;
	}

	int getAttack(){
		return attack;
	}

	void setName(String eName){
		name = eName;
	}
	void setHealth(int eHealth){
		health = eHealth;
	}
	void setAttack(int eAtt){
		attack = eAtt;
	}




}
