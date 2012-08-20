package component;

public class Head extends BodyPart {
	
	public Head(int totalPartsInGame, int partLevel, boolean isThisPartOfRobot)
	{
		thisPartName = "Head";
		this.thisPartID = totalPartsInGame++;
		this.thisPartLevel = partLevel;
		this.isPartOfRobot = isThisPartOfRobot;
	}

}
