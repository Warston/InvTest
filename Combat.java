class Combat {

	private Player player;
	private Enemy enemy;
	private Items loot;

	Combat(Player playerCom, Enemy enemyCom, Items lootCom){
		player = playerCom;
		enemy = enemyCom;
		loot = lootCom;

		System.out.printf("A %s appears!\n", enemy.getName());


	}

	public void damage(Character combatant1, Character combatant2){
		combatant2.setHealth(combatant2.getHealth() - combatant1.getAttack());
		System.out.printf("%s does %d damage to %s!\n", combatant1.getName(), combatant1.getAttack(), combatant2.getName());


	}



	public void giveLoot(){
		player.getInv().addItem(loot);

	}

	public boolean checkEnemyAlive(){
		if(enemy.getHealth() <= 0)
			return false;
		else return true;
	}

	public Player getPlayer(){
		return player;
	}

	public Enemy getEnemy(){
		return enemy;
	}

	public Items getLoot(){
		return loot;
	}

	public static void startFight(Player player1, Enemy enemy, Items loot){
		Combat fight = new Combat(player1, enemy, loot);
		while (fight.checkEnemyAlive()){
			fight.damage(fight.getPlayer(), fight.getEnemy());					
			fight.damage(fight.getEnemy(), fight.getPlayer());
			System.out.printf("%s's health is: %d\n", player1.getName(), player1.getHealth());
			System.out.printf("%s's health is: %d\n", enemy.getName(), enemy.getHealth());

		}
		System.out.printf("%s is victorious!\n", player1.getName());
		player1.getInv().addItem(loot);
		System.out.printf("You looted: %s!\n", loot.getItemName());

	}

}
