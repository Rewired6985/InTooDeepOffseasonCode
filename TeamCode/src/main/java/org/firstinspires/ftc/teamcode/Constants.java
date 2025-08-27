package org.firstinspires.ftc.teamcode;

public final class Constants
{

    //all constants are stored in this class
    //this class is what is modified to change most numeric values involved in the robot's processes

    //the following section are values used by the code in auto building process

    public static final double k_TRAJECTORYCOEFFICIENT = 1;
    public static final double k_TRAJECTORYTHRESHOLD = 600;
    public static final double k_STRAFECONVERSION = 41.19;
    public static final double k_DRIVECONVERSION = 32.84;
    public static final int km_STRAFE = 1;
    public static final int km_DRIVE = 2;
    public static final int km_CUSTOM = 3; //WARNING: NOT FOR USE AS A CONSTANT IN THIS FILE!

    //the following section of constants are auto building constants
    //ks constants refer to the state in question
    //km refers to the movement method in the state in question (absent from custom states)
    //all km constants should be set to either km_STRAFE or km_DRIVE
    //kd refers to the movement distance in the state in question (unit: inches)
    //kdfr, kdfl, kdbr, and kdbl refer to the movement distance for a given wheel in a custom state (unit: unnamed encoder units)
    //kn refers to which state the user would like to follow the state in question

    //the format for a given state is the english name for the number (signifying the auto number) followed by the state number (in arabic numerals)
    //the format for a custom state is the word "CUSTOM" in between the auto number and the state number

    public static final int ks_ALL0 = 0;

    public static final int ks_ONE1 = 1;
    public static final int km_ONE1 = km_STRAFE;
    public static final double kd_ONE1 = 24;
    public static final int kn_ONE1 = 2;

    public static final int ks_ONE2 = 2;
    public static final int km_ONE2 = km_DRIVE;
    public static final double kd_ONE2 = 49;
    public static final int kn_ONE2 = 3;

    public static final int ks_ONE3 = 3;
    public static final int km_ONE3 = km_STRAFE;
    public static final double kd_ONE3 = 7;
    public static final int kn_ONE3 = 4;

    public static final int ks_ONE4 = 4;
    public static final int km_ONE4 = km_DRIVE;
    public static final double kd_ONE4 = -45;
    public static final int kn_ONE4 = 5;

    public static final int ks_ONE5 = 5;
    public static final int km_ONE5 = km_DRIVE;
    public static final double kd_ONE5 = 45;
    public static final int kn_ONE5 = 6;

    public static final int ks_ONE6 = 6;
    public static final int km_ONE6 = km_STRAFE;
    public static final double kd_ONE6 = 7;
    public static final int kn_ONE6 = 7;

    public static final int ks_ONE7 = 7;
    public static final int km_ONE7 = km_DRIVE;
    public static final double kd_ONE7 = -45;
    public static final int kn_ONE7 = 0;

    public static final int ks_ONE8 = 8;
    public static final int km_ONE8 = 0;
    public static final double kd_ONE8 = 0;
    public static final int kn_ONE8 = 0;


    public static final int ks_ONE9 = 9;
    public static final int km_ONE9 = 0;
    public static final double kd_ONE9 = 0;
    public static final int kn_ONE9 = 0;

    public static final int ks_ONE10 = 10;
    public static final int km_ONE10 = 0;
    public static final double kd_ONE10 = 0;
    public static final int kn_ONE10 = 0;

    public static final int ks_ONE11 = 11;
    public static final int km_ONE11 = 0;
    public static final double kd_ONE11 = 0;
    public static final int kn_ONE11 = 0;

    public static final int ks_ONE12 = 12;
    public static final int km_ONE12 = 0;
    public static final double kd_ONE12 = 0;
    public static final int kn_ONE12 = 0;

    public static final int ks_ONE13 = 13;
    public static final int km_ONE13 = 0;
    public static final double kd_ONE13 = 0;
    public static final int kn_ONE13 = 0;

    public static final int ks_ONE14 = 14;
    public static final int km_ONE14 = 0;
    public static final double kd_ONE14 = 0;
    public static final int kn_ONE14 = 0;

    public static final int ks_ONE15 = 15;
    public static final int km_ONE15 = 0;
    public static final double kd_ONE15 = 0;
    public static final int kn_ONE15 = 0;

    public static final int ks_ONE16 = 16;
    public static final int km_ONE16 = 0;
    public static final double kd_ONE16 = 0;
    public static final int kn_ONE16 = 0;

    public static final int ks_ONE17 = 17;
    public static final int km_ONE17 = 0;
    public static final double kd_ONE17 = 0;
    public static final int kn_ONE17 = 0;

    public static final int ks_ONE18 = 18;
    public static final int km_ONE18 = 0;
    public static final double kd_ONE18 = 0;
    public static final int kn_ONE18 = 0;

    public static final int ks_ONE19 = 19;
    public static final int km_ONE19 = 0;
    public static final double kd_ONE19 = 0;
    public static final int kn_ONE19 = 0;

    public static final int ks_ONE20 = 20;
    public static final int km_ONE20 = 0;
    public static final double kd_ONE20 = 0;
    public static final int kn_ONE20 = 0;

    public static final int ks_ONE21 = 21;
    public static final int km_ONE21 = 0;
    public static final double kd_ONE21 = 0;
    public static final int kn_ONE21 = 0;

    public static final int ks_ONE22 = 22;
    public static final int km_ONE22 = 0;
    public static final double kd_ONE22 = 0;
    public static final int kn_ONE22 = 0;

    public static final int ks_ONE23 = 23;
    public static final int km_ONE23 = 0;
    public static final double kd_ONE23 = 0;
    public static final int kn_ONE23 = 0;

    public static final int ks_ONE24 = 24;
    public static final int km_ONE24 = 0;
    public static final double kd_ONE24 = 0;
    public static final int kn_ONE24 = 0;

    public static final int ks_ONE25 = 25;
    public static final int km_ONE25 = 0;
    public static final double kd_ONE25 = 0;
    public static final int kn_ONE25 = 0;

    public static final int ks_ONE26 = 26;
    public static final int km_ONE26 = 0;
    public static final double kd_ONE26 = 0;
    public static final int kn_ONE26 = 0;

    public static final int ks_ONE27 = 27;
    public static final int km_ONE27 = 0;
    public static final double kd_ONE27 = 0;
    public static final int kn_ONE27 = 0;

    public static final int ks_ONE28 = 28;
    public static final int km_ONE28 = 0;
    public static final double kd_ONE28 = 0;
    public static final int kn_ONE28 = 0;

    public static final int ks_ONE29 = 29;
    public static final int km_ONE29 = 0;
    public static final double kd_ONE29 = 0;
    public static final int kn_ONE29 = 0;

    public static final int ks_ONE30 = 30;
    public static final int km_ONE30 = 0;
    public static final double kd_ONE30 = 0;
    public static final int kn_ONE30 = 0;

    public static final int ks_ONECUSTOM1 = 31;
    public static final double kdfr_ONECUSTOM1 = 0;
    public static final double kdfl_ONECUSTOM1 = 0;
    public static final double kdbr_ONECUSTOM1 = 0;
    public static final double kdbl_ONECUSTOM1 = 0;
    public static final int kn_ONECUSTOM1 = 0;

    public static final int ks_ONECUSTOM2 = 32;
    public static final double kdfr_ONECUSTOM2 = 0;
    public static final double kdfl_ONECUSTOM2 = 0;
    public static final double kdbr_ONECUSTOM2 = 0;
    public static final double kdbl_ONECUSTOM2 = 0;
    public static final int kn_ONECUSTOM2 = 0;

    public static final int ks_ONECUSTOM3 = 33;
    public static final double kdfr_ONECUSTOM3 = 0;
    public static final double kdfl_ONECUSTOM3 = 0;
    public static final double kdbr_ONECUSTOM3 = 0;
    public static final double kdbl_ONECUSTOM3 = 0;
    public static final int kn_ONECUSTOM3 = 0;

    public static final int ks_ONECUSTOM4 = 34;
    public static final double kdfr_ONECUSTOM4 = 0;
    public static final double kdfl_ONECUSTOM4 = 0;
    public static final double kdbr_ONECUSTOM4 = 0;
    public static final double kdbl_ONECUSTOM4 = 0;
    public static final int kn_ONECUSTOM4 = 0;

    public static final int ks_ONECUSTOM5 = 35;
    public static final double kdfr_ONECUSTOM5 = 0;
    public static final double kdfl_ONECUSTOM5 = 0;
    public static final double kdbr_ONECUSTOM5 = 0;
    public static final double kdbl_ONECUSTOM5 = 0;
    public static final int kn_ONECUSTOM5 = 0;

    public static final int ks_ONECUSTOM6 = 36;
    public static final double kdfr_ONECUSTOM6 = 0;
    public static final double kdfl_ONECUSTOM6 = 0;
    public static final double kdbr_ONECUSTOM6 = 0;
    public static final double kdbl_ONECUSTOM6 = 0;
    public static final int kn_ONECUSTOM6 = 0;

    public static final int ks_ONECUSTOM7 = 37;
    public static final double kdfr_ONECUSTOM7 = 0;
    public static final double kdfl_ONECUSTOM7 = 0;
    public static final double kdbr_ONECUSTOM7 = 0;
    public static final double kdbl_ONECUSTOM7 = 0;
    public static final int kn_ONECUSTOM7 = 0;

    public static final int ks_ONECUSTOM8 = 38;
    public static final double kdfr_ONECUSTOM8 = 0;
    public static final double kdfl_ONECUSTOM8 = 0;
    public static final double kdbr_ONECUSTOM8 = 0;
    public static final double kdbl_ONECUSTOM8 = 0;
    public static final int kn_ONECUSTOM8 = 0;

    public static final int ks_ONECUSTOM9 = 39;
    public static final double kdfr_ONECUSTOM9 = 0;
    public static final double kdfl_ONECUSTOM9 = 0;
    public static final double kdbr_ONECUSTOM9 = 0;
    public static final double kdbl_ONECUSTOM9 = 0;
    public static final int kn_ONECUSTOM9 = 0;


    public static final int ks_ONECUSTOM10 = 40;
    public static final double kdfr_ONECUSTOM10 = 0;
    public static final double kdfl_ONECUSTOM10 = 0;
    public static final double kdbr_ONECUSTOM10 = 0;
    public static final double kdbl_ONECUSTOM10 = 0;
    public static final int kn_ONECUSTOM10 = 0;

    //end of auto one

    public static final int ks_TWO1 = 101;
    public static final int km_TWO1 = 0;
    public static final double kd_TWO1 = 0;
    public static final int kn_TWO1 = 0;

    public static final int ks_TWO2 = 102;
    public static final int km_TWO2 = 0;
    public static final double kd_TWO2 = 0;
    public static final int kn_TWO2 = 0;

    public static final int ks_TWO3 = 103;
    public static final int km_TWO3 = 0;
    public static final double kd_TWO3 = 0;
    public static final int kn_TWO3 = 0;

    public static final int ks_TWO4 = 104;
    public static final int km_TWO4 = 0;
    public static final double kd_TWO4 = 0;
    public static final int kn_TWO4 = 0;

    public static final int ks_TWO5 = 105;
    public static final int km_TWO5 = 0;
    public static final double kd_TWO5 = 0;
    public static final int kn_TWO5 = 0;

    public static final int ks_TWO6 = 106;
    public static final int km_TWO6 = 0;
    public static final double kd_TWO6 = 0;
    public static final int kn_TWO6 = 0;

    public static final int ks_TWO7 = 107;
    public static final int km_TWO7 = 0;
    public static final double kd_TWO7 = 0;
    public static final int kn_TWO7 = 0;

    public static final int ks_TWO8 = 108;
    public static final int km_TWO8 = 0;
    public static final double kd_TWO8 = 0;
    public static final int kn_TWO8 = 0;

    public static final int ks_TWO9 = 109;
    public static final int km_TWO9 = 0;
    public static final double kd_TWO9 = 0;
    public static final int kn_TWO9 = 0;

    public static final int ks_TWO10 = 110;
    public static final int km_TWO10 = 0;
    public static final double kd_TWO10 = 0;
    public static final int kn_TWO10 = 0;

    public static final int ks_TWO11 = 111;
    public static final int km_TWO11 = 0;
    public static final double kd_TWO11 = 0;
    public static final int kn_TWO11 = 0;

    public static final int ks_TWO12 = 112;
    public static final int km_TWO12 = 0;
    public static final double kd_TWO12 = 0;
    public static final int kn_TWO12 = 0;

    public static final int ks_TWO13 = 113;
    public static final int km_TWO13 = 0;
    public static final double kd_TWO13 = 0;
    public static final int kn_TWO13 = 0;

    public static final int ks_TWO14 = 114;
    public static final int km_TWO14 = 0;
    public static final double kd_TWO14 = 0;
    public static final int kn_TWO14 = 0;

    public static final int ks_TWO15 = 115;
    public static final int km_TWO15 = 0;
    public static final double kd_TWO15 = 0;
    public static final int kn_TWO15 = 0;

    public static final int ks_TWO16 = 116;
    public static final int km_TWO16 = 0;
    public static final double kd_TWO16 = 0;
    public static final int kn_TWO16 = 0;

    public static final int ks_TWO17 = 117;
    public static final int km_TWO17 = 0;
    public static final double kd_TWO17 = 0;
    public static final int kn_TWO17 = 0;

    public static final int ks_TWO18 = 118;
    public static final int km_TWO18 = 0;
    public static final double kd_TWO18 = 0;
    public static final int kn_TWO18 = 0;

    public static final int ks_TWO19 = 119;
    public static final int km_TWO19 = 0;
    public static final double kd_TWO19 = 0;
    public static final int kn_TWO19 = 0;

    public static final int ks_TWO20 = 120;
    public static final int km_TWO20 = 0;
    public static final double kd_TWO20 = 0;
    public static final int kn_TWO20 = 0;

    public static final int ks_TWO21 = 121;
    public static final int km_TWO21 = 0;
    public static final double kd_TWO21 = 0;
    public static final int kn_TWO21 = 0;

    public static final int ks_TWO22 = 122;
    public static final int km_TWO22 = 0;
    public static final double kd_TWO22 = 0;
    public static final int kn_TWO22 = 0;

    public static final int ks_TWO23 = 123;
    public static final int km_TWO23 = 0;
    public static final double kd_TWO23 = 0;
    public static final int kn_TWO23 = 0;

    public static final int ks_TWO24 = 124;
    public static final int km_TWO24 = 0;
    public static final double kd_TWO24 = 0;
    public static final int kn_TWO24 = 0;

    public static final int ks_TWO25 = 125;
    public static final int km_TWO25 = 0;
    public static final double kd_TWO25 = 0;
    public static final int kn_TWO25 = 0;

    public static final int ks_TWO26 = 126;
    public static final int km_TWO26 = 0;
    public static final double kd_TWO26 = 0;
    public static final int kn_TWO26 = 0;

    public static final int ks_TWO27 = 127;
    public static final int km_TWO27 = 0;
    public static final double kd_TWO27 = 0;
    public static final int kn_TWO27 = 0;

    public static final int ks_TWO28 = 128;
    public static final int km_TWO28 = 0;
    public static final double kd_TWO28 = 0;
    public static final int kn_TWO28 = 0;

    public static final int ks_TWO29 = 129;
    public static final int km_TWO29 = 0;
    public static final double kd_TWO29 = 0;
    public static final int kn_TWO29 = 0;

    public static final int ks_TWO30 = 130;
    public static final int km_TWO30 = 0;
    public static final double kd_TWO30 = 0;
    public static final int kn_TWO30 = 0;

    public static final int ks_TWOCUSTOM1 = 131;
    public static final double kdfr_TWOCUSTOM1 = 0;
    public static final double kdfl_TWOCUSTOM1 = 0;
    public static final double kdbr_TWOCUSTOM1 = 0;
    public static final double kdbl_TWOCUSTOM1 = 0;
    public static final int kn_TWOCUSTOM1 = 0;

    public static final int ks_TWOCUSTOM2 = 132;
    public static final double kdfr_TWOCUSTOM2 = 0;
    public static final double kdfl_TWOCUSTOM2 = 0;
    public static final double kdbr_TWOCUSTOM2 = 0;
    public static final double kdbl_TWOCUSTOM2 = 0;
    public static final int kn_TWOCUSTOM2 = 0;

    public static final int ks_TWOCUSTOM3 = 133;
    public static final double kdfr_TWOCUSTOM3 = 0;
    public static final double kdfl_TWOCUSTOM3 = 0;
    public static final double kdbr_TWOCUSTOM3 = 0;
    public static final double kdbl_TWOCUSTOM3 = 0;
    public static final int kn_TWOCUSTOM3 = 0;

    public static final int ks_TWOCUSTOM4 = 134;
    public static final double kdfr_TWOCUSTOM4 = 0;
    public static final double kdfl_TWOCUSTOM4 = 0;
    public static final double kdbr_TWOCUSTOM4 = 0;
    public static final double kdbl_TWOCUSTOM4 = 0;
    public static final int kn_TWOCUSTOM4 = 0;

    public static final int ks_TWOCUSTOM5 = 135;
    public static final double kdfr_TWOCUSTOM5 = 0;
    public static final double kdfl_TWOCUSTOM5 = 0;
    public static final double kdbr_TWOCUSTOM5 = 0;
    public static final double kdbl_TWOCUSTOM5 = 0;
    public static final int kn_TWOCUSTOM5 = 0;

    public static final int ks_TWOCUSTOM6 = 136;
    public static final double kdfr_TWOCUSTOM6 = 0;
    public static final double kdfl_TWOCUSTOM6 = 0;
    public static final double kdbr_TWOCUSTOM6 = 0;
    public static final double kdbl_TWOCUSTOM6 = 0;
    public static final int kn_TWOCUSTOM6 = 0;

    public static final int ks_TWOCUSTOM7 = 137;
    public static final double kdfr_TWOCUSTOM7 = 0;
    public static final double kdfl_TWOCUSTOM7 = 0;
    public static final double kdbr_TWOCUSTOM7 = 0;
    public static final double kdbl_TWOCUSTOM7 = 0;
    public static final int kn_TWOCUSTOM7 = 0;

    public static final int ks_TWOCUSTOM8 = 138;
    public static final double kdfr_TWOCUSTOM8 = 0;
    public static final double kdfl_TWOCUSTOM8 = 0;
    public static final double kdbr_TWOCUSTOM8 = 0;
    public static final double kdbl_TWOCUSTOM8 = 0;
    public static final int kn_TWOCUSTOM8 = 0;

    public static final int ks_TWOCUSTOM9 = 139;
    public static final double kdfr_TWOCUSTOM9 = 0;
    public static final double kdfl_TWOCUSTOM9 = 0;
    public static final double kdbr_TWOCUSTOM9 = 0;
    public static final double kdbl_TWOCUSTOM9 = 0;
    public static final int kn_TWOCUSTOM9 = 0;

    public static final int ks_TWOCUSTOM10 = 140;
    public static final double kdfr_TWOCUSTOM10 = 0;
    public static final double kdfl_TWOCUSTOM10 = 0;
    public static final double kdbr_TWOCUSTOM10 = 0;
    public static final double kdbl_TWOCUSTOM10 = 0;
    public static final int kn_TWOCUSTOM10 = 0;

    //end of auto 2

    public static final int ks_THREE1 = 201;
    public static final int km_THREE1 = 0;
    public static final double kd_THREE1 = 0;
    public static final int kn_THREE1 = 0;

    public static final int ks_THREE2 = 202;
    public static final int km_THREE2 = 0;
    public static final double kd_THREE2 = 0;
    public static final int kn_THREE2 = 0;

    public static final int ks_THREE3 = 203;
    public static final int km_THREE3 = 0;
    public static final double kd_THREE3 = 0;
    public static final int kn_THREE3 = 0;

    public static final int ks_THREE4 = 204;
    public static final int km_THREE4 = 0;
    public static final double kd_THREE4 = 0;
    public static final int kn_THREE4 = 0;

    public static final int ks_THREE5 = 205;
    public static final int km_THREE5 = 0;
    public static final double kd_THREE5 = 0;
    public static final int kn_THREE5 = 0;

    public static final int ks_THREE6 = 206;
    public static final int km_THREE6 = 0;
    public static final double kd_THREE6 = 0;
    public static final int kn_THREE6 = 0;

    public static final int ks_THREE7 = 207;
    public static final int km_THREE7 = 0;
    public static final double kd_THREE7 = 0;
    public static final int kn_THREE7 = 0;

    public static final int ks_THREE8 = 208;
    public static final int km_THREE8 = 0;
    public static final double kd_THREE8 = 0;
    public static final int kn_THREE8 = 0;

    public static final int ks_THREE9 = 209;
    public static final int km_THREE9 = 0;
    public static final double kd_THREE9 = 0;
    public static final int kn_THREE9 = 0;

    public static final int ks_THREE10 = 210;
    public static final int km_THREE10 = 0;
    public static final double kd_THREE10 = 0;
    public static final int kn_THREE10 = 0;

    public static final int ks_THREE11 = 211;
    public static final int km_THREE11 = 0;
    public static final double kd_THREE11 = 0;
    public static final int kn_THREE11 = 0;

    public static final int ks_THREE12 = 212;
    public static final int km_THREE12 = 0;
    public static final double kd_THREE12 = 0;
    public static final int kn_THREE12 = 0;

    public static final int ks_THREE13 = 213;
    public static final int km_THREE13 = 0;
    public static final double kd_THREE13 = 0;
    public static final int kn_THREE13 = 0;

    public static final int ks_THREE14 = 214;
    public static final int km_THREE14 = 0;
    public static final double kd_THREE14 = 0;
    public static final int kn_THREE14 = 0;

    public static final int ks_THREE15 = 215;
    public static final int km_THREE15 = 0;
    public static final double kd_THREE15 = 0;
    public static final int kn_THREE15 = 0;

    public static final int ks_THREE16 = 216;
    public static final int km_THREE16 = 0;
    public static final double kd_THREE16 = 0;
    public static final int kn_THREE16 = 0;

    public static final int ks_THREE17 = 217;
    public static final int km_THREE17 = 0;
    public static final double kd_THREE17 = 0;
    public static final int kn_THREE17 = 0;

    public static final int ks_THREE18 = 218;
    public static final int km_THREE18 = 0;
    public static final double kd_THREE18 = 0;
    public static final int kn_THREE18 = 0;

    public static final int ks_THREE19 = 219;
    public static final int km_THREE19 = 0;
    public static final double kd_THREE19 = 0;
    public static final int kn_THREE19 = 0;

    public static final int ks_THREE20 = 220;
    public static final int km_THREE20 = 0;
    public static final double kd_THREE20 = 0;
    public static final int kn_THREE20 = 0;

    public static final int ks_THREE21 = 221;
    public static final int km_THREE21 = 0;
    public static final double kd_THREE21 = 0;
    public static final int kn_THREE21 = 0;

    public static final int ks_THREE22 = 222;
    public static final int km_THREE22 = 0;
    public static final double kd_THREE22 = 0;
    public static final int kn_THREE22 = 0;

    public static final int ks_THREE23 = 223;
    public static final int km_THREE23 = 0;
    public static final double kd_THREE23 = 0;
    public static final int kn_THREE23 = 0;

    public static final int ks_THREE24 = 224;
    public static final int km_THREE24 = 0;
    public static final double kd_THREE24 = 0;
    public static final int kn_THREE24 = 0;

    public static final int ks_THREE25 = 225;
    public static final int km_THREE25 = 0;
    public static final double kd_THREE25 = 0;
    public static final int kn_THREE25 = 0;

    public static final int ks_THREE26 = 226;
    public static final int km_THREE26 = 0;
    public static final double kd_THREE26 = 0;
    public static final int kn_THREE26 = 0;

    public static final int ks_THREE27 = 227;
    public static final int km_THREE27 = 0;
    public static final double kd_THREE27 = 0;
    public static final int kn_THREE27 = 0;

    public static final int ks_THREE28 = 228;
    public static final int km_THREE28 = 0;
    public static final double kd_THREE28 = 0;
    public static final int kn_THREE28 = 0;

    public static final int ks_THREE29 = 229;
    public static final int km_THREE29 = 0;
    public static final double kd_THREE29 = 0;
    public static final int kn_THREE29 = 0;

    public static final int ks_THREE30 = 230;
    public static final int km_THREE30 = 0;
    public static final double kd_THREE30 = 0;
    public static final int kn_THREE30 = 0;

    public static final int ks_THREECUSTOM1 = 231;
    public static final double kdfr_THREECUSTOM1 = 0;
    public static final double kdfl_THREECUSTOM1 = 0;
    public static final double kdbr_THREECUSTOM1 = 0;
    public static final double kdbl_THREECUSTOM1 = 0;
    public static final int kn_THREECUSTOM1 = 0;

    public static final int ks_THREECUSTOM2 = 232;
    public static final double kdfr_THREECUSTOM2 = 0;
    public static final double kdfl_THREECUSTOM2 = 0;
    public static final double kdbr_THREECUSTOM2 = 0;
    public static final double kdbl_THREECUSTOM2 = 0;
    public static final int kn_THREECUSTOM2 = 0;

    public static final int ks_THREECUSTOM3 = 233;
    public static final double kdfr_THREECUSTOM3 = 0;
    public static final double kdfl_THREECUSTOM3 = 0;
    public static final double kdbr_THREECUSTOM3 = 0;
    public static final double kdbl_THREECUSTOM3 = 0;
    public static final int kn_THREECUSTOM3 = 0;

    public static final int ks_THREECUSTOM4 = 234;
    public static final double kdfr_THREECUSTOM4 = 0;
    public static final double kdfl_THREECUSTOM4 = 0;
    public static final double kdbr_THREECUSTOM4 = 0;
    public static final double kdbl_THREECUSTOM4 = 0;
    public static final int kn_THREECUSTOM4 = 0;

    public static final int ks_THREECUSTOM5 = 235;
    public static final double kdfr_THREECUSTOM5 = 0;
    public static final double kdfl_THREECUSTOM5 = 0;
    public static final double kdbr_THREECUSTOM5 = 0;
    public static final double kdbl_THREECUSTOM5 = 0;
    public static final int kn_THREECUSTOM5 = 0;

    public static final int ks_THREECUSTOM6 = 236;
    public static final double kdfr_THREECUSTOM6 = 0;
    public static final double kdfl_THREECUSTOM6 = 0;
    public static final double kdbr_THREECUSTOM6 = 0;
    public static final double kdbl_THREECUSTOM6 = 0;
    public static final int kn_THREECUSTOM6 = 0;

    public static final int ks_THREECUSTOM7 = 237;
    public static final double kdfr_THREECUSTOM7 = 0;
    public static final double kdfl_THREECUSTOM7 = 0;
    public static final double kdbr_THREECUSTOM7 = 0;
    public static final double kdbl_THREECUSTOM7 = 0;
    public static final int kn_THREECUSTOM7 = 0;

    public static final int ks_THREECUSTOM8 = 238;
    public static final double kdfr_THREECUSTOM8 = 0;
    public static final double kdfl_THREECUSTOM8 = 0;
    public static final double kdbr_THREECUSTOM8 = 0;
    public static final double kdbl_THREECUSTOM8 = 0;
    public static final int kn_THREECUSTOM8 = 0;

    public static final int ks_THREECUSTOM9 = 239;
    public static final double kdfr_THREECUSTOM9 = 0;
    public static final double kdfl_THREECUSTOM9 = 0;
    public static final double kdbr_THREECUSTOM9 = 0;
    public static final double kdbl_THREECUSTOM9 = 0;
    public static final int kn_THREECUSTOM9 = 0;

    public static final int ks_THREECUSTOM10 = 240;
    public static final double kdfr_THREECUSTOM10 = 0;
    public static final double kdfl_THREECUSTOM10 = 0;
    public static final double kdbr_THREECUSTOM10 = 0;
    public static final double kdbl_THREECUSTOM10 = 0;
    public static final int kn_THREECUSTOM10 = 0;

    //preset constants
    public static final int kp_SUBMERSIBLE = 1;
    public static final int kp_OFFWALL = 2;
    public static final int kp_UNDERCHAMBER = 3;
    public static final int kp_TELECHAMBER = 4;
    public static final int kp_OVERCHAMBER = 5;
    public static final int kp_AUTOCHAMBER = 6;
    public static final int kp_HIGHBASKET = 7;
    public static final int kp_ASCENT = 8;


    public static final int kp_TWIST0   = 9;
    public static final int kp_TWIST45  = 10;
    public static final int kp_TWIST90  = 11;
    public static final int kp_TWIST135 = 12;
    public static final int kp_TWIST180 = 13;

    public static final int kp_MANUAL = 15;

}
