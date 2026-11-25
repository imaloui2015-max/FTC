package org.firstinspires.ftc.teamcode.april_tag;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;

@Autonomous
public class Autonomous_main extends OpMode {

    April_tag april_tag;

    @Override
    public void init(){
        april_tag = new April_tag(hardwareMap, telemetry);
    }

    @Override
    public void loop(){
        april_tag.detection();
        AprilTagDetection id64 = april_tag.getById(12);

    }

}
