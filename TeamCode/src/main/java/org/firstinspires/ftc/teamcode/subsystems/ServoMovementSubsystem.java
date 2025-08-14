package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;

import com.qualcomm.robotcore.hardware.HardwareMap;

public class ServoMovementSubsystem extends SubsystemBase
{

    private final ServoEx Wristservo;
    private final ServoEx Twistservo;
    private final ServoEx Clawservo;

    public ServoMovementSubsystem(ServoEx wrist, ServoEx twister, ServoEx claw)
    {
        Wristservo = wrist;
        Twistservo = twister;
        Clawservo  = claw;
    }

    public void SetServoPosition(double wrist_target, double twist_target, double claw_target)
    {
        Wristservo.turnToAngle(wrist_target);
        Twistservo.turnToAngle(twist_target);
        Clawservo .turnToAngle(claw_target);
    }
}
