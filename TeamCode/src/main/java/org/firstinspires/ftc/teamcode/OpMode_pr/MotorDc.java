package org.firstinspires.ftc.teamcode.OpMode_pr;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.teamcode.DcMotor;

public class MotorDc {


    // Creating instance variable
    public DcMotor frontleft;
    public DcMotor frontright;
    public DcMotor backright;
    public DcMotor backleft;

    public Servo intake;

    public boolean gate;


    public void MotorDc(HardwareMap hardwareMap){
        frontleft = hardwareMap.get(DcMotor.class, "frontleft");
        frontright = hardwareMap.get(DcMotor.class, "frontright");
        backleft = hardwareMap.get(DcMotor.class, "backleft");
        backright = hardwareMap.get(DcMotor.class, "backright");

        intake = hardwareMap.get(Servo.class, "intake");
        gate = true;
    }

    // Stop The motor
    public void stop_motor(){
        frontleft.setPower(0);
        frontright.setPower(0);
        backleft.setPower(0);
        backright.setPower(0);

    }
    public boolean get_pos(String angle_unit, double angle){
        if (angle_unit == "Degrese")
            return angle > 180 && angle < 430;
        return false;
    }


}
