package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.Constants;
import org.firstinspires.ftc.teamcode.subsystems.ArmMovementSubsystem;

public class ArmMovementCommand extends CommandBase
{

    private final ArmMovementSubsystem m_subsystem;
    private final GamepadEx m_gamepad;

    public int rarm_target;
    public int larm_target;
    public int worm_target;
    public double m_rarmspeed;
    public double m_larmspeed;
    public double m_wormspeed;

    public ArmMovementCommand(ArmMovementSubsystem subsystem, GamepadEx OperatorController)
    {
        m_subsystem = subsystem;
        m_gamepad = OperatorController;
        addRequirements(subsystem);
    }

    public void execute()
    {



        switch (m_subsystem.TargetPosition)
        {
            case Constants.kp_SUBMERSIBLE: rarm_target = 0; larm_target = 0; worm_target = 0; break;
            case Constants.kp_OFFWALL:     rarm_target = 0; larm_target = 0; worm_target = 0; break;
            case Constants.kp_UNDERCHANBER:rarm_target = 0; larm_target = 0; worm_target = 0; break;
            case Constants.kp_TELECHAMBER: rarm_target = 0; larm_target = 0; worm_target = 0; break;
            case Constants.kp_OVERCHAMBER: rarm_target = 0; larm_target = 0; worm_target = 0; break;
            case Constants.kp_AUTOCHAMBER: rarm_target = 0; larm_target = 0; worm_target = 0; break;
            case Constants.kp_HIGHBASKET:  rarm_target = 0; larm_target = 0; worm_target = 0; break;
            case Constants.kp_ASCENT:      rarm_target = 0; larm_target = 0; worm_target = 0; break;
        }

        switch (m_subsystem.TargetPosition)
        {
            case Constants.kp_SUBMERSIBLE:
            case Constants.kp_OFFWALL:
            case Constants.kp_UNDERCHANBER:
            case Constants.kp_TELECHAMBER:
            case Constants.kp_OVERCHAMBER:
            case Constants.kp_AUTOCHAMBER:
            case Constants.kp_HIGHBASKET:
            case Constants.kp_ASCENT:
            {
                m_rarmspeed = (rarm_target - m_subsystem.getRarmPosition()) * Constants.k_ELBOWPROPORTIONALCOEFFICIENT;
                m_larmspeed = (larm_target - m_subsystem.getLarmPosition()) * Constants.k_ELBOWPROPORTIONALCOEFFICIENT;
                m_wormspeed = (worm_target - m_subsystem.getWormPosition()) * Constants.k_SHOULDERPROPORTIONALCOEFFICIENT;
                break;
            }
        }

        m_subsystem.setArmSpeed(m_rarmspeed, m_larmspeed, m_wormspeed);



    }

}
