package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class Joystick extends OpMode {

    public void init(){

    }

    public void loop(){
        telemetry.addData("Left Stick X: ", gamepad1.left_stick_x);
        telemetry.addData("Left Stick y: ", gamepad1.left_stick_y);
        telemetry.addData("A button: ", gamepad1.a);


    }
}
