package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class decision extends OpMode {

    @Override
    public void init(){

    }

    /*
    @Override
    public void loop(){
        if (gamepad1.left_stick_y < 0){
            telemetry.addData("Left Stick ", "is negative");
        }
        telemetry.addData("Left stick y", gamepad1.left_stick_y);
    }

     */


    /*
    @Override
    public void loop(){
        if (gamepad1.a){
            telemetry.addData("A butoon", "presses");
        }
    }

     */

    @Override
    public void loop(){
        if (gamepad1.left_stick_y < 0){
            telemetry.addData("Left stick"," is negative");
        }else {
            telemetry.addData("Left stick"," is prositif");
        }
        telemetry.addData("Left stick_y ", gamepad1.left_stick_y);
    }
}
