/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.TestRobotProj.commands;

import edu.wpi.first.wpilibj.TestRobotProj.RobotMap;
import edu.wpi.first.wpilibj.TestRobotProj.TestRobot;

/**
 *
 * @author nrladmin
 */
public class oneMotorGo extends CommandBase {
    
    public oneMotorGo() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(exampleSubsystem);
        setTimeout(RobotMap.delt);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        exampleSubsystem.go();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
