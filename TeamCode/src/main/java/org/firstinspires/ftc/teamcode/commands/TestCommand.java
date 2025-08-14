package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;

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

    }

}
