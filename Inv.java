class Inv {
	private int invSize = 30;
	private int invRowSize = 5;
	private String [][] invGrid = new String [invSize/invRowSize][invRowSize];


	Inv(){
		for (int i = 0; i < invGrid.length; i++){
				for (int x = 0; x < invGrid[i].length; x++){
					invGrid[i][x] = "Empty";
					}

				}
		


	}


	public void printInv(){
		for (int i = 0; i < invGrid.length; i++){
			for (int x = 0; x < invGrid[i].length; x++){
				System.out.print(invGrid[i][x] + "	");
			}
			System.out.println();

		}

	}


}
