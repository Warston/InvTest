class Inv {
	private int invSize = 30;
	private int invRowSize = 5;
	private Items [][] invGrid = new Items [invSize/invRowSize][invRowSize];

	Inv(){
		for (int i = 0; i < invGrid.length; i++){
				for (int x = 0; x < invGrid[i].length; x++){
					invGrid[i][x] = new Items("Empty", 0, 0);
					}
				}
	}

	public Items searchInv(int iId){
		for (Items[] row : invGrid){
			for (Items col : row){
				if (col.getItemId() == iId)
					return col;
			}
		}

		return new Items("Error", -1, 0);
	}

	public void addItem(String iName, int iId, int iQ){
		Items emptySlot = searchInv(0);
		emptySlot.setItemName(iName);
		emptySlot.setItemId(iId);
		emptySlot.setItemQty(iQ);
		System.out.printf("You picked up: %s\n", iName);	

	}
	public void addItem(String iName, int iId){
		Items emptySlot = searchInv(0);
		emptySlot.setItemName(iName);
		emptySlot.setItemId(iId);
		emptySlot.setItemQty(1);
		System.out.printf("You picked up: %s\n", iName);	
	}
	public void addItem(Items newItem){
		if (newItem.getItemId() == searchInv(newItem.getItemId()).getItemId())
			searchInv(newItem.getItemId()).changeQty(newItem.getItemQty());
		else {
			Items emptySlot = searchInv(0);
			emptySlot.setItemName(newItem.getItemName());
			emptySlot.setItemId(newItem.getItemId());
			emptySlot.setItemQty(newItem.getItemQty());
		}

	}

	public void printInv(){
		for (int i = 0; i < invGrid.length; i++){
			for (int x = 0; x < invGrid[i].length; x++){
				System.out.print(invGrid[i][x].getItemName() + " x " + invGrid[i][x].getItemQty() + "	");
			}
			System.out.println();
		}
	}
}
