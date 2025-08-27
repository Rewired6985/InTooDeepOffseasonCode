package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Constants;
import org.firstinspires.ftc.teamcode.subsystems.ArmMovementSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.ServoMovementSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.StateMachineSubsystem;

public class ServoMovementCommand extends CommandBase
{

    private final ServoMovementSubsystem m_subsystem;
    private final StateMachineSubsystem ms_subsystem;
    private final Gamepad m_gamepad;


    public ServoMovementCommand(ServoMovementSubsystem arm_subsystem, StateMachineSubsystem state_subsystem, Gamepad OperatorController)
    {
        m_subsystem = arm_subsystem;
        ms_subsystem = state_subsystem;
        m_gamepad = OperatorController;
        addRequirements(arm_subsystem);
    }

    public void execute()
    {

        if (m_gamepad.a)
        {
            m_subsystem.TargetPosition = Constants.kp_OFFWALL;
        }
        else if (m_gamepad.b)
        {
            m_subsystem.TargetPosition =  Constants.kp_UNDERCHAMBER;
        }
        else if (m_gamepad.y)
        {
            m_subsystem.TargetPosition = Constants.kp_HIGHBASKET;
        }
        else if (m_gamepad.back)
        {
            m_subsystem.TargetPosition = Constants.kp_SUBMERSIBLE;
        }
//        else if (m_gamepad.ps)
//        {
//            m_subsystem.TargetPosition = Constants.kp_ASCENT;
//        }
        if (m_gamepad.dpad_down)
        {
            m_subsystem.TargetPosition = Constants.kp_TWIST0;
        }
        else if (m_gamepad.dpad_left)
        {
            m_subsystem.TargetPosition = Constants.kp_TWIST45;
        }
        else if (m_gamepad.dpad_up)
        {
            m_subsystem.TargetPosition = Constants.kp_TWIST90;
        }
        else if (m_gamepad.dpad_right)
        {
            m_subsystem.TargetPosition = Constants.kp_TWIST135;
        }
        else if (m_gamepad.back)
        {
            m_subsystem.TargetPosition = Constants.kp_TWIST180;
        }

        if (m_gamepad.x)
        {
            m_subsystem.SwitchCounter = m_subsystem.SwitchCounter + 1;
        }
        else
        {
            m_subsystem.SwitchCounter = 0;
        }

        if (m_gamepad.x)
        {
            if (m_subsystem.SwitchCounter == 1)
            {
                if(m_subsystem.ClawOpen == true)
                {
                    m_subsystem.ClawOpen = false;
                    ms_subsystem.claw_target = 240;
                }
                else
                {
                    m_subsystem.ClawOpen = true;
                    ms_subsystem.claw_target = 300;
                }
            }
        }



        switch (m_subsystem.TargetPosition)
        {
            case Constants.kp_SUBMERSIBLE:   ms_subsystem.wrist_target = 100; ms_subsystem.twister_target = 0; break;
            case Constants.kp_OFFWALL:       ms_subsystem.wrist_target = 225; ms_subsystem.twister_target = 0; break;
            case Constants.kp_UNDERCHAMBER:  ms_subsystem.wrist_target = 90;  ms_subsystem.twister_target = 180; break;
            case Constants.kp_OVERCHAMBER:   ms_subsystem.wrist_target = 0;   ms_subsystem.twister_target = 0; break;
            case Constants.kp_AUTOCHAMBER:   ms_subsystem.wrist_target = 0;   ms_subsystem.twister_target = 0; break;
            case Constants.kp_HIGHBASKET:    ms_subsystem.wrist_target = 160; ms_subsystem.twister_target = 0; break;
            case Constants.kp_ASCENT:        ms_subsystem.wrist_target = 300; ms_subsystem.twister_target = 0; break;
            case Constants.kp_TWIST0:        ms_subsystem.twister_target = 0; break;
            case Constants.kp_TWIST45:       ms_subsystem.twister_target = 45; break;
            case Constants.kp_TWIST90:       ms_subsystem.twister_target = 90; break;
            case Constants.kp_TWIST135:      ms_subsystem.twister_target = 135; break;
            case Constants.kp_TWIST180:      ms_subsystem.twister_target = 180; break;
        }

        m_subsystem.SetServoPosition(ms_subsystem.wrist_target, ms_subsystem.twister_target, ms_subsystem.claw_target);



    }

}
