package robot;

import component.*;

import java.util.*;

public class Robot {

	public ArrayList<BodyPart> thisRobot;
	
	//Body parts
	public Arm leftArm;
	public Arm rightArm;
	public Head head;
	public Torso torso;
	public Leg leftLeg;
	public Leg rightLeg;
	
	//Attributes
	public int robotAge;
	public int robotPower;
	public int robotOil;
	
	//Stats
	public int robotStrength;
	
	//Timing values
	public long robotUptime;
	public long maxRobotUptime;

	//Developer options
	public boolean debugThisRobot;
	//public boolean isThisGameOverthrowingTheEarth; --- We don't need to worry about this ;) - Ben

	public Robot(int partsInGame, boolean debugTrue)
	{
		this.thisRobot = new ArrayList<BodyPart>();

		this.robotAge = 0;
		this.robotPower = 100;
		this.robotOil = 100;
		this.robotUptime = 0;
		this.maxRobotUptime = 10_000;
		this.robotStrength = 10;
		
		this.debugThisRobot = debugTrue;
		
		if (this.debugThisRobot)
		{
			this.printStatus();
			this.listParts();
		}
		
		this.assignParts(partsInGame);
	}
	
	public void Update()
	{
		
	}
	
	public void printStatus()
	{
		System.out.println("This robot has " + this.robotPower + " power points!");
		System.out.println("This robot has " + this.robotOil + " oil points!");
		System.out.println("This robot has " + this.robotUptime + " uptime points out of " + this.maxRobotUptime + "!");
		System.out.println("This robot has " + this.robotStrength + " strength points!");
	}
	
	public int assignParts(int partsInGame)
	{
		thisRobot.add(this.head = new Head(partsInGame, 1, false));
		thisRobot.add(this.torso = new Torso(partsInGame, 1, true));
		thisRobot.add(this.leftArm = new Arm(partsInGame, 1, false, false));
		thisRobot.add(this.rightArm = new Arm(partsInGame, 1, false, true));
		thisRobot.add(this.leftLeg = new Leg(partsInGame, 1, false, false));
		thisRobot.add(this.rightLeg = new Leg(partsInGame, 1, false, true));
		
		return partsInGame;
	}
	
	public void listParts()
	{
		for(Iterator<BodyPart> i = thisRobot.iterator(); i.hasNext();)
		{
			BodyPart part = i.next();
			part.printPartID();
		}
	}
	
	public void swapPart(BodyPart partIn)
	{
		int partToSwap = 0;
		
		for(Iterator<BodyPart> i = thisRobot.iterator(); i.hasNext();)
		{
			BodyPart partOut = i.next();
			partToSwap++;
			if (partOut.getClass() == partIn.getClass())
			{
				System.out.println("Swapping part number " + partOut.thisPartID);
				partIn.thisPartID = partOut.thisPartID;
				thisRobot.set(partToSwap - 1, partIn);
				break;
			}
			
		}
		
		
	}
}
