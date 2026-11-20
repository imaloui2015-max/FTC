package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

public class practise0DcMotor {
    public DcMotor motor;

    public void init(HardwareMap hwdmap){
        motor = get.hwdmap(DcMotor.class, "motor");

    }

    public void set_speed(int speed){
        motor.setPower(speed);
    }

    public void stop_motor(){
        motor.setPower(0);
    }
}
