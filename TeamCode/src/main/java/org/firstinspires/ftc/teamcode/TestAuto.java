package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandScheduler;
import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.commands.ArmMovementCommand;
import org.firstinspires.ftc.teamcode.commands.DrivetrainCommand;
import org.firstinspires.ftc.teamcode.commands.ServoMovementCommand;
import org.firstinspires.ftc.teamcode.subsystems.ArmMovementSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.ServoMovementSubsystem;
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

    private Motor Rarmmotor = null;
    private Motor Larmmotor = null;
    private Motor Wormmotor = null;

    private ServoEx Wristservo = null;
    private ServoEx Twistservo = null;
    private ServoEx Clawservo = null;

    @Override
    public void runOpMode()
    {

        FRmotor = new Motor(hardwareMap, "front right", Motor.GoBILDA.RPM_435);
        FLmotor = new Motor(hardwareMap, "front left", Motor.GoBILDA.RPM_435);
        BRmotor = new Motor(hardwareMap, "back right", Motor.GoBILDA.RPM_435);
        BLmotor = new Motor(hardwareMap, "back left", Motor.GoBILDA.RPM_435);

        Rarmmotor = new Motor(hardwareMap, "elbow", Motor.GoBILDA.RPM_117);
        Larmmotor = new Motor(hardwareMap, "larm", Motor.GoBILDA.RPM_117);
        Wormmotor = new Motor(hardwareMap, "worm gear", Motor.GoBILDA.RPM_223);

        Wristservo = new SimpleServo(hardwareMap, "wrist", 0, 300);
        Twistservo = new SimpleServo(hardwareMap, "twister", 0, 300);
        Clawservo = new SimpleServo(hardwareMap, "CLAW", 0, 300);

        FRmotor.setInverted(true);
        FLmotor.setInverted(false);
        BRmotor.setInverted(true);
        BLmotor.setInverted(false);

        FRmotor.resetEncoder();
        FLmotor.resetEncoder();
        BRmotor.resetEncoder();
        BLmotor.resetEncoder();

        Rarmmotor.resetEncoder();
        Larmmotor.resetEncoder();
        Wormmotor.resetEncoder();

        final StateMachineSubsystem m_StateMachineSubsystem = new StateMachineSubsystem();
        final DrivetrainSubsystem m_DrivetrainSubsystem = new DrivetrainSubsystem(FRmotor,FLmotor,BRmotor,BLmotor);
        final ArmMovementSubsystem m_ArmMovementSubsystem = new ArmMovementSubsystem(Rarmmotor, Larmmotor, Wormmotor);
        final ServoMovementSubsystem m_ServoMovementSubsystem = new ServoMovementSubsystem(Wristservo, Twistservo, Clawservo);

        m_StateMachineSubsystem.InAutonomous = true;
        m_StateMachineSubsystem.StateID = Constants.ks_ONE1;

        m_ServoMovementSubsystem.TargetPosition = 0;
        m_ArmMovementSubsystem.TargetPosition = 0;

        waitForStart();

        m_DrivetrainSubsystem.setDefaultCommand(new DrivetrainCommand(m_DrivetrainSubsystem, m_StateMachineSubsystem, null));
        m_ArmMovementSubsystem.setDefaultCommand(new ArmMovementCommand(m_ArmMovementSubsystem, m_StateMachineSubsystem, null));
        m_ServoMovementSubsystem.setDefaultCommand(new ServoMovementCommand(m_ServoMovementSubsystem, m_StateMachineSubsystem, null));

        while(opModeIsActive())
        {
            CommandScheduler.getInstance().run();

            telemetry.addData("state timer", m_DrivetrainSubsystem.Timer.milliseconds());

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

            telemetry.addData("PositionCoefficient",m_DrivetrainSubsystem.PositionCoefficient);
            telemetry.addData("PositionStateA",m_DrivetrainSubsystem.PositionStateA);
            telemetry.addData("PositionStateB",m_DrivetrainSubsystem.PositionStateB);
            telemetry.addData("TimeStateA", m_DrivetrainSubsystem.TimeStateA);
            telemetry.addData("TimeStateB", m_DrivetrainSubsystem.TimeStateB);
            telemetry.addData("TimeStateC", m_DrivetrainSubsystem.TimeStateC);

            telemetry.update();
        }

        FRmotor.resetEncoder();
        FLmotor.resetEncoder();
        BRmotor.resetEncoder();
        BLmotor.resetEncoder();

        CommandScheduler.getInstance().reset();
    }

}
