package org.usfirst.frc.team4320.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class DriveAuto extends CommandGroup{
	public DriveAuto(){
		//using "addSequential" to trigger command in a sequence
		addSequential(new DriveByParameters(5,0.5,0));
		addSequential(new DriveByParameters(3,0,0.5));
		addSequential(new DriveByParameters(10,-0.3,0));
		addSequential(new DriveByParameters(5,0,-0.7));
		
	}

}
