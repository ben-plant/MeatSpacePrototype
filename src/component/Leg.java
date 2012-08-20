package component;

public class Leg extends BodyPart {

	public String thisLegSide;
	
	public Leg(int partLevel, boolean legSide)
	{
		thisPartName = "Leg";
		this.thisPartLevel = partLevel;
		this.incrementMasterID();
		this.isPartOfRobot = true;
		
		if (legSide == false)
		{
			this.thisLegSide = "L";
		}
		else
		{
			this.thisLegSide = "R";
		}
		
		thisPartName = "Leg";
	}
	
	public void printPartID()
	{
		System.out.println("Part number " + thisPartID + " of " + partsInGame + " is a level " + thisPartLevel + " " +  thisLegSide + thisPartName +".");
	}

}
