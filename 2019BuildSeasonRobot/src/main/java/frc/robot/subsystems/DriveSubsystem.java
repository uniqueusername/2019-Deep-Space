/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


/**
 * 
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public WPI_TalonSRX RBMotor = new WPI_TalonSRX(RobotMap.RBMotor);
  
  public WPI_TalonSRX RFMotor = new WPI_TalonSRX(RobotMap.RFMotor);
  
  public WPI_TalonSRX LBMotor = new WPI_TalonSRX(RobotMap.LBMotor);
  
  public WPI_TalonSRX LFMotor = new WPI_TalonSRX(RobotMap.LFMotor);

  public DifferentialDrive drive = new DifferentialDrive(RFMotor, LFMotor);

  public void initialize() {
    LBMotor.follow(LFMotor);
    RBMotor.follow(RFMotor);
  }

  public void tankDrive(double left, double right) {
    drive.tankDrive(left, right);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  
}
