import java.util.Scanner;

class InvTest {
	public static void main(String [] args){

		Inv inv1 = new Inv();

		inv1.printInv();

		System.out.println(inv1.searchInv(0).getItemName());
		System.out.println();
		inv1.addItem("Apple", 1, 1);
		inv1.printInv();
		System.out.println();

		inv1.addItem("Orange", 2, 5);
		inv1.printInv();

	}


}
