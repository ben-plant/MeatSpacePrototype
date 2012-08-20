package component;

import wrapper.*;

public class BodyPart {
	
	public int thisPartID;
	public int thisPartLevel;
	public int thisPartsInGame;
	public String thisPartName;
	public boolean isPartOfRobot;
	
	public BodyPart()
	{
		this.isPartOfRobot = false;
	}
	
	public BodyPart(int totalPartsInGame, int partID, int partLevel, boolean isThisPartOfRobot)
	{
		this.thisPartsInGame = totalPartsInGame;
		this.thisPartID = partID;
		this.thisPartLevel = partLevel;
	}
	
	public void printPartID()
	{
		System.out.println("Part number " + thisPartID + " of " + thisPartsInGame + " is a level " + thisPartLevel + " " + thisPartName + ".");
	}
}
