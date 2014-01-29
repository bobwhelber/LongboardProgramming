
package edu.wpi.first.wpilibj.TestRobotProj.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TestRobotProj.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ExampleSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Talon motor;

    public ExampleSubsystem() {
        this.motor = RobotMap.leftMotor;
    }
    
    public void go() {
        motor.set(1.0);
    }
    public void stop() {
        motor.set(0.0);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        motor.set(0.0);
    }
}

