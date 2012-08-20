package component;

import wrapper.Main;

public class Leg extends BodyPart {

	public String thisLegSide;
	
	public Leg(int totalPartsInGame, int partLevel, boolean isThisPartOfRobot, boolean leftOrRight)
	{
		thisPartName = "Leg";
		this.thisPartID = totalPartsInGame++;
		this.thisPartLevel = partLevel;
		this.isPartOfRobot = isThisPartOfRobot;
		
		if (leftOrRight == false)
		{
			this.thisLegSide = "L";
		}
		else
		{
			this.thisLegSide = "R";
		}
	}
	
	public void printPartID()
	{
		System.out.println("Part number " + thisPartID + " of " + Main.partsInGame + " is a level " + thisPartLevel + " " +  thisLegSide + thisPartName +".");
	}

}
