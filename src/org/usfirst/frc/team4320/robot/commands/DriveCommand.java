package org.usfirst.frc.team4320.robot.commands;

import org.usfirst.frc.team4320.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveCommand extends Command{
	
	public DriveCommand(){
		
		requires(Robot.drivesubsystem); 
	}
	
	
	// Called just before this Command runs the first time
		@Override
		protected void initialize() {
		}

		// Called repeatedly when this Command is scheduled to run
		@Override
		protected void execute() {
			Robot.drivesubsystem.drive(Robot.oi.getJoystick().getY(), Robot.oi.getJoystick().getZ());//Using the Joystick data and the DriveSubsystem to drive the ROBOT
		}

		// Make this return true when this Command no longer needs to run execute()
		@Override
		protected boolean isFinished() {
			return false;
		}

		// Called once after isFinished returns true
		@Override
		protected void end() {
			Robot.drivesubsystem.drive(0, 0);//the ROBOT stops
		}

		// Called when another command which requires one or more of the same
		// subsystems is scheduled to run
		@Override
		protected void interrupted() {//if interrupted it calls to end
			end();
		}
}
