import java.util.Scanner;

class InvTest {


	public static void main(String [] args){

		Scanner kb = new Scanner(System.in);
		Player player1 = new Player("Warston");
		int choice = 0;
		Combat fight;

		System.out.printf("%s sets out on an adventure!\n", player1.getName());

		while(true){
			System.out.println("Choose an option");
			System.out.println("1) Fight");
			System.out.println("2) Rest");
			System.out.println("4) Check Inventory");
			System.out.println("5) Exit Game");

			choice = kb.nextInt();
		
			switch(choice){
				case 1: Combat.startFight(player1, new Enemy ("Bat", 10, 1), new Items("Apple", 1, 1));
					break;
				case 2: player1.rest();
					break;
				case 4: player1.getInv().printInv();
					break;
				case 5: System.exit(0);
					break;
			}
		}

		



	}


}
