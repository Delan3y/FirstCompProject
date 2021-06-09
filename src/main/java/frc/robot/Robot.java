// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.PWMTalonFX;
//import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
//import edu.wpi.first.wpilibj.Compressor;
//import edu.wpi.first.wpilibj.SolenoidBase;
//import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.n
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code.
   */

  // None of these have been configured yet - the num in the parantheses refers to
  // the location on the roboRIO
  // right motors
  private final Talon rightMotor1 = new Talon(15);
  private final Talon rightMotor2 = new Talon(14);

        //left motors
  private final Talon leftMotor1 = new Talon(13);
  private final Talon leftMotor2 = new Talon(12);

//  private final Encoder leftEncoder = new Encoder(4,5);
// private final Encoder rightEncoder = new Encoder(6,7);

 

  private final SpeedController leftGroup = new SpeedControllerGroup(leftMotor1, leftMotor2);
  private final SpeedController rightGroup = new SpeedControllerGroup(rightMotor1, rightMotor2);

  DifferentialDrive drivetrain = new DifferentialDrive(leftGroup, rightGroup);

  //joystick 
  Joystick stick = new Joystick(0);
  
  //xbox controller
  private final XboxController xbox = new XboxController(1);
//length between wheels is 0.59 meters
  //Pneumatics(basically air compressing 'n stuff) - air compressor which is aided by the pneumatics module
  //private final Compressor comp = new Compressor();
//  private final DoubleSolenoid Solenoid = new DoubleSolenoid(0, 1);
 // private final Spark lifter = new Spark(6);

 // private final Timer m_timer; 
  @Override
  public void robotInit() {}

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {
   // m_timer.reset();
    //m_timer.start();
  }

  @Override
  public void autonomousPeriodic() {
    
  }

  @Override
  public void teleopInit() {

   // comp.stop();
  }

  @Override
  public void teleopPeriodic() {
    drivetrain.arcadeDrive(0.75*((stick.getY())), 0.75*(stick.getZ()));

    //if(xbox.getBumper(Hand.kLeft)){ 
   //   Solenoid.set(DoubleSolenoid.Value.kForward);// x.kForward means that one side has pressure applied and the other doesn't
   // }
    //else if(xbox.getBumper(Hand.kRight)){
    //  Solenoid.set(DoubleSolenoid.Value.kReverse);// Now the other side has pressure and the original one doesn't
    //}

    /**if(xbox.getAButtonPressed())
      comp.start();
    else if(xbox.getBButtonPressed())
      comp.stop();**/

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
