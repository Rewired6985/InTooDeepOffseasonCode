package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandScheduler;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.commands.DrivetrainCommand;
import org.firstinspires.ftc.teamcode.subsystems.StateMachineSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.DrivetrainSubsystem;
//import org.firstinspires.ftc.teamcode.commands.DrivetrainCommand;

@Autonomous(name="BlockPush",preselectTeleOp = "CoffeeCrab")
public class TestAuto extends LinearOpMode
{

    private Motor FRmotor = null;
    private Motor FLmotor = null;
    private Motor BRmotor = null;
    private Motor BLmotor = null;

    @Override
    public void runOpMode()
    {

        Motor FRmotor = new Motor(hardwareMap, "front right", Motor.GoBILDA.RPM_435);
        Motor FLmotor = new Motor(hardwareMap, "front left", Motor.GoBILDA.RPM_435);
        Motor BRmotor = new Motor(hardwareMap, "back right", Motor.GoBILDA.RPM_435);
        Motor BLmotor = new Motor(hardwareMap, "back left", Motor.GoBILDA.RPM_435);

        FRmotor.setInverted(true);
        FLmotor.setInverted(false);
        BRmotor.setInverted(true);
        BLmotor.setInverted(false);

        FRmotor.resetEncoder();
        FLmotor.resetEncoder();
        BRmotor.resetEncoder();
        BLmotor.resetEncoder();

        final StateMachineSubsystem m_StateMachineSubsystem = new StateMachineSubsystem();
        final DrivetrainSubsystem m_DrivetrainSubsystem = new DrivetrainSubsystem(FRmotor,FLmotor,BRmotor,BLmotor);

        m_StateMachineSubsystem.InAutonomous = true;
        m_StateMachineSubsystem.StateID = Constants.ks_ONE1;

        waitForStart();

        m_DrivetrainSubsystem.setDefaultCommand(new DrivetrainCommand(m_DrivetrainSubsystem, m_StateMachineSubsystem, null));

        while(opModeIsActive())
        {
            CommandScheduler.getInstance().run();

            telemetry.addData("timer", m_DrivetrainSubsystem.Timer.milliseconds());

            telemetry.addData("FRPosition", m_DrivetrainSubsystem.getFRPosition());
            telemetry.addData("FLPosition", m_DrivetrainSubsystem.getFLPosition());
            telemetry.addData("BRPosition", m_DrivetrainSubsystem.getBRPosition());
            telemetry.addData("BLPosition", m_DrivetrainSubsystem.getBLPosition());

            telemetry.addData("FRDestination", m_DrivetrainSubsystem.FRDestination);
            telemetry.addData("FLDestination", m_DrivetrainSubsystem.FLDestination);
            telemetry.addData("BRDestination", m_DrivetrainSubsystem.BRDestination);
            telemetry.addData("BLDestination", m_DrivetrainSubsystem.BLDestination);

            telemetry.addData("GeneralPosition", m_DrivetrainSubsystem.setTrajectoryTarget());

            telemetry.addData("StateID", m_StateMachineSubsystem.StateID);

            telemetry.update();
        }

        FRmotor.resetEncoder();
        FLmotor.resetEncoder();
        BRmotor.resetEncoder();
        BLmotor.resetEncoder();

        CommandScheduler.getInstance().reset();
    }

}
