// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.math.trajectory.Trajectory;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.n
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */


  //None of these have been configured yet - the num in the parantheses refers to the location on the roboRIO
        //right motors
  private final VictorSP rightMotor1 = new VictorSP(2);
  private final VictorSP rightMotor2 = new VictorSP(3);

        //left motors
  private final VictorSP leftMotor1 = new VictorSP(11);
  private final VictorSP leftMotor2 = new VictorSP(12);

  private final SpeedController leftGroup = new SpeedControllerGroup(leftMotor1, leftMotor2);
  private final SpeedController rightGroup = new SpeedControllerGroup(rightMotor1, rightMotor2);

  DifferentialDrive drivetrain = new DifferentialDrive(leftGroup, rightGroup);

  //joystick 
  Joystick stick = new Joystick(0);
//length between wheels is 0.59 meters
  //Pneumatics(basically air compressing 'n stuff) - air compressor which is aided by the pneumatics module
  private final Compressor comp = new Compressor();
  private final DoubleSolenoid Solenoid = new doubleSolenoid(0, 1);

  private final Timer m_timer; 
  @Override
  public void robotInit() {}

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {
    m_timer.reset();
    m_timer.start();
  }

  @Override
  public void autonomousPeriodic() {
    
  }

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
    drivetrain.arcadeDrive(stick.getY(), stick.getZ());

    if
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}
}
