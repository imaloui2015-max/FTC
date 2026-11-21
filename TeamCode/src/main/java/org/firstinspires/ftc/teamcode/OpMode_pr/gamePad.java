package org.firstinspires.ftc.teamcode.OpMode_pr;

import org.firstinspires.ftc.teamcode.GamePad;

public class gamePad {
    private GamePad gamepad;

    public  void gamePad(GamePad gamepad){
        this.gamepad = gamepad;
    }

    public double getX(){
        return gamepad.left_stick_x;
    }

    public double getY(){
        return gamepad.left_stick_y;
    }

    public double getRot(){
        return gamepad.right_stick_x;
    }

    public boolean gate(){
        return gamepad.a;
    }

    public boolean intake(){
        return gamepad.b;
    }
}
