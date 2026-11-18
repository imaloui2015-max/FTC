package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Mecanism.Tools;


@TeleOp
public class DcMotor extends OpMode {

    // Create instance variable to give it to some object later on to use it
    Tools tool = new Tools();

    @Override
    public void init(){

        tool.init(hardwareMap);

    }

    @Override
    public void loop(){
        tool.speedCallosity(1.0); // the highest speed is 1.0 and lowest is -1.0
        telemetry.addData("Motor Revolution", tool.CalculateTicks_per_revolution());
    }

    public void setPower(int i) {

    }
}
