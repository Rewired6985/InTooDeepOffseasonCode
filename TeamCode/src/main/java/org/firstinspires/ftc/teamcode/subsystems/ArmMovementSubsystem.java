package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;

import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.arcrobotics.ftclib.hardware.motors.Motor;

import com.qualcomm.robotcore.hardware.HardwareMap;

public class ArmMovementSubsystem extends SubsystemBase
{

    public int TargetPosition;

    private final Motor Rightmotor;
    private final Motor Leftmotor;
    private final Motor Wormmotor;

    public double rarmspeed;
    public double larmspeed;
    public double wormspeed;
    public int SwitchCounter;

    public ArmMovementSubsystem(Motor rarm, Motor larm, Motor warm)
    {
        Rightmotor = rarm;
        Leftmotor = larm;
        Wormmotor = warm;
    }

    public void setTargetPosition(int target_position)
    {
        TargetPosition = target_position;
    }

    public double getRarmPosition()
    {
     return Rightmotor.getCurrentPosition();
    }

    public double getLarmPosition()
    {
        return Leftmotor.getCurrentPosition();
    }

    public double getWormPosition()
    {
        return Wormmotor.getCurrentPosition();
    }

    public void setArmSpeed(double rarm_speed, double larm_speed, double worm_speed)
    {
        Rightmotor.set(rarm_speed);
        Leftmotor.set(larm_speed);
        Wormmotor.set(worm_speed);
    }

}
