package org.firstinspires.ftc.teamcode.Mecanum;

public class MecanumDriver {
    private RobotDcMotor motors;

    public MecanumDrive(RobotDcMotor motors){
        this.motors = motors;
    }
    public void drive(double y, double x, double rx){
        double FL = y + x + rx;
        double FR = y - x - rx;
        double BL = y - x + rx;
        double BR = y + x - rx;

        double dinomenator = Math.max(Math.abs(x) + Math.abs(y) + Math.abs(rx), 1); // Normalize Value The value are clipped

        motors.frontLeft.setPower((int)FL / (int)dinomenator);
        motors.frontRight.setPower((int)FR / (int)dinomenator);
        motors.backLeft.setPower((int)BL / (int)dinomenator);
        motors.backRight.setPower((int)BL / (int)dinomenator);

    }
}
