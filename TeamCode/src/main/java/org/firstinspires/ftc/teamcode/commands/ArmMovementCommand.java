package org.firstinspires.ftc.teamcode.commands;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;
import static org.firstinspires.ftc.teamcode.Constants.kp_MANUAL;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Constants;
import org.firstinspires.ftc.teamcode.PIController;
import org.firstinspires.ftc.teamcode.subsystems.ArmMovementSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.StateMachineSubsystem;

public class ArmMovementCommand extends CommandBase
{

    private final ArmMovementSubsystem m_subsystem;
    private final StateMachineSubsystem ms_subsystem;
    private final Gamepad m_gamepad;

    private final PIController m_PIrarm = new PIController(0.01, 0);
    private final PIController m_PIlarm = new PIController(0.01, 0);
    private final PIController m_PIworm = new PIController(0.005, 0);


    public double elbow_set_target;
    public double shoulder_set_target;



    public ArmMovementCommand(ArmMovementSubsystem arm_subsystem, StateMachineSubsystem state_subsystem, Gamepad OperatorController)
    {
        m_subsystem = arm_subsystem;
        ms_subsystem = state_subsystem;
        m_gamepad = OperatorController;
        addRequirements(arm_subsystem);
    }

    public void execute()
    {


        if (m_gamepad.b)
        {
            m_subsystem.SwitchCounter = m_subsystem.SwitchCounter + 1;
        }
        else
        {
            m_subsystem.SwitchCounter = 0;
        }

        if (m_gamepad.a)
        {
            m_subsystem.TargetPosition = Constants.kp_OFFWALL;
        }
        else if (m_gamepad.b)
        {
            if (m_subsystem.SwitchCounter == 1)
            {
                if (m_subsystem.TargetPosition == Constants.kp_UNDERCHAMBER)
                {
                    m_subsystem.TargetPosition = Constants.kp_TELECHAMBER;
                }
                else
                {
                    m_subsystem.TargetPosition = Constants.kp_UNDERCHAMBER;
                }
            }

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
        else if (m_gamepad.left_trigger > 0.5)
        {
            m_subsystem.TargetPosition = kp_MANUAL;
            shoulder_set_target = m_subsystem.getWormPosition();
            elbow_set_target = m_subsystem.getLarmPosition() - 25;
        }
        else if (m_gamepad.right_trigger > 0.5)
        {
            m_subsystem.TargetPosition = kp_MANUAL;
            shoulder_set_target = m_subsystem.getWormPosition();
            elbow_set_target = m_subsystem.getLarmPosition() + 25;
        }
        else if (m_gamepad.left_stick_button)
        {
            m_subsystem.TargetPosition = kp_MANUAL;
            shoulder_set_target = m_subsystem.getWormPosition() - 100;
            elbow_set_target = m_subsystem.getLarmPosition();
        }
        else if (m_gamepad.right_stick_button)
        {
            m_subsystem.TargetPosition = kp_MANUAL;
            shoulder_set_target = m_subsystem.getWormPosition() + 100;
            elbow_set_target = m_subsystem.getLarmPosition();
        }

        if (m_subsystem.TargetPosition == Constants.kp_MANUAL)
        {
            m_PIlarm.m_Ki = 0.001;
            m_PIrarm.m_Ki = 0.001;
        }
        else
        {
            m_PIlarm.m_Ki    = 0;
            m_PIlarm.m_Iterm = 0;
            m_PIrarm.m_Ki    = 0;
            m_PIlarm.m_Iterm = 0;
        }


        switch (m_subsystem.TargetPosition)
        {
            case Constants.kp_SUBMERSIBLE: ms_subsystem.arm_target = 240; ms_subsystem.worm_target = 3575; break;
            case Constants.kp_OFFWALL:     ms_subsystem.arm_target = 0;   ms_subsystem.worm_target = 0; break;
            case Constants.kp_UNDERCHAMBER:ms_subsystem.arm_target = 215; ms_subsystem.worm_target = 0; break;
            case Constants.kp_TELECHAMBER: ms_subsystem.arm_target = 320; ms_subsystem.worm_target = 0; break;
            case Constants.kp_OVERCHAMBER: ms_subsystem.arm_target = 0;   ms_subsystem.worm_target = 0; break;
            case Constants.kp_AUTOCHAMBER: ms_subsystem.arm_target = 0;   ms_subsystem.worm_target = 0; break;
            case Constants.kp_HIGHBASKET:  ms_subsystem.arm_target = 640; ms_subsystem.worm_target = 2650; break;
            case Constants.kp_ASCENT:      ms_subsystem.arm_target = -50; ms_subsystem.worm_target = -5850; break;
            case kp_MANUAL:                ms_subsystem.arm_target = elbow_set_target; ms_subsystem.worm_target = shoulder_set_target; break;
        }

        if (m_subsystem.TargetPosition == Constants.kp_OFFWALL)
        {

            if ((m_subsystem.getLarmPosition() < 20) & (m_subsystem.getLarmPosition() < 20))
            {
                m_PIrarm.m_Error = (ms_subsystem.arm_target - m_subsystem.getRarmPosition());
                m_PIlarm.m_Error = (ms_subsystem.arm_target - m_subsystem.getLarmPosition());
                m_PIworm.m_Error = (ms_subsystem.worm_target - m_subsystem.getWormPosition());
            }
            else
            {
                m_PIrarm.m_Error = 1;
                m_PIlarm.m_Error = 1;
                m_PIworm.m_Error = (ms_subsystem.worm_target - m_subsystem.getWormPosition());
            }

        }
        else
        {
            m_PIrarm.m_Error = (ms_subsystem.arm_target - m_subsystem.getRarmPosition());
            m_PIlarm.m_Error = (ms_subsystem.arm_target - m_subsystem.getLarmPosition());
            m_PIworm.m_Error = (ms_subsystem.worm_target - m_subsystem.getWormPosition());
        }

        m_subsystem.rarmspeed = m_PIrarm.GetPI();
        m_subsystem.larmspeed = m_PIlarm.GetPI();
        m_subsystem.wormspeed = m_PIworm.GetPI();



        m_subsystem.setArmSpeed(m_subsystem.rarmspeed, m_subsystem.larmspeed, m_subsystem.wormspeed);



    }

}
