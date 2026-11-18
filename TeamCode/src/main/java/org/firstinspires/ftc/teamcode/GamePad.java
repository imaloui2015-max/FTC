package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class GamePad extends OpMode {

    public void init(){

    }

    public void loop(){

        double speedFwd = -gamepad1.left_stick_x / 2.0; // 0.5 and -0.5

        telemetry.addData("X axis Gamepad value", speedFwd); // showing the value of gamepad
        // int he x axis
        telemetry.addData("Y axis Gamepad value", gamepad1.left_stick_y);
        telemetry.addData("A button", gamepad1.a);
    }
}
