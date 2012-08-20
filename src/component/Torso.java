package component;

public class Torso extends BodyPart {
		
	public Torso(int totalPartsInGame, int partLevel, boolean isThisPartOfRobot)
	{
		thisPartName = "Torso";
		this.thisPartID = totalPartsInGame++;
		this.thisPartLevel = partLevel;
		this.isPartOfRobot = isThisPartOfRobot;
	}
}
