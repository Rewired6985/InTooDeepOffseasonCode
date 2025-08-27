package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;

import org.firstinspires.ftc.teamcode.Constants;
public class StateMachineSubsystem extends SubsystemBase
{

    public int StateID = 0;
    public double AcceptanceWindow = 100;
    public boolean FirstScan = true;
    public boolean DrivetrainInPosition = false;
    public boolean InAutonomous;


    public double arm_target;
    public double worm_target;
    public int wrist_target;
    public int twister_target;
    public int claw_target;

    public void StateHandler()
    {
        switch (StateID)
        {
            case Constants.ks_ALL0:
            {
                FirstScan = false;
                break;
            }
            case Constants.ks_ONE1:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE1;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE2:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE2;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE3:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE3;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE4:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE4;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE5:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE5;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE6:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE6;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE7:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE7;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE8:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE8;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE9:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE9;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE10:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE10;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE11:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE11;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE12:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE12;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE13:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE13;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE14:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE14;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE15:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE15;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE16:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE16;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE17:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE17;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE18:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE18;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE19:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE19;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE20:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE20;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE21:
            {
            if (DrivetrainInPosition)
            {
                StateID = Constants.kn_ONE21;
                FirstScan = true;
            }
            break;
            }
            case Constants.ks_ONE22:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE22;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE23:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE23;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE24:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE24;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE25:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE25;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE26:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE26;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE27:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE27;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE28:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE28;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE29:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE29;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONE30:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONE30;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONECUSTOM1:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONECUSTOM1;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONECUSTOM2:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONECUSTOM2;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONECUSTOM3:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONECUSTOM3;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONECUSTOM4:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONECUSTOM4;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONECUSTOM5:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONECUSTOM5;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONECUSTOM6:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONECUSTOM6;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONECUSTOM7:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONECUSTOM7;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONECUSTOM8:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONECUSTOM8;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONECUSTOM9:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONECUSTOM9;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_ONECUSTOM10:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_ONECUSTOM10;
                    FirstScan = true;
                }
                break;
            }

            //end of auto one

            case Constants.ks_TWO1:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO1;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO2:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO2;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO3:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO3;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO4:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO4;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO5:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO5;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO6:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO6;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO7:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO7;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO8:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO8;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO9:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO9;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO10:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO10;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO11:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO11;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO12:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO12;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO13:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO13;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO14:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO14;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO15:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO15;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO16:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO16;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO17:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO17;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO18:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO18;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO19:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO19;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO20:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO20;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO21:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO21;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO22:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO22;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO23:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO23;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO24:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO24;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO25:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO25;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO26:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO26;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO27:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO27;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO28:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO28;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO29:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO29;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWO30:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWO30;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWOCUSTOM1:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWOCUSTOM1;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWOCUSTOM2:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWOCUSTOM2;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWOCUSTOM3:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWOCUSTOM3;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWOCUSTOM4:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWOCUSTOM4;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWOCUSTOM5:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWOCUSTOM5;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWOCUSTOM6:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWOCUSTOM6;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWOCUSTOM7:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWOCUSTOM7;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWOCUSTOM8:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWOCUSTOM8;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWOCUSTOM9:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWOCUSTOM9;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_TWOCUSTOM10:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_TWOCUSTOM10;
                    FirstScan = true;
                }
                break;
            }

            //end of auto two

            case Constants.ks_THREE1:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE1;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE2:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE2;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE3:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE3;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE4:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE4;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE5:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE5;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE6:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE6;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE7:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE7;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE8:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE8;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE9:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE9;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE10:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE10;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE11:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE11;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE12:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE12;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE13:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE13;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE14:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE14;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE15:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE15;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE16:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE16;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE17:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE17;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE18:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE18;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE19:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE19;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE20:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE20;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE21:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE21;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE22:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE22;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE23:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE23;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE24:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE24;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE25:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE25;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE26:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE26;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE27:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE27;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE28:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE28;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE29:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE29;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREE30:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREE30;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREECUSTOM1:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREECUSTOM1;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREECUSTOM2:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREECUSTOM2;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREECUSTOM3:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREECUSTOM3;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREECUSTOM4:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREECUSTOM4;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREECUSTOM5:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREECUSTOM5;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREECUSTOM6:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREECUSTOM6;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREECUSTOM7:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREECUSTOM7;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREECUSTOM8:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREECUSTOM8;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREECUSTOM9:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREECUSTOM9;
                    FirstScan = true;
                }
                break;
            }
            case Constants.ks_THREECUSTOM10:
            {
                if (DrivetrainInPosition)
                {
                    StateID = Constants.kn_THREECUSTOM10;
                    FirstScan = true;
                }
                break;
            }

            //end of auto three

        }

    }

}
