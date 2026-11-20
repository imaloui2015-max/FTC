package org.firstinspires.ftc.teamcode.practce_mecanum;

import static java.lang.Math.abs;

import org.firstinspires.ftc.teamcode.Mecanum.RobotDcMotor;
import org.firstinspires.ftc.teamcode.motor;

public class Driver {
    private RobotMotorP motor;



    public Driver(RobotMotorP motor){
        this.motor = motor;
    }

    public void Moving_Motor(double x, double y, double rx){
        double FL = x + y + rx;
        double FR = x - y + rx;
        double BL = x + y - rx;
        double BR = x - y - rx;


        double dinomenator = Math.max(Math.sum(abs(x) + abs(y) + abs(rx)), 1);

        motor.fontLeft.setPower((int)FL / (int)dinomenator);
        motor.fontRight.setPower((int)FR / (int)dinomenator);
        motor.backLeft.setPower((int)BL / (int)dinomenator);
        motor.backRight.setPower((int)BR / (int)dinomenator);



    }
}
