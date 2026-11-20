package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;

import org.firstinspires.ftc.robotcontroller.external.samples.ConceptRevSPARKMini;
import org.firstinspires.ftc.teamcode.Mecanism.Servo;

@TeleOp
public class ServoMain extends OpMode {

    Servo servo = new Servo();


    @Override
    public void init(){
        servo.init(hardwareMap);
    }

    @Override
    public void loop(){
        if (gamepad1.a){
            servo.setServo(0.5);
        }else {
            servo.setServo(1.0);
        }

        if (gamepad1.b){
            servo.setServoR(-1.0);
        }else {
            servo.setServoR(0.5);
        }
    }

}
