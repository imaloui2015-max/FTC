package org.firstinspires.ftc.teamcode.Mecanum;

import org.firstinspires.ftc.teamcode.GamePad;

public class GamePadController {
    private GamePad gamepad;


    public GamePadController(GamePad gamepad){
        this.gamepad = gamepad;
    }

    public double getX(){
        return gamepad.left_stick_x;
    }

    public double getY(){
        return gamepad.left_stick_y;
    }

    public double getRotation(){
        return gamepad.right_stick_x;
    }

    public boolean intakefwd(){
        return gamepad.a;
    }

    public double intakebwd(){
        return gamepad.b;
    }

    public boolean openGate(){
        return gamepad.x;
    }

    public boolean closeGate(){
        return gamepad.y;
    }



}
