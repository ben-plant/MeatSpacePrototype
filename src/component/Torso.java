package component;

public class Torso extends BodyPart {
	
	public Torso(int partLevel)
	{
		thisPartName = "Torso";
		this.thisPartLevel = partLevel;
	}
	
	public Torso(int totalPartsInGame, int partID, int partLevel, boolean isThisPartOfRobot)
	{
		thisPartName = "Torso";
		this.thisPartLevel = partLevel;
		
		if (!incrementMasterID)
		{
			System.out.println("Master ID not incremented by component ID " + this.thisPartID);
			this.isPartOfRobot = false;
			this.incrementMasterID();
		}
		else
		{
			this.incrementMasterID();
			this.isPartOfRobot = true;
		}
	}
}
