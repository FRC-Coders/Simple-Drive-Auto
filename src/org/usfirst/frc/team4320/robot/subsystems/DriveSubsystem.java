package org.usfirst.frc.team4320.robot.subsystems;

import org.usfirst.frc.team4320.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem{
	
	//Defined Talons:
	private Talon leftTalon;				
	private Talon rightTalon;
	
	//Defined RobotDrive object
	private RobotDrive drive;
	
	//Defined the instance
	public static DriveSubsystem instance;
	
	//The getInstance method used for singleton
	public static DriveSubsystem getInstance(){
		if(instance == null)
			instance = new DriveSubsystem(); 
		return instance;
	}
	
	//DriveSubsystem c'tor
	private DriveSubsystem(){
		leftTalon = new Talon(RobotMap.LEFT_TALON);		//left talon c'tor gets port
		rightTalon = new Talon(RobotMap.RIGHT_TALON); 	//right talon c'tor gets port
		
		drive = new RobotDrive(leftTalon,rightTalon); 	//drive gets needed talons
	}
	
	public void drive(double speed, double rotation){
		drive.arcadeDrive(speed, rotation);//arcade drive gets in this case speed and rotation between -1.0 to 1.0 
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
