package org.usfirst.frc.team4320.robot.commands;

import org.usfirst.frc.team4320.robot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

public class DriveByParameters extends TimedCommand {
	//private vars that used to save the c'tor parameters
	private double timeout;
	private double speed;
	private double rotation;
	//c'tor gets timeout duration(amount of sec' in which the command will be active),speed percentage, and rotation percentage
	public DriveByParameters(double timeout,double speed,double rotation) {
		super(timeout);//starts the counting for timeout
		// TODO Auto-generated constructor stub
		requires(Robot.drivesubsystem);
		this.timeout = timeout;
		this.speed = speed;
		this.rotation = rotation;
	}
	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.drivesubsystem.drive(speed,rotation);//Using the speed/rotation from the c'tor and the DriveSubsystem to drive the ROBOT
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		if(isTimedOut())//when it's timed out isFinished return true and stops the execute loop
			return true;
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
