package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;

import org.firstinspires.ftc.teamcode.Constants;
import org.firstinspires.ftc.teamcode.subsystems.DrivetrainSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.StateMachineSubsystem;

public class TestCommand extends CommandBase
{

    private final DrivetrainSubsystem m_subsystem;
    private final StateMachineSubsystem ms_subsystem;
    private final GamepadEx m_gamepad;

    public TestCommand(DrivetrainSubsystem DriveTrainSubsystem, StateMachineSubsystem StateMachineSubsystem, GamepadEx DriverController)
    {
        m_subsystem = DriveTrainSubsystem;
        ms_subsystem = StateMachineSubsystem;
        m_gamepad = DriverController;

        addRequirements(DriveTrainSubsystem);
    }

    @Override
    public void execute()
    {
        if ((m_subsystem.FRSetPosition < -Constants.k_TRAJECTORYTHRESHOLD)) {

            m_subsystem.FRPositionCoefficient = -Constants.k_TRAJECTORYTHRESHOLD;
            m_subsystem.FRPositionStateA = m_subsystem.FRPositionCoefficient / 2;
            m_subsystem.FRPositionStateB = m_subsystem.FRSetPosition + (Constants.k_TRAJECTORYTHRESHOLD / 2);
            m_subsystem.FRTimeStateA =  m_subsystem.TrajectoryPeriod / 2;
            m_subsystem.FRTimeStateB = (-(m_subsystem.FRPositionStateB - m_subsystem.FRPositionStateA) / Constants.k_TRAJECTORYCOEFFICIENT) + m_subsystem.FRTimeStateA;
            m_subsystem.FRTimeStateC = m_subsystem.FRTimeStateB +  m_subsystem.TrajectoryPeriod / 2;
        }
        else if (m_subsystem.FRSetPosition > Constants.k_TRAJECTORYTHRESHOLD)
        {
            m_subsystem.FRPositionCoefficient = Constants.k_TRAJECTORYTHRESHOLD;
            m_subsystem.FRPositionStateA = m_subsystem.FRPositionCoefficient / 2;
            m_subsystem.FRPositionStateB = m_subsystem.FRSetPosition - ( Constants.k_TRAJECTORYTHRESHOLD / 2);
            m_subsystem.FRTimeStateA =  m_subsystem.TrajectoryPeriod / 2;
            m_subsystem.FRTimeStateB = ((m_subsystem.FRPositionStateB - m_subsystem.FRPositionStateA) / Constants.k_TRAJECTORYCOEFFICIENT) + m_subsystem.FRTimeStateA;
            m_subsystem.FRTimeStateC = m_subsystem.FRTimeStateB +  m_subsystem.TrajectoryPeriod / 2;
        }
        else
        {
            m_subsystem.FRPositionCoefficient = m_subsystem.FRSetPosition;
            m_subsystem.FRPositionStateA = m_subsystem.FRSetPosition / 2;
            m_subsystem.FRPositionStateB = m_subsystem.FRSetPosition / 2;
            m_subsystem.FRTimeStateA =  m_subsystem.TrajectoryPeriod / 2;
            m_subsystem.FRTimeStateB =  m_subsystem.TrajectoryPeriod / 2;
            m_subsystem.FRTimeStateC = m_subsystem.TrajectoryPeriod;
        }

    }

}
