package org.firstinspires.ftc.teamcode.practce_mecanum;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.DcMotor;

public class RobotMotorP {
    // Create and declare all the instance variable that we gonna use later on
    public DcMotor fontLeft;
    public DcMotor fontRight;
    public DcMotor backLeft;
    public DcMotor backRight;


    // Initalise that and connect it and configure it to use it
    public RobotMotorP(HardwareMap hardwareMap){
        fontLeft = hardwareMap.get(DcMotor.class, "fontLeft");
        fontRight = hardwareMap.get(DcMotor.class, "fontRight");
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        backRight = hardwareMap.get(DcMotor.class, "backRight");

    }
}
