package org.firstinspires.ftc.teamcode.april_tag;

import android.util.Size;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;

import java.util.ArrayList;
import java.util.List;

public class April_tag {


    // ===== Declare Variable =======
    private AprilTagProcessor apriltag;

    private VisionPortal visionportal;

    // Declare an array that well contains element
    private List<AprilTagDetection> arr_detect = new ArrayList<>();

    private Telemetry telemetry;


    // ==== initialise hardware ====
    public April_tag(HardwareMap hardwareMap, Telemetry telemetry){
        this.telemetry = telemetry;
        // ==== This our april tag so we're going to chose and update whatever we wnt ====
        apriltag = new AprilTagProcessor.Builder()
                .setDrawTagID(true)
                .setDrawTagOutline(true)
                .setDrawAxes(true)
                .setDrawCubeProjection(true)
                .setOutputUnits(DistanceUnit.CM, AngleUnit.DEGREES)
                .build(); // ==== You must build whenever you finish or the compilition gonna fail ====


        // ==== Build visionportal (manage the camera) ====
        VisionPortal.Builder builder = new VisionPortal.Builder();
        builder.setCamera(hardwareMap.get(WebcamName.class, "webcam"));
        builder.setCameraResolution(new Size(640 , 480));
        builder.addProcessor(apriltag); // ==== Then when were finished managing camera we should pass it april tag as a parameter ofc ====
        // =============== So as a conclusion we initialise april tag to pass it to the visionportal ===============

        // ==== This line combine all the thing that we build and update (Building.....)
        visionportal = builder.build();


    }
    // ======= --(Create some useful function (helper function)-- =======
    public void detection() {
        arr_detect = apriltag.getDetections();
    }

    public List<AprilTagDetection> getArr_detect() {
        return arr_detect;
    }

    public AprilTagDetection getById(int id) {
        for (AprilTagDetection detection : arr_detect){
            if (detection.id == id){
                return detection;
            }
        }
        return null;
    }

    public void stop(){
        if (visionportal != null){
            visionportal.close();
        }
    }
}
