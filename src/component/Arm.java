package component;

import weapon.*;

public class Arm extends BodyPart{

	public Gun thisWeapon;
	public String thisArmSide;
	
	public Arm(int partLevel, boolean armSide)
	{
		thisPartName = "Arm";
		this.thisPartLevel = partLevel;
		this.incrementMasterID();
		this.isPartOfRobot = true;
		
		if (armSide == false)
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
		System.out.println("Part number " + thisPartID + " of " + partsInGame + " is a level " + thisPartLevel + " " + thisArmSide + thisPartName + ".");
	}


}
