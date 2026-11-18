package org.firstinspires.ftc.teamcode;

import android.view.View;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class Methods extends OpMode {
    @Override
    public void init(){

    }

    // method can have a parameter or a lot it can return something or change something

    double square_input(double input){
        double output = input * input;
        if (input < 0) {
            output = output * -1;
        }

        return output;

    }

    // there is a lot of method that we can ceate such as

    void setMotorSpeed(double speed){
        motor.set(speed);
    }

    boolean isSensorPressed(){
        return touchSensor.isPressed();
    }

    double min(double x, double y){
        if (x < y){
            return x;
        }
        return y;
    }


    @Override
    public void loop(){
        double leftAmount = gamepad1.left_stick_x;
        double forwardAmount = -gamepad1.left_stick_y;

        telemetry.addData("Before X " , leftAmount);
        telemetry.addData("Before Y " , forwardAmount);

        leftAmount  = square_input(leftAmount);
        forwardAmount = square_input(forwardAmount);

        telemetry.addData("Before X " , leftAmount);
        telemetry.addData("Before Y " , forwardAmount);

    }
}
