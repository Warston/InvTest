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


	public void damage(Player player, Enemy enemy){
		enemy.setHealth(enemy.getHealth() - player.getAttack());
		System.out.printf("%s does %d damage to %s!\n", player.getName(), player.getAttack(), enemy.getName());
	
	}

	public void damage(Enemy enemy, Player player){
		player.setHealth(player.getHealth() - enemy.getAttack());
		System.out.printf("%s does %d damage to %s!\n", enemy.getName(), enemy.getAttack(), player.getName());

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


}
