package component;

public class Head extends BodyPart {

	
	public Head(int partLevel)
	{
		thisPartName = "Head";
		this.thisPartLevel = partLevel;
		this.incrementMasterID();
		this.isPartOfRobot = true;
	}

}
