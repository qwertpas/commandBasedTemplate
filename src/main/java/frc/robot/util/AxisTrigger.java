
package frc.robot.util;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

public class AxisTrigger extends Button{

    Joystick joystick;
    int axis;
    double threshold;

    public AxisTrigger(Joystick joystick, int axis, double threshold){
        this.joystick = joystick;
        this.axis = axis;
        this.threshold = threshold;
    }

    @Override
    public boolean get() {
        if(joystick.getRawAxis(axis) > threshold){
            return true;
        }else{
            return false;
        }
    }

}