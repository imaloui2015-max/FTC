package org.firstinspires.ftc.teamcode.Mecanum;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Main TeleOp")
public class MainTeleOp extends LinearOpMode {

    @Override
    public void runOpMode(){
        // Initialise hardware
        RobotDcMotor motors = new RobotDcMotor(hardwareMap);

        // Initialise macanum driver
        MecanumDriver drive = new MecanumDriver(motors);

        // Initialise GamePad
        GamePadController controller = new GamePadController(gamepad1);

        waitForStart(); // it's a common line for Linear OpMode;

        while (opModeIsActive()){
            // Move the Robot;
            drive.drive(controller.getY(), controller.getX(), controller.getRotation());

            // intake;
            if (controller.intakefwd()){
                motors.intake.setPower(1);

            }else if (controller.intakebwd()){
                motors.intake.setPower(-1);
            }else {
                motors.intake.setPower(0);
            }

            telemetry.update(); // common line while working with linear opmode
        }

    }


}
