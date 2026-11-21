package org.firstinspires.ftc.teamcode.OpMode_pr;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.IMU;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.teamcode.GamePad;

import java.util.HashMap;

@TeleOp
public class MainTele extends OpMode {

    // Declare Varibale That we gonna Use  later on of a specific type

    public MotorDc motor;
    public gamePad gamepad;
    public adding_imu imu;
    public MotorDriver driver;
    // Creating a hashmap string string
    public HashMap<String, String> map = new HashMap<>();



    @Override
    public void init(){
        // inialize the Hardware that We gonna need
        motor = new MotorDc(hardwareMap);
        gamepad =  new gamePad(gamepad1);
        driver = new MotorDriver(motor);
        imu = new adding_imu(hardwareMap, AngleUnit.DEGREES);

    }

    @Override
    public void loop(){
        // Setting parameters to move the motor in a specific direction
        driver.set_motor_mouvement(gamepad.getX(), gamepad.getY(), gamepad.getRot());
        // Move The motor
        driver.move_motor();

        // printing angles on degres;
        telemetry.addData("Angles On Degres", imu.get_Pos(AngleUnit.DEGREES));
        map.put(AngleUnit.DEGREES.toString(), "The angle Is on Degrees");
        map.put(AngleUnit.RADIANS.toString(), "The angle Is on Radians");


        // checking if the angle given by the imu is valid by passing it to a function
        if (!motor.get_pos(AngleUnit.DEGREES.toString(), imu.get_Pos(AngleUnit.DEGREES))){
            telemetry.addData("You Passed The Angle");
        }else {
            telemetry.addData("Your In the Right Angle");
        }

        if (gamepad.intake()){
            motor.intake.setPosition(1.0); // The intake move to the other side
        }else {
            motor.intake.setPosition(0.5); // The intake move to the middle
        }

        // printing wither the Angle Unit is in radians or degrees
        telemetry.addData(map.get(imu.angle.toString()));




    }
}
