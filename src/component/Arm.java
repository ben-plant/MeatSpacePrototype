package component;

import weapon.*;
import wrapper.Main;

public class Arm extends BodyPart{

	public Gun thisWeapon;
	public String thisArmSide;
	
	public Arm(int totalPartsInGame, int partLevel, boolean isThisPartOfRobot, boolean leftOrRight)
	{
		thisPartName = "Arm";
		this.thisPartID = totalPartsInGame++;
		this.thisPartLevel = partLevel;
		this.isPartOfRobot = isThisPartOfRobot;
		
		if (leftOrRight == false)
		{
			this.thisArmSide = "L";
		}
		else
		{
			this.thisArmSide = "R";
		}
	}
	
	public void printPartID()
	{
		System.out.println("Part number " + thisPartID + " of " + Main.partsInGame + " is a level " + thisPartLevel + " " + thisArmSide + thisPartName + ".");
	}


}
