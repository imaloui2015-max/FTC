package org.firstinspires.ftc.teamcode.OpMode_pr;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

public class adding_imu {
    private IMU imu;
    public AngleUnit angle;


    public void adding_imu(HardwareMap hardwareMap, AngleUnit angle){
        imu = hardwareMap.get(IMU.class, "imu");


        // setting orientation that we want then we can update parameters by those new ones
        RevHubOrientationOnRobot RevOr = new RevHubOrientationOnRobot(
                RevHubOrientationOnRobot.LogoFacingDirection.FORWARD,
                RevHubOrientationOnRobot.UsbFacingDirection.UP
        );
        // Replace and initialize new imu parameters
        imu.initialize(new IMU.Parameters(RevOr));
        this.angle = angle;

    }

    public double get_Pos(AngleUnit angleUnit){
        return imu.getRobotYawPitchRollAngles().getYaw(angleUnit);
    }
}
