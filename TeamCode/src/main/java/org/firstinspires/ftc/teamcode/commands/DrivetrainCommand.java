package org.firstinspires.ftc.teamcode.commands;


import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;

import org.firstinspires.ftc.teamcode.Constants;
import org.firstinspires.ftc.teamcode.subsystems.DrivetrainSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.StateMachineSubsystem;


public class DrivetrainCommand extends CommandBase
{

    private final DrivetrainSubsystem m_subsystem;
    private final StateMachineSubsystem ms_subsystem;
    private final GamepadEx m_drivercontroller;


        public boolean UseCustom = false;
        public double FRspeed = 0;
        public double FLspeed = 0;
        public double BRspeed = 0;
        public double BLspeed = 0;
        public double FRtarget = 0;
        public double FLtarget = 0;
        public double BRtarget = 0;
        public double BLtarget = 0;
        public double FRStartPosition = 0;
        public double FLStartPosition = 0;
        public double BRStartPosition = 0;
        public double BLStartPosition = 0;
        public double LeftX = 0;
        public double RightX = 0;
        public double RightY = 0;


    public DrivetrainCommand
            (DrivetrainSubsystem subsystem,
             StateMachineSubsystem state_subsystem,
             GamepadEx DriverController)
    {
        m_subsystem = subsystem;
        ms_subsystem = state_subsystem;
        m_drivercontroller = DriverController;

        addRequirements(subsystem);
    }

    public void execute()
    {

        ms_subsystem.StateHandler();

        if (ms_subsystem.FirstScan)
        {

            UseCustom = false;
            m_subsystem.Timer.reset();

            if(UseCustom)
            {
                FRStartPosition = m_subsystem.FRSetPosition + FRStartPosition;
                FLStartPosition = m_subsystem.FLSetPosition + FLStartPosition;
                BRStartPosition = m_subsystem.BRSetPosition + BRStartPosition;
                BLStartPosition = m_subsystem.BLSetPosition + BLStartPosition;
            }
            else
            {
                FRStartPosition = (m_subsystem.SetPosition) + FRStartPosition;
                FLStartPosition = (m_subsystem.SetPosition * m_subsystem.StrafeCoefficient) + FLStartPosition;
                BRStartPosition = (m_subsystem.SetPosition * m_subsystem.StrafeCoefficient) + BRStartPosition;
                BLStartPosition = (m_subsystem.SetPosition) + BLStartPosition;
            }

            switch (ms_subsystem.StateID)
            {
                case Constants.ks_ALL0:
                {
                    m_subsystem.SetPosition = 0;
                    m_subsystem.MovementMethod = Constants.km_DRIVE;
                    break;
                }
                case Constants.ks_ONE1: {
                    if (Constants.km_ONE1 == Constants.km_STRAFE)
                    {
                        m_subsystem.SetPosition = Constants.kd_ONE1 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE1 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE2: {
                    if (Constants.km_ONE2 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE2 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE2 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE3: {
                    if (Constants.km_ONE3 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE3 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE3 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE4: {
                    if (Constants.km_ONE4 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE4 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE4 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE5: {
                    if (Constants.km_ONE5 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE5 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE5 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE6: {
                    if (Constants.km_ONE6 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE6 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE6 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE7: {
                    if (Constants.km_ONE7 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE7 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE7 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE8: {
                    if (Constants.km_ONE8 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE8 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE8 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE9: {
                    if (Constants.km_ONE9 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE9 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE9 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE10: {
                    if (Constants.km_ONE10 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE10 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE10 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE11: {
                    if (Constants.km_ONE11 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE11 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE11 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE12: {
                    if (Constants.km_ONE12 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE12 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE12 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE13: {
                    if (Constants.km_ONE13 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE13 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE13 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE14: {
                    if (Constants.km_ONE14 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE14 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE14 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE15: {
                    if (Constants.km_ONE15 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE15 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE15 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE16: {
                    if (Constants.km_ONE16 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE16 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE16 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE17: {
                    if (Constants.km_ONE17 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE17 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE17 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE18: {
                    if (Constants.km_ONE18 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE18 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE18 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE19: {
                    if (Constants.km_ONE19 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE19 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE19 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE20: {
                    if (Constants.km_ONE20 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE20 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE20 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE21: {
                    if (Constants.km_ONE21 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE21 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE21 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE22: {
                    if (Constants.km_ONE22 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE22 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE22 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE23: {
                    if (Constants.km_ONE23 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE23 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE23 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE24: {
                    if (Constants.km_ONE24 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE24 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE24 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE25: {
                    if (Constants.km_ONE25 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE25 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE25 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE26: {
                    if (Constants.km_ONE26 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE26 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE6 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE27: {
                    if (Constants.km_ONE27 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE27 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE27 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE28: {
                    if (Constants.km_ONE28 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE28 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE28 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE29: {
                    if (Constants.km_ONE29 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE29 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE29 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONE30: {
                    if (Constants.km_ONE30 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_ONE30 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_ONE30 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_ONECUSTOM1: {
                    m_subsystem.FRSetPosition = Constants.kdfr_ONECUSTOM1;
                    m_subsystem.FLSetPosition = Constants.kdfl_ONECUSTOM1;
                    m_subsystem.BRSetPosition = Constants.kdbr_ONECUSTOM1;
                    m_subsystem.BLSetPosition = Constants.kdbl_ONECUSTOM1;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_ONECUSTOM2: {
                    m_subsystem.FRSetPosition = Constants.kdfr_ONECUSTOM2;
                    m_subsystem.FLSetPosition = Constants.kdfl_ONECUSTOM2;
                    m_subsystem.BRSetPosition = Constants.kdbr_ONECUSTOM2;
                    m_subsystem.BLSetPosition = Constants.kdbl_ONECUSTOM2;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_ONECUSTOM3: {
                    m_subsystem.FRSetPosition = Constants.kdfr_ONECUSTOM3;
                    m_subsystem.FLSetPosition = Constants.kdfl_ONECUSTOM3;
                    m_subsystem.BRSetPosition = Constants.kdbr_ONECUSTOM3;
                    m_subsystem.BLSetPosition = Constants.kdbl_ONECUSTOM3;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_ONECUSTOM4: {
                    m_subsystem.FRSetPosition = Constants.kdfr_ONECUSTOM4;
                    m_subsystem.FLSetPosition = Constants.kdfl_ONECUSTOM4;
                    m_subsystem.BRSetPosition = Constants.kdbr_ONECUSTOM4;
                    m_subsystem.BLSetPosition = Constants.kdbl_ONECUSTOM4;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_ONECUSTOM5: {
                    m_subsystem.FRSetPosition = Constants.kdfr_ONECUSTOM5;
                    m_subsystem.FLSetPosition = Constants.kdfl_ONECUSTOM5;
                    m_subsystem.BRSetPosition = Constants.kdbr_ONECUSTOM5;
                    m_subsystem.BLSetPosition = Constants.kdbl_ONECUSTOM5;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_ONECUSTOM6: {
                    m_subsystem.FRSetPosition = Constants.kdfr_ONECUSTOM6;
                    m_subsystem.FLSetPosition = Constants.kdfl_ONECUSTOM6;
                    m_subsystem.BRSetPosition = Constants.kdbr_ONECUSTOM6;
                    m_subsystem.BLSetPosition = Constants.kdbl_ONECUSTOM6;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_ONECUSTOM7: {
                    m_subsystem.FRSetPosition = Constants.kdfr_ONECUSTOM7;
                    m_subsystem.FLSetPosition = Constants.kdfl_ONECUSTOM7;
                    m_subsystem.BRSetPosition = Constants.kdbr_ONECUSTOM7;
                    m_subsystem.BLSetPosition = Constants.kdbl_ONECUSTOM7;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_ONECUSTOM8: {
                    m_subsystem.FRSetPosition = Constants.kdfr_ONECUSTOM8;
                    m_subsystem.FLSetPosition = Constants.kdfl_ONECUSTOM8;
                    m_subsystem.BRSetPosition = Constants.kdbr_ONECUSTOM8;
                    m_subsystem.BLSetPosition = Constants.kdbl_ONECUSTOM8;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_ONECUSTOM9: {
                    m_subsystem.FRSetPosition = Constants.kdfr_ONECUSTOM9;
                    m_subsystem.FLSetPosition = Constants.kdfl_ONECUSTOM9;
                    m_subsystem.BRSetPosition = Constants.kdbr_ONECUSTOM9;
                    m_subsystem.BLSetPosition = Constants.kdbl_ONECUSTOM9;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_ONECUSTOM10: {
                    m_subsystem.FRSetPosition = Constants.kdfr_ONECUSTOM10;
                    m_subsystem.FLSetPosition = Constants.kdfl_ONECUSTOM10;
                    m_subsystem.BRSetPosition = Constants.kdbr_ONECUSTOM10;
                    m_subsystem.BLSetPosition = Constants.kdbl_ONECUSTOM10;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }


                //end of auto one

                case Constants.ks_TWO1: {
                    if (Constants.km_TWO1 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO1 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO1 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO2: {
                    if (Constants.km_TWO2 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO2 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO2 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO3: {
                    if (Constants.km_TWO3 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO3 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO3 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO4: {
                    if (Constants.km_TWO4 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO4 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO4 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO5: {
                    if (Constants.km_TWO5 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO5 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO5 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO6: {
                    if (Constants.km_TWO6 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO6 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO6 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO7: {
                    if (Constants.km_TWO7 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO7 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO7 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO8: {
                    if (Constants.km_TWO8 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO8 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO8 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO9: {
                    if (Constants.km_TWO9 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO9 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO9 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO10: {
                    if (Constants.km_TWO10 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO10 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO10 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO11: {
                    if (Constants.km_TWO11 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO11 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO11 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO12: {
                    if (Constants.km_TWO12 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO12 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO12 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO13: {
                    if (Constants.km_TWO13 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO13 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO13 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO14: {
                    if (Constants.km_TWO14 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO14 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO14 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO15: {
                    if (Constants.km_TWO15 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO15 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO15 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO16: {
                    if (Constants.km_TWO16 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO16 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO16 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO17: {
                    if (Constants.km_TWO17 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO17 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO17 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO18: {
                    if (Constants.km_TWO18 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO18 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO18 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO19: {
                    if (Constants.km_TWO19 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO19 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO19 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO20: {
                    if (Constants.km_TWO20 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO20 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO20 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO21: {
                    if (Constants.km_TWO21 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO21 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO21 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO22: {
                    if (Constants.km_TWO22 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO22 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO22 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO23: {
                    if (Constants.km_TWO23 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO23 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO23 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO24: {
                    if (Constants.km_TWO24 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO24 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO24 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO25: {
                    if (Constants.km_TWO25 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO25 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO25 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO26: {
                    if (Constants.km_TWO26 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO26 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO6 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO27: {
                    if (Constants.km_TWO27 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO27 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO27 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO28: {
                    if (Constants.km_TWO28 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO28 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO28 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO29: {
                    if (Constants.km_TWO29 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO29 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO29 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWO30: {
                    if (Constants.km_TWO30 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_TWO30 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_TWO30 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_TWOCUSTOM1: {
                    m_subsystem.FRSetPosition = Constants.kdfr_TWOCUSTOM1;
                    m_subsystem.FLSetPosition = Constants.kdfl_TWOCUSTOM1;
                    m_subsystem.BRSetPosition = Constants.kdbr_TWOCUSTOM1;
                    m_subsystem.BLSetPosition = Constants.kdbl_TWOCUSTOM1;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_TWOCUSTOM2: {
                    m_subsystem.FRSetPosition = Constants.kdfr_TWOCUSTOM2;
                    m_subsystem.FLSetPosition = Constants.kdfl_TWOCUSTOM2;
                    m_subsystem.BRSetPosition = Constants.kdbr_TWOCUSTOM2;
                    m_subsystem.BLSetPosition = Constants.kdbl_TWOCUSTOM2;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_TWOCUSTOM3: {
                    m_subsystem.FRSetPosition = Constants.kdfr_TWOCUSTOM3;
                    m_subsystem.FLSetPosition = Constants.kdfl_TWOCUSTOM3;
                    m_subsystem.BRSetPosition = Constants.kdbr_TWOCUSTOM3;
                    m_subsystem.BLSetPosition = Constants.kdbl_TWOCUSTOM3;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_TWOCUSTOM4: {
                    m_subsystem.FRSetPosition = Constants.kdfr_TWOCUSTOM4;
                    m_subsystem.FLSetPosition = Constants.kdfl_TWOCUSTOM4;
                    m_subsystem.BRSetPosition = Constants.kdbr_TWOCUSTOM4;
                    m_subsystem.BLSetPosition = Constants.kdbl_TWOCUSTOM4;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_TWOCUSTOM5: {
                    m_subsystem.FRSetPosition = Constants.kdfr_TWOCUSTOM5;
                    m_subsystem.FLSetPosition = Constants.kdfl_TWOCUSTOM5;
                    m_subsystem.BRSetPosition = Constants.kdbr_TWOCUSTOM5;
                    m_subsystem.BLSetPosition = Constants.kdbl_TWOCUSTOM5;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_TWOCUSTOM6: {
                    m_subsystem.FRSetPosition = Constants.kdfr_TWOCUSTOM6;
                    m_subsystem.FLSetPosition = Constants.kdfl_TWOCUSTOM6;
                    m_subsystem.BRSetPosition = Constants.kdbr_TWOCUSTOM6;
                    m_subsystem.BLSetPosition = Constants.kdbl_TWOCUSTOM6;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_TWOCUSTOM7: {
                    m_subsystem.FRSetPosition = Constants.kdfr_TWOCUSTOM7;
                    m_subsystem.FLSetPosition = Constants.kdfl_TWOCUSTOM7;
                    m_subsystem.BRSetPosition = Constants.kdbr_TWOCUSTOM7;
                    m_subsystem.BLSetPosition = Constants.kdbl_TWOCUSTOM7;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_TWOCUSTOM8: {
                    m_subsystem.FRSetPosition = Constants.kdfr_TWOCUSTOM8;
                    m_subsystem.FLSetPosition = Constants.kdfl_TWOCUSTOM8;
                    m_subsystem.BRSetPosition = Constants.kdbr_TWOCUSTOM8;
                    m_subsystem.BLSetPosition = Constants.kdbl_TWOCUSTOM8;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_TWOCUSTOM9: {
                    m_subsystem.FRSetPosition = Constants.kdfr_TWOCUSTOM9;
                    m_subsystem.FLSetPosition = Constants.kdfl_TWOCUSTOM9;
                    m_subsystem.BRSetPosition = Constants.kdbr_TWOCUSTOM9;
                    m_subsystem.BLSetPosition = Constants.kdbl_TWOCUSTOM9;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_TWOCUSTOM10: {
                    m_subsystem.FRSetPosition = Constants.kdfr_TWOCUSTOM10;
                    m_subsystem.FLSetPosition = Constants.kdfl_TWOCUSTOM10;
                    m_subsystem.BRSetPosition = Constants.kdbr_TWOCUSTOM10;
                    m_subsystem.BLSetPosition = Constants.kdbl_TWOCUSTOM10;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }


                //end of auto 2

                case Constants.ks_THREE1: {
                    if (Constants.km_THREE1 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE1 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE1 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE2: {
                    if (Constants.km_THREE2 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE2 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE2 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE3: {
                    if (Constants.km_THREE3 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE3 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE3 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE4: {
                    if (Constants.km_THREE4 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE4 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE4 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE5: {
                    if (Constants.km_THREE5 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE5 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE5 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE6: {
                    if (Constants.km_THREE6 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE6 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE6 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE7: {
                    if (Constants.km_THREE7 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE7 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE7 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE8: {
                    if (Constants.km_THREE8 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE8 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE8 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE9: {
                    if (Constants.km_THREE9 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE9 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE9 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE10: {
                    if (Constants.km_THREE10 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE10 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE10 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE11: {
                    if (Constants.km_THREE11 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE11 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE11 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE12: {
                    if (Constants.km_THREE12 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE12 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE12 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE13: {
                    if (Constants.km_THREE13 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE13 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE13 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE14: {
                    if (Constants.km_THREE14 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE14 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE14 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE15: {
                    if (Constants.km_THREE15 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE15 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE15 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE16: {
                    if (Constants.km_THREE16 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE16 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE16 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE17: {
                    if (Constants.km_THREE17 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE17 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE17 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE18: {
                    if (Constants.km_THREE18 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE18 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE18 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE19: {
                    if (Constants.km_THREE19 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE19 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE19 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE20: {
                    if (Constants.km_THREE20 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE20 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE20 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE21: {
                    if (Constants.km_THREE21 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE21 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE21 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE22: {
                    if (Constants.km_THREE22 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE22 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE22 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE23: {
                    if (Constants.km_THREE23 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE23 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE23 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE24: {
                    if (Constants.km_THREE24 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE24 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE24 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE25: {
                    if (Constants.km_THREE25 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE25 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE25 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE26: {
                    if (Constants.km_THREE26 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE26 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE6 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE27: {
                    if (Constants.km_THREE27 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE27 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE27 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE28: {
                    if (Constants.km_THREE28 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE28 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE28 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE29: {
                    if (Constants.km_THREE29 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE29 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE29 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREE30: {
                    if (Constants.km_THREE30 == Constants.km_STRAFE) {
                        m_subsystem.SetPosition = Constants.kd_THREE30 * Constants.k_STRAFECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_STRAFE;                    } else {
                        m_subsystem.SetPosition = Constants.kd_THREE30 * Constants.k_DRIVECONVERSION;
                        m_subsystem.MovementMethod = Constants.km_DRIVE;                    }
                    break;
                }
                case Constants.ks_THREECUSTOM1:
                {
                    m_subsystem.FRSetPosition = Constants.kdfr_THREECUSTOM1;
                    m_subsystem.FLSetPosition = Constants.kdfl_THREECUSTOM1;
                    m_subsystem.BRSetPosition = Constants.kdbr_THREECUSTOM1;
                    m_subsystem.BLSetPosition = Constants.kdbl_THREECUSTOM1;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_THREECUSTOM2: {
                    m_subsystem.FRSetPosition = Constants.kdfr_THREECUSTOM2;
                    m_subsystem.FLSetPosition = Constants.kdfl_THREECUSTOM2;
                    m_subsystem.BRSetPosition = Constants.kdbr_THREECUSTOM2;
                    m_subsystem.BLSetPosition = Constants.kdbl_THREECUSTOM2;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_THREECUSTOM3: {
                    m_subsystem.FRSetPosition = Constants.kdfr_THREECUSTOM3;
                    m_subsystem.FLSetPosition = Constants.kdfl_THREECUSTOM3;
                    m_subsystem.BRSetPosition = Constants.kdbr_THREECUSTOM3;
                    m_subsystem.BLSetPosition = Constants.kdbl_THREECUSTOM3;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_THREECUSTOM4: {
                    m_subsystem.FRSetPosition = Constants.kdfr_THREECUSTOM4;
                    m_subsystem.FLSetPosition = Constants.kdfl_THREECUSTOM4;
                    m_subsystem.BRSetPosition = Constants.kdbr_THREECUSTOM4;
                    m_subsystem.BLSetPosition = Constants.kdbl_THREECUSTOM4;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_THREECUSTOM5: {
                    m_subsystem.FRSetPosition = Constants.kdfr_THREECUSTOM5;
                    m_subsystem.FLSetPosition = Constants.kdfl_THREECUSTOM5;
                    m_subsystem.BRSetPosition = Constants.kdbr_THREECUSTOM5;
                    m_subsystem.BLSetPosition = Constants.kdbl_THREECUSTOM5;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_THREECUSTOM6: {
                    m_subsystem.FRSetPosition = Constants.kdfr_THREECUSTOM6;
                    m_subsystem.FLSetPosition = Constants.kdfl_THREECUSTOM6;
                    m_subsystem.BRSetPosition = Constants.kdbr_THREECUSTOM6;
                    m_subsystem.BLSetPosition = Constants.kdbl_THREECUSTOM6;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_THREECUSTOM7: {
                    m_subsystem.FRSetPosition = Constants.kdfr_THREECUSTOM7;
                    m_subsystem.FLSetPosition = Constants.kdfl_THREECUSTOM7;
                    m_subsystem.BRSetPosition = Constants.kdbr_THREECUSTOM7;
                    m_subsystem.BLSetPosition = Constants.kdbl_THREECUSTOM7;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_THREECUSTOM8: {
                    m_subsystem.FRSetPosition = Constants.kdfr_THREECUSTOM8;
                    m_subsystem.FLSetPosition = Constants.kdfl_THREECUSTOM8;
                    m_subsystem.BRSetPosition = Constants.kdbr_THREECUSTOM8;
                    m_subsystem.BLSetPosition = Constants.kdbl_THREECUSTOM8;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_THREECUSTOM9: {
                    m_subsystem.FRSetPosition = Constants.kdfr_THREECUSTOM9;
                    m_subsystem.FLSetPosition = Constants.kdfl_THREECUSTOM9;
                    m_subsystem.BRSetPosition = Constants.kdbr_THREECUSTOM9;
                    m_subsystem.BLSetPosition = Constants.kdbl_THREECUSTOM9;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }
                case Constants.ks_THREECUSTOM10: {
                    m_subsystem.FRSetPosition = Constants.kdfr_THREECUSTOM10;
                    m_subsystem.FLSetPosition = Constants.kdfl_THREECUSTOM10;
                    m_subsystem.BRSetPosition = Constants.kdbr_THREECUSTOM10;
                    m_subsystem.BLSetPosition = Constants.kdbl_THREECUSTOM10;
                    UseCustom = true;
                        m_subsystem.MovementMethod = Constants.km_CUSTOM;
                    break;
                }


            }

            if (UseCustom)
            {
                if (m_subsystem.FRSetPosition < Constants.k_TRAJECTORYTHRESHOLD) {
                    m_subsystem.FRPositionCoefficient = m_subsystem.FRSetPosition;
                    m_subsystem.FRPositionStateA = m_subsystem.FRSetPosition / 2;
                    m_subsystem.FRPositionStateB = m_subsystem.FRSetPosition / 2;
                    m_subsystem.FRTimeStateA =  m_subsystem.TrajectoryPeriod / 2;
                    m_subsystem.FRTimeStateB =  m_subsystem.TrajectoryPeriod / 2;
                    m_subsystem.FRTimeStateC = m_subsystem.TrajectoryPeriod;
                } else {
                    m_subsystem.FRPositionCoefficient = Constants.k_TRAJECTORYTHRESHOLD;
                    m_subsystem.FRPositionStateA = Constants.k_TRAJECTORYTHRESHOLD;
                    m_subsystem.FRPositionStateB = m_subsystem.FRSetPosition - ( Constants.k_TRAJECTORYTHRESHOLD / 2);
                    m_subsystem.FRTimeStateA =  m_subsystem.TrajectoryPeriod / 2;
                    m_subsystem.FRTimeStateB = ((m_subsystem.FRPositionStateB - m_subsystem.FRPositionStateA) / Constants.k_DIVISOR) + m_subsystem.FLTimeStateA;
                    m_subsystem.FRTimeStateC = m_subsystem.FRTimeStateB +  m_subsystem.TrajectoryPeriod / 2;
                }

                if (m_subsystem.FLSetPosition < Constants.k_TRAJECTORYTHRESHOLD) {
                    m_subsystem.FLPositionCoefficient = m_subsystem.FLSetPosition;
                    m_subsystem.FLPositionStateA = m_subsystem.FLSetPosition / 2;
                    m_subsystem.FLPositionStateB = m_subsystem.FLSetPosition / 2;
                    m_subsystem.FLTimeStateA =  m_subsystem.TrajectoryPeriod / 2;
                    m_subsystem.FLTimeStateB =  m_subsystem.TrajectoryPeriod / 2;
                    m_subsystem.FLTimeStateC = m_subsystem.TrajectoryPeriod;
                } else {
                    m_subsystem.FLPositionCoefficient = Constants.k_TRAJECTORYTHRESHOLD;
                    m_subsystem.FLPositionStateA = Constants.k_TRAJECTORYTHRESHOLD;
                    m_subsystem.FLPositionStateB = m_subsystem.FLSetPosition - ( Constants.k_TRAJECTORYTHRESHOLD / 2);
                    m_subsystem.FLTimeStateA =  m_subsystem.TrajectoryPeriod / 2;
                    m_subsystem.FLTimeStateB = ((m_subsystem.FLPositionStateB - m_subsystem.FLPositionStateA) / Constants.k_DIVISOR) + m_subsystem.FLTimeStateA;
                    m_subsystem.FLTimeStateC = m_subsystem.FLTimeStateB +  m_subsystem.TrajectoryPeriod / 2;
                }

                if (m_subsystem.BRSetPosition < Constants.k_TRAJECTORYTHRESHOLD) {
                    m_subsystem.BRPositionCoefficient = m_subsystem.BRSetPosition;
                    m_subsystem.BRPositionStateA = m_subsystem.BRSetPosition / 2;
                    m_subsystem.BRPositionStateB = m_subsystem.BRSetPosition / 2;
                    m_subsystem.BRTimeStateA =  m_subsystem.TrajectoryPeriod / 2;
                    m_subsystem.BRTimeStateB =  m_subsystem.TrajectoryPeriod / 2;
                    m_subsystem.BRTimeStateC = m_subsystem.TrajectoryPeriod;
                } else {
                    m_subsystem.BRPositionCoefficient = Constants.k_TRAJECTORYTHRESHOLD;
                    m_subsystem.BRPositionStateA = Constants.k_TRAJECTORYTHRESHOLD;
                    m_subsystem.BRPositionStateB = m_subsystem.BRSetPosition - ( Constants.k_TRAJECTORYTHRESHOLD / 2);
                    m_subsystem.BRTimeStateA =  m_subsystem.TrajectoryPeriod / 2;
                    m_subsystem.BRTimeStateB = ((m_subsystem.BRPositionStateB - m_subsystem.BRPositionStateA) / Constants.k_DIVISOR) + m_subsystem.BRTimeStateA;
                    m_subsystem.BRTimeStateC = m_subsystem.BRTimeStateB +  m_subsystem.TrajectoryPeriod / 2;
                }

                if (m_subsystem.BLSetPosition < Constants.k_TRAJECTORYTHRESHOLD) {
                    m_subsystem.BLPositionCoefficient = m_subsystem.BLSetPosition;
                    m_subsystem.BLPositionStateA = m_subsystem.BLSetPosition / 2;
                    m_subsystem.BLPositionStateB = m_subsystem.BLSetPosition / 2;
                    m_subsystem.BLTimeStateA =  m_subsystem.TrajectoryPeriod / 2;
                    m_subsystem.BLTimeStateB =  m_subsystem.TrajectoryPeriod / 2;
                    m_subsystem.BLTimeStateC = m_subsystem.TrajectoryPeriod;
                } else {
                    m_subsystem.BLPositionCoefficient = Constants.k_TRAJECTORYTHRESHOLD;
                    m_subsystem.BLPositionStateA = Constants.k_TRAJECTORYTHRESHOLD;
                    m_subsystem.BLPositionStateB = m_subsystem.BLSetPosition - ( Constants.k_TRAJECTORYTHRESHOLD / 2);
                    m_subsystem.BLTimeStateA =  m_subsystem.TrajectoryPeriod / 2;
                    m_subsystem.BLTimeStateB = ((m_subsystem.BLPositionStateB - m_subsystem.BLPositionStateA) / Constants.k_DIVISOR) + m_subsystem.BLTimeStateA;
                    m_subsystem.BLTimeStateC = m_subsystem.BLTimeStateB +  m_subsystem.TrajectoryPeriod / 2;
                }
            }
            else
            {

                if (m_subsystem.SetPosition < Constants.k_TRAJECTORYTHRESHOLD) {
                    m_subsystem.PositionCoefficient = m_subsystem.SetPosition;
                    m_subsystem.PositionStateA = m_subsystem.SetPosition / 2;
                    m_subsystem.PositionStateB = m_subsystem.SetPosition / 2;
                    m_subsystem.TimeStateA =  m_subsystem.TrajectoryPeriod / 2;
                    m_subsystem.TimeStateB =  m_subsystem.TrajectoryPeriod / 2;
                    m_subsystem.TimeStateC = m_subsystem.TrajectoryPeriod;
                } else {
                    m_subsystem.PositionCoefficient = Constants.k_TRAJECTORYTHRESHOLD;
                    m_subsystem.PositionStateA = Constants.k_TRAJECTORYTHRESHOLD;
                    m_subsystem.PositionStateB = m_subsystem.SetPosition - ( Constants.k_TRAJECTORYTHRESHOLD / 2);
                    m_subsystem.TimeStateA =  m_subsystem.TrajectoryPeriod / 2;
                    m_subsystem.TimeStateB = ((m_subsystem.PositionStateB - m_subsystem.PositionStateA) / Constants.k_DIVISOR) + m_subsystem.TimeStateA;
                    m_subsystem.TimeStateC = m_subsystem.TimeStateB +  m_subsystem.TrajectoryPeriod / 2;
                }


            }


            if (m_subsystem.MovementMethod == Constants.km_STRAFE)
            {
                m_subsystem.StrafeCoefficient = -1;
            }
            else
            {
                m_subsystem.StrafeCoefficient = 1;
            }

            if(UseCustom)
            {
                m_subsystem.FRDestination = m_subsystem.FRSetPosition + FRStartPosition;
                m_subsystem.FLDestination = m_subsystem.FLSetPosition + FLStartPosition;
                m_subsystem.BRDestination = m_subsystem.BRSetPosition + BRStartPosition;
                m_subsystem.BLDestination = m_subsystem.BLSetPosition + BLStartPosition;
            }
            else
            {
                m_subsystem.FRDestination = (m_subsystem.SetPosition * m_subsystem.StrafeCoefficient) + FRStartPosition;
                m_subsystem.FLDestination = (m_subsystem.SetPosition) + FLStartPosition;
                m_subsystem.BRDestination = (m_subsystem.SetPosition) + BRStartPosition;
                m_subsystem.BLDestination = (m_subsystem.SetPosition * m_subsystem.StrafeCoefficient) + BLStartPosition;
            }

            ms_subsystem.FirstScan = false;

        }

        if (ms_subsystem.InAutonomous) {

            if (UseCustom)
            {
                FRtarget = m_subsystem.setFRTrajectoryTarget();
                FLtarget = m_subsystem.setFLTrajectoryTarget();
                BRtarget = m_subsystem.setBRTrajectoryTarget();
                BLtarget = m_subsystem.setBLTrajectoryTarget();
            }
            else
            {
                FRtarget = m_subsystem.setTrajectoryTarget();
                FLtarget = m_subsystem.setTrajectoryTarget();
                BRtarget = m_subsystem.setTrajectoryTarget();
                BLtarget = m_subsystem.setTrajectoryTarget();
            }

            FRspeed = ((FRtarget * m_subsystem.StrafeCoefficient) + FRStartPosition - m_subsystem.getFRPosition()) * Constants.k_DRIVETRAINPROPORTIONALCOEFFICIENT;
            FLspeed = ((FLtarget) + FLStartPosition - m_subsystem.getFLPosition()) * Constants.k_DRIVETRAINPROPORTIONALCOEFFICIENT;
            BRspeed = ((BRtarget) + BRStartPosition - m_subsystem.getBRPosition()) * Constants.k_DRIVETRAINPROPORTIONALCOEFFICIENT;
            BLspeed = ((BLtarget * m_subsystem.StrafeCoefficient) + BLStartPosition - m_subsystem.getBLPosition()) * Constants.k_DRIVETRAINPROPORTIONALCOEFFICIENT;
        }
        else
        {
            LeftX  = m_drivercontroller.getLeftX();
            RightX = m_drivercontroller.getRightX();
            RightY = m_drivercontroller.getRightY();

            FRspeed = (-RightY + LeftX - RightX);
            FLspeed = ( RightY + LeftX - RightX);
            BRspeed = (-RightY + LeftX + RightX);
            BLspeed = ( RightY + LeftX + RightX);
        }

        if(     ((m_subsystem.getFRPosition() > (m_subsystem.FRDestination - ms_subsystem.AcceptanceWindow/2))&&
                 (m_subsystem.getFRPosition() < (m_subsystem.FRDestination + ms_subsystem.AcceptanceWindow/2)))&&
                ((m_subsystem.getFLPosition() > (m_subsystem.FLDestination - ms_subsystem.AcceptanceWindow/2))&&
                 (m_subsystem.getFLPosition() < (m_subsystem.FLDestination + ms_subsystem.AcceptanceWindow/2)))&&
                ((m_subsystem.getBRPosition() > (m_subsystem.BRDestination - ms_subsystem.AcceptanceWindow/2))&&
                 (m_subsystem.getBRPosition() < (m_subsystem.BRDestination + ms_subsystem.AcceptanceWindow/2)))&&
                ((m_subsystem.getBLPosition() > (m_subsystem.BLDestination - ms_subsystem.AcceptanceWindow/2))&&
                 (m_subsystem.getBLPosition() < (m_subsystem.BLDestination + ms_subsystem.AcceptanceWindow/2))))
        {
            ms_subsystem.DrivetrainInPosition = true;
        }
        else
        {
            ms_subsystem.DrivetrainInPosition = false;
        }

        if (FRspeed > 1)
        {
            FRspeed = 1;
        }
        else if (FRspeed < -1)
        {
            FRspeed = -1;
        }

        if (FLspeed > 1)
        {
            FLspeed = 1;
        }
        else if (FLspeed < -1)
        {
            FLspeed = -1;
        }

        if (BRspeed > 1)
        {
            BRspeed = 1;
        }
        else if (BRspeed < -1)
        {
            BRspeed = -1;
        }

        if (BLspeed > 1)
        {
            BLspeed = 1;
        }
        else if (BLspeed < -1)
        {
            BLspeed = -1;
        }



        m_subsystem.setDrivetrainSpeed(FRspeed,FLspeed,BRspeed,BLspeed);

    }

}
