package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandScheduler;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.commands.ArmMovementCommand;
import org.firstinspires.ftc.teamcode.commands.DrivetrainCommand;
import org.firstinspires.ftc.teamcode.commands.ServoMovementCommand;
import org.firstinspires.ftc.teamcode.subsystems.ArmMovementSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.ServoMovementSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.StateMachineSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.DrivetrainSubsystem;

@TeleOp(name="CoffeeCrab")
public class TestTeleOp extends LinearOpMode
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
        FRmotor = new Motor(hardwareMap, "back left", Motor.GoBILDA.RPM_435);
        FLmotor = new Motor(hardwareMap, "back right", Motor.GoBILDA.RPM_435);
        BRmotor = new Motor(hardwareMap, "front left", Motor.GoBILDA.RPM_435);
        BLmotor = new Motor(hardwareMap, "front right", Motor.GoBILDA.RPM_435);

        Rarmmotor = new Motor(hardwareMap, "elbow", Motor.GoBILDA.RPM_117);
        Larmmotor = new Motor(hardwareMap, "larm", Motor.GoBILDA.RPM_117);
        Wormmotor = new Motor(hardwareMap, "worm gear", Motor.GoBILDA.RPM_223);

        Wristservo = new SimpleServo(hardwareMap, "wrist", 0, 300);
        Twistservo = new SimpleServo(hardwareMap, "twister", 0, 300);
        Clawservo = new SimpleServo(hardwareMap, "CLAW", 0, 300);

        Larmmotor.setInverted(true);
        Wormmotor.setInverted(true);

        Rarmmotor.resetEncoder();
        Larmmotor.resetEncoder();
        Wormmotor.resetEncoder();

        final DrivetrainSubsystem m_DrivetrainSubsystem = new DrivetrainSubsystem(FRmotor,FLmotor,BRmotor,BLmotor);
        final StateMachineSubsystem m_StateMachineSubsystem = new StateMachineSubsystem();
        final ArmMovementSubsystem m_ArmMovementSubsystem = new ArmMovementSubsystem(Rarmmotor, Larmmotor, Wormmotor);
        final ServoMovementSubsystem m_ServoMovementSubsystem = new ServoMovementSubsystem(Wristservo, Twistservo, Clawservo);

        Gamepad DriverController =   new Gamepad();
        Gamepad OperatorController = new Gamepad();

        OperatorController.reset();
        DriverController.reset();

        m_StateMachineSubsystem.InAutonomous = false;

        m_ServoMovementSubsystem.TargetPosition = 0;
        m_ArmMovementSubsystem.TargetPosition = 0;

        waitForStart();

        m_DrivetrainSubsystem.setDefaultCommand(new DrivetrainCommand(m_DrivetrainSubsystem,m_StateMachineSubsystem,OperatorController));
        m_ArmMovementSubsystem.setDefaultCommand(new ArmMovementCommand(m_ArmMovementSubsystem, m_StateMachineSubsystem, OperatorController));
        m_ServoMovementSubsystem.setDefaultCommand(new ServoMovementCommand(m_ServoMovementSubsystem, m_StateMachineSubsystem, OperatorController));

        while(opModeIsActive())
        {
            CommandScheduler.getInstance().run();

            telemetry.addData("leftX", DriverController.left_stick_x);
            telemetry.addData("rightX", DriverController.right_stick_x);
            telemetry.addData("rightY", DriverController.right_stick_y);
            telemetry.addData("FRPosition", m_DrivetrainSubsystem.getFRPosition());
            telemetry.addData("FLPosition", m_DrivetrainSubsystem.getFLPosition());
            telemetry.addData("BRPosition", m_DrivetrainSubsystem.getBRPosition());
            telemetry.addData("BLPosition", m_DrivetrainSubsystem.getBLPosition());
            telemetry.addData("RarmPosition", m_ArmMovementSubsystem.getRarmPosition());
            telemetry.addData("LarmPosition", m_ArmMovementSubsystem.getLarmPosition());
            telemetry.addData("WormPosition", m_ArmMovementSubsystem.getWormPosition());
            telemetry.addData("ArmTarget", m_ArmMovementSubsystem.TargetPosition);

            telemetry.update();
        }

        CommandScheduler.getInstance().reset();

    }

}
