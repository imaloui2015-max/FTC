package org.firstinspires.ftc.teamcode.OpMode_pr;

import static java.lang.Math.abs;

public class MotorDriver {

    // creating instance variable that we going to need
    private MotorDc motor;
    double  forwardleft;
    double backwarleft;
    double forwardright;
    double backwardright;

    double dinomenator;



    // Creating a Constructure
    public MotorDriver(MotorDc motor){
        this.motor = motor;
    }

    // Creating a function (helper funtion) that gonna help as bc it calculate the speed gonna use by a mathematical formula
    public void set_motor_mouvement(double x, double y, double rx){
        forwardleft = x + y + rx;
        forwardright = x - y + rx;
        backwarleft = x + y - rx;
        backwardright = x - y - rx;

        dinomenator = Math.max(abs(x) + abs(y) + abs(rx), 1);

    }

    // Move The motor using the function below
    public void move_motor(){

        motor.frontleft.setPower((int)forwardleft / (int)dinomenator);
        motor.frontright.setPower((int)forwardright / (int)dinomenator);
        motor.backleft.setPower((int)backwarleft / (int)dinomenator);
        motor.backright.setPower((int)backwardright / (int)dinomenator);

    }
}
