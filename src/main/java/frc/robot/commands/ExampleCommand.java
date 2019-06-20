/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class ExampleCommand extends Command {

  private int iterations;

  public ExampleCommand() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_subsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    iterations = 0;
    System.out.println("ExampleCommand has initialized");
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    System.out.println("ExampleCommand is executing, on iteration: " + iterations);
    iterations++;
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    if(iterations > 10){
      return true;
    } else {
      return false;
    }
    //When this command is bound to a button using whenPressed(), 
    // it will stop running once it has executed 10 times.
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    System.out.println("ExampleCommand has ended");
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
