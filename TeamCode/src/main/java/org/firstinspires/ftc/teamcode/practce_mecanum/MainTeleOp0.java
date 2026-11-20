package org.firstinspires.ftc.teamcode.practce_mecanum;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Mecanum.MecanumDriver;


@TeleOp
public class MainTeleOp0 extends LinearOpMode {

    @Override
    public void runOpMode(){
        RobotMotorP motor = new RobotMotorP(hardwareMap);

        Driver driver = new Driver(motor);

        Gamepad0 gamepad = new Gamepad0(gamepad1);

        while (opModeIsActive()){
            driver.Moving_Motor(gamepad.getX(), gamepad.getY(), gamepad.getRot());

            if (gamepad.intake()){

            }
        }




    }




}
