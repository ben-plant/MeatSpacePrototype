package wrapper;

import robot.*;
import component.*;
import inventory.*;

public class Main {

	public static int partsInGame = 0;
	
	public static void main(String[] args) 
	{
		PartInventory testInventory = new PartInventory();
		Robot testDroid = new Robot(partsInGame, true);
		testDroid.listParts();
		BodyPart testPart; //New level 5 torso
		
		testInventory.addToInventory(testPart = new Torso(partsInGame, 5, false));
		testDroid.swapPart(testInventory.thisInventory.get(0));
		
		testDroid.listParts();
	}
}
