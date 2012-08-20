package component;

public abstract class BodyPart {
	
	public int thisPartID;
	public int thisPartLevel;
	public int thisPartsInGame;
	public String thisPartName;
	public boolean isPartOfRobot;
	
	//Default constructor to shut Eclipse up
	public BodyPart()
	{
		thisPartID = 99999;
	}
	
	//Assumes you want to iterate the part ID by one from the total parts in the game
	//Therefore this will be the standard call for this class
	public BodyPart(int totalPartsInGame, int partLevel, boolean isThisPartOfRobot)
	{
		this.thisPartsInGame = totalPartsInGame;
		this.thisPartID = totalPartsInGame++;
		this.thisPartLevel = partLevel;
	}
	
	//If you want to set your own part ID - USE WITH CARE AS THIS WILL OVERWRITE PARTS!!!
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
