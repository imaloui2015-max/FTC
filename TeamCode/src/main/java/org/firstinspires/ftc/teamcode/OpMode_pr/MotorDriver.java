package org.firstinspires.ftc.teamcode.OpMode_pr;

import static java.lang.Math.abs;

public class MotorDriver {
    private MotorDc motor;
    double forwardleft;
    double backwarleft;
    double forwardright;
    double backwardright;

    double dinomenator;


    public MotorDriver(MotorDc motor){
        this.motor = motor;
    }

    public void set_motor_mouvement(double x, double y, double rx){
        forwardleft = x + y + rx;
        forwardright = x - y + rx;
        backwarleft = x + y - rx;
        backwardright = x - y - rx;

        dinomenator = Math.max(abs(x) + abs(y) + abs(rx), 1);

    }

    public void move_motor(){

        motor.frontleft.setPower((int)forwardleft / (int)dinomenator);
        motor.frontright.setPower((int)forwardright / (int)dinomenator);
        motor.backleft.setPower((int)backwarleft / (int)dinomenator);
        motor.backright.setPower((int)backwardright / (int)dinomenator);

    }
}
