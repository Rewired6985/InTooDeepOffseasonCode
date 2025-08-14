package org.firstinspires.ftc.teamcode.subsystems;

import java.lang.Math.*;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.motors.Motor;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Constants;

public class DrivetrainSubsystem extends SubsystemBase
{

    private final Motor m_FRmotor;
    private final Motor m_FLmotor;
    private final Motor m_BRmotor;
    private final Motor m_BLmotor;

    public DrivetrainSubsystem(Motor FRmotor, Motor FLmotor, Motor BRmotor, Motor BLmotor)
    {
        m_FRmotor = FRmotor;
        m_FLmotor = FLmotor;
        m_BRmotor = BRmotor;
        m_BLmotor = BLmotor;
    }

    public ElapsedTime Timer = new ElapsedTime();

    public double StateTimer;
    public double TrajectoryPeriod = 1000;

    public double SetPosition = 0;
    public double FRSetPosition = 0;
    public double FLSetPosition = 0;
    public double BRSetPosition = 0;
    public double BLSetPosition = 0;
    public double PositionCoefficient = 0;
    public double FRPositionCoefficient = 0;
    public double FLPositionCoefficient = 0;
    public double BRPositionCoefficient = 0;
    public double BLPositionCoefficient = 0;
    public double TrajectoryTarget = 0;
    public double FRTrajectoryTarget = 0;
    public double FLTrajectoryTarget = 0;
    public double BRTrajectoryTarget = 0;
    public double BLTrajectoryTarget = 0;
    public double PositionStateA = 0;
    public double FRPositionStateA = 0;
    public double FLPositionStateA = 0;
    public double BRPositionStateA = 0;
    public double BLPositionStateA = 0;
    public double PositionStateB = 0;
    public double FRPositionStateB = 0;
    public double FLPositionStateB = 0;
    public double BRPositionStateB = 0;
    public double BLPositionStateB = 0;
    public double TimeStateA = 0;
    public double FRTimeStateA = 0;
    public double FLTimeStateA = 0;
    public double BRTimeStateA = 0;
    public double BLTimeStateA = 0;
    public double TimeStateB = 0;
    public double FRTimeStateB = 0;
    public double FLTimeStateB = 0;
    public double BRTimeStateB = 0;
    public double BLTimeStateB = 0;
    public double TimeStateC = 0;
    public double FRTimeStateC = 0;
    public double FLTimeStateC = 0;
    public double BRTimeStateC = 0;
    public double BLTimeStateC = 0;
    public int MovementMethod = 0;
    public double FRDestination = 0;
    public double FLDestination = 0;
    public double BRDestination = 0;
    public double BLDestination = 0;
    public double StrafeCoefficient = 1;


    
    public int getFRPosition()
    {
        return m_FRmotor.getCurrentPosition();
    }

    public int getFLPosition()
    {
        return m_FLmotor.getCurrentPosition();
    }

    public int getBRPosition()
    {
        return m_BRmotor.getCurrentPosition();
    }

    public int getBLPosition()
    {
        return m_BLmotor.getCurrentPosition();
    }

    public double setTrajectoryTarget()
    {
        StateTimer = Timer.milliseconds();

        if (StateTimer < TimeStateA)
        {
            TrajectoryTarget = PositionCoefficient * ((1 - Math.cos(Math.PI * (StateTimer/TrajectoryPeriod)))/2);
        }
        else if (StateTimer < TimeStateB)
        {
            TrajectoryTarget = PositionStateA + (Constants.k_RANDOMCOEFFICIENT * (StateTimer - TimeStateA));
        }
        else if (StateTimer < TimeStateC)
        {
            TrajectoryTarget = (PositionStateB - PositionStateA) + PositionCoefficient * ((1 - Math.cos(Math.PI * ((StateTimer - (TimeStateB - TimeStateA))/TrajectoryPeriod)))/2);
        }
        else
        {
            TrajectoryTarget = SetPosition;
        }
        return TrajectoryTarget;
    }

    public double setFRTrajectoryTarget()
    {
        if (StateTimer < FRTimeStateA)
        {
            FRTrajectoryTarget = FRPositionCoefficient * ((1 - Math.cos(Math.PI * (StateTimer/TrajectoryPeriod)))/2);
        }
        else if (StateTimer < FRTimeStateB)
        {
            FRTrajectoryTarget = FRPositionStateA + (Constants.k_RANDOMCOEFFICIENT * (StateTimer - FRTimeStateA));
        }
        else if (StateTimer < FRTimeStateC)
        {
            FRTrajectoryTarget = (FRPositionStateB - FRPositionStateA) + (FRPositionCoefficient * ((1 - Math.cos(Math.PI * ((StateTimer - (FRTimeStateB - FRTimeStateA))/TrajectoryPeriod)/2))));
        }
        else
        {
            FRTrajectoryTarget = FRSetPosition;
        }
        return FRTrajectoryTarget;
    }

    public double setFLTrajectoryTarget()
    {
        if (StateTimer < FLTimeStateA)
        {
            FLTrajectoryTarget = FLPositionCoefficient * ((1 - Math.cos(Math.PI * (StateTimer/TrajectoryPeriod)))/2);
        }
        else if (StateTimer < FLTimeStateB)
        {
            FLTrajectoryTarget = FLPositionStateA + (Constants.k_RANDOMCOEFFICIENT * (StateTimer - FLTimeStateA));
        }
        else if (StateTimer < FLTimeStateC)
        {
            FLTrajectoryTarget = (FLPositionStateB - FLPositionStateA) + (FLPositionCoefficient * ((1 - Math.cos(Math.PI * ((StateTimer - (FLTimeStateB - FLTimeStateA))/TrajectoryPeriod)/2))));
        }
        else
        {
            FLTrajectoryTarget = FLSetPosition;
        }
        return FLTrajectoryTarget;
    }

    public double setBRTrajectoryTarget()
    {
        if (StateTimer < BRTimeStateA)
        {
            BRTrajectoryTarget = BRPositionCoefficient * ((1 - Math.cos(Math.PI * (StateTimer/TrajectoryPeriod)))/2);
        }
        else if (StateTimer < BRTimeStateB)
        {
            BRTrajectoryTarget = BRPositionStateA + (Constants.k_RANDOMCOEFFICIENT * (StateTimer - BRTimeStateA));
        }
        else if (StateTimer < BRTimeStateC)
        {
            BRTrajectoryTarget = (BRPositionStateB - BRPositionStateA) + (BRPositionCoefficient * ((1 - Math.cos(Math.PI * ((StateTimer - (BRTimeStateB - BRTimeStateA))/TrajectoryPeriod)/2))));
        }
        else
        {
            BRTrajectoryTarget = BRSetPosition;
        }
        return BRTrajectoryTarget;
    }

    public double setBLTrajectoryTarget()
    {
        if (StateTimer < BLTimeStateA)
        {
            BLTrajectoryTarget = BLPositionCoefficient * ((1 - Math.cos(Math.PI * (StateTimer/TrajectoryPeriod)))/2);
        }
        else if (StateTimer < BLTimeStateB)
        {
            BLTrajectoryTarget = BLPositionStateA + (Constants.k_RANDOMCOEFFICIENT * (StateTimer - BLTimeStateA));
        }
        else if (StateTimer < BLTimeStateC)
        {
            BLTrajectoryTarget = (BLPositionStateB - BLPositionStateA) + (BLPositionCoefficient * ((1 - Math.cos(Math.PI * ((StateTimer - (BLTimeStateB - BLTimeStateA))/TrajectoryPeriod)/2))));
        }
        else
        {
            BLTrajectoryTarget = BLSetPosition;
        }
        return BLTrajectoryTarget;
    }

    public void setDrivetrainSpeed(double fr_speed, double fl_speed, double br_speed, double bl_speed)
    {
        m_FRmotor.set(fr_speed);
        m_FLmotor.set(fl_speed);
        m_BRmotor.set(br_speed);
        m_BLmotor.set(bl_speed);

//        m_FRmotor.set(0);
//        m_FLmotor.set(0);
//        m_BRmotor.set(0);
//        m_BLmotor.set(0);
    }

}
