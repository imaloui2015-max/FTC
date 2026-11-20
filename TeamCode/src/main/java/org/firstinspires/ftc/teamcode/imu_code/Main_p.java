package org.firstinspires.ftc.teamcode.imu_code;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;


@TeleOp
public class Main_p extends OpMode {
    imu_sensor robot;
    @Override
    public void init(){
        robot = new imu_sensor(hardwareMap);

    }

    @Override
    public void loop(){
        telemetry.addData("Get inforrmation about robot", robot.get_pos(AngleUnit.DEGREES));

        robot.set_motor_speed(robot.get_pos(AngleUnit.DEGREES));


    }
}
