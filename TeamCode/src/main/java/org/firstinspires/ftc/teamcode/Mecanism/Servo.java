package org.firstinspires.ftc.teamcode.Mecanism;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Servo {
    private Servo myservo;

    private CRServo myservoR; // continuse rotational servo

    public void init(HardwareMap hardwareMap){
        myservo = hardwareMap.get(Servo.class, "servo");
        myservoR = hardwareMap.get(Servo.class, "servoR");
        myservoR.setDirection(CRServo.Direction.REVERSE);


    }

    public void setServo(double angle){
        myservo.setPosition(angle);
    }

    public void setServoR(double speed){
        myservoR.setPower(speed);
    }


}
