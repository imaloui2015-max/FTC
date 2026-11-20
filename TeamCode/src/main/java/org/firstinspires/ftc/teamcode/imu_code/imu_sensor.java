package org.firstinspires.ftc.teamcode.imu_code;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.teamcode.DcMotor;

public class imu_sensor {

    // Declare a variable if we want to use it
    private IMU imu;
    private DcMotor motor;

    public imu_sensor(HardwareMap hardwareMap){
        // initialize the valiable that we declared early
        imu = hardwareMap.get(IMU.class, "imu");

        // Controll and Mesure The Robot Mvm and Rotation
        RevHubOrientationOnRobot revOri = new RevHubOrientationOnRobot(
                RevHubOrientationOnRobot.LogoFacingDirection.UP,
                RevHubOrientationOnRobot.UsbFacingDirection.FORWARD
        );
        // here update the imu parameters to get just what we want
        imu.initialize(new IMU.Parameters(revOri));

        motor = hardwareMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    }

    public double get_pos(AngleUnit unit){
        return imu.getRobotYawPitchRollAngles().getYaw(unit);
    }

    public void set_motor_speed(double value){
        if (value < 0.5){
            motor.setPower(1);
        }else{
            motor.setPower(0);
        }
    }



}
