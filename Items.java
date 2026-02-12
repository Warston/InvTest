class Items {
	private String itemName = "";
	private int itemId = 0;
	private int itemQty = 1;
	
	public Items(String iName, int iId, int iQ){
		itemName = iName;
		itemId = iId;
		itemQty = iQ;


	}

	public Items(String iName, int iId){
		itemName = iName;
		itemId = iId;
		itemQty = 1;


	}

	public void changeQty(int change){
		itemQty += change;
	}

	public String getItemName(){
		return itemName;
	}
	
	public int getItemId(){
		return itemId;
	}
	
	public int getItemQty(){
		return itemQty;
	}

	public void setItemName(String iName){
		itemName = iName;
	}

	public void setItemId(int iId){
		itemId = iId;
	}

	public void setItemQty(int iQ){
		itemQty = iQ;
	}
}
