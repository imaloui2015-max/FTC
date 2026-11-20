package org.firstinspires.ftc.teamcode.practce_mecanum;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.GamePad;

public class Gamepad0 {
    GamePad gamePad;

    public Gamepad0(Gamepad gamepad){
        this.gamePad = gamePad;
    }

    public double getX(){
        return gamePad.left_stick_x;
    }

    public double getY(){
        return gamePad.left_stick_y;
    }

    public double getRot(){
        return gamePad.right_stick_x;
    }

    public boolean intake(){
        return gamePad.a;
    }

    public boolean gate(){
        return gamePad.b;
    }
}
