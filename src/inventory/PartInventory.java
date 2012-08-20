package inventory;

import java.util.ArrayList;

import component.BodyPart;

public class PartInventory {

	public ArrayList<BodyPart> thisInventory;
	
	public PartInventory()
	{
		this.thisInventory = new ArrayList<BodyPart>();
	}
	
	public void addToInventory(BodyPart partIn)
	{
		thisInventory.add(partIn);
		partIn.printPartID();
	}
	
	public void removeFromInventory(int index, BodyPart partOut)
	{
		
	}

	public void listInventory()
	{
		
	}
}
