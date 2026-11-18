package org.firstinspires.ftc.teamcode.Mecanism;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

//that file contains same tools that we need later on;
public class Tools {
    private DcMotor motor1; // we just create a variable class DcMotor

    private double ticks_per_revolution; // Create a variable that well store the number of encoder ticks needed
    // for one complete revolution;


    public void init(HardwareMap hardware){
        // Code the Dc Motor
        motor1 = hardware.get(DcMotor.class, "motor");
        motor1.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticks_per_revolution = motor1.getMotorType().getTicksPerRev(); // getMotorType() -> to get info about
        // the motor's config
        // also getTicksPerRev() required the type of the motor if u didn't specify the type it well not works
        // getTicksPerRev() --> Returns The config encoder counts per revolution

    }
    public void speedCallosity(double speed){

        // the speed show be btw -1.0 and 1
        motor1.setPower(speed);
    }

    public void Run_position(double speed, int targetpos){
        // instruction for a motor to go a specific position by a given speed valosity
        motor1.setTargetPosition(targetpos);
        motor1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor1.setPower(speed);
    }

    public double CalculateTicks_per_revolution() {
        return motor1.getCurrentPosition() / ticks_per_revolution * 2; // Normalization then doubled the revolution
    }

}
