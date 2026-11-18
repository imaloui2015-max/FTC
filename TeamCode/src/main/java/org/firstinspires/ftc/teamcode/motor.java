package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Base Two Motor")
public class motor extends LinearOpMode {

    // Give a type for variables
    private DcMotor leftmotor;
    private DcMotor rightmotor;

    @Override
    public void runOpMode() {
        leftmotor = hardwareMap.get(DcMotor.class, "leftMotor");
        rightmotor = hardwareMap.get(DcMotor.class, "rightMotor");


        waitForStart();

        while (opModeIsActive()){
            // Move forward
            leftmotor.setPower(0.5);
            rightmotor.setPower(0.5);
        }

        // if we want to stop we simply give a prameters of 0
        leftmotor.setPower(0);
        rightmotor.setPower(0);



    }

}
