package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandScheduler;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.commands.ArmMovementCommand;
import org.firstinspires.ftc.teamcode.commands.DrivetrainCommand;
import org.firstinspires.ftc.teamcode.subsystems.ArmMovementSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.StateMachineSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.DrivetrainSubsystem;

@TeleOp(name="CoffeeCrab")
public class TestTeleOp extends LinearOpMode
{
    HardwareMap HMap;

    private Motor FRmotor = null;
    private Motor FLmotor = null;
    private Motor BRmotor = null;
    private Motor BLmotor = null;

    private Motor Rightmotor = null;
    private Motor Leftmotor = null;
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

        Rightmotor = new Motor(hardwareMap, "rarm", Motor.GoBILDA.RPM_117);
        Leftmotor = new Motor(hardwareMap, "larm", Motor.GoBILDA.RPM_117);
        Wormmotor = new Motor(hardwareMap, "worm gear", Motor.GoBILDA.RPM_223);


        Wristservo = new SimpleServo(hardwareMap, "wrist", 0, 300);
        Twistservo = new SimpleServo(hardwareMap, "twistyboi", 0, 200);
        Clawservo = new SimpleServo(hardwareMap, "THE CLAW", 0, 300);

        FRmotor.resetEncoder();
        FLmotor.resetEncoder();
        BRmotor.resetEncoder();
        BLmotor.resetEncoder();

        final DrivetrainSubsystem m_DrivetrainSubsystem = new DrivetrainSubsystem(FRmotor,FLmotor,BRmotor,BLmotor);
        final StateMachineSubsystem m_StateMachineSubsystem = new StateMachineSubsystem();
        final ArmMovementSubsystem m_ArmMovementSubsystem = new ArmMovementSubsystem(Rightmotor, Leftmotor, Wormmotor);

        GamepadEx DriverController =   new GamepadEx(gamepad1);
        GamepadEx OperatorController = new GamepadEx(gamepad2);
        m_StateMachineSubsystem.InAutonomous = false;

        waitForStart();

        m_DrivetrainSubsystem.setDefaultCommand(new DrivetrainCommand(m_DrivetrainSubsystem,m_StateMachineSubsystem,DriverController));
        m_ArmMovementSubsystem.setDefaultCommand(new ArmMovementCommand(m_ArmMovementSubsystem, OperatorController));

        while(opModeIsActive())
        {
            CommandScheduler.getInstance().run();

            telemetry.addData("leftX", DriverController.getLeftX());
            telemetry.addData("rightX", DriverController.getRightX());
            telemetry.addData("rightY", DriverController.getRightY());
            telemetry.addData("FRPosition", m_DrivetrainSubsystem.getFRPosition());
            telemetry.addData("FLPosition", m_DrivetrainSubsystem.getFLPosition());
            telemetry.addData("BRPosition", m_DrivetrainSubsystem.getBRPosition());
            telemetry.addData("BLPosition", m_DrivetrainSubsystem.getBLPosition());
            telemetry.update();
        }

    }

}
