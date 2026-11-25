package org.firstinspires.ftc.teamcode.April_tag_aio;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import android.util.Size;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;

import java.util.ArrayList;
import java.util.List;

public class AprilTag {

    private AprilTagProcessor april_tag_config;
    private VisionPortal vision_portal_config;

    private ArrayList<AprilTagDetection> arr_detection = new ArrayList<AprilTagDetection>();

    public AprilTag(HardwareMap hardwareMap){


        april_tag_config = new AprilTagProcessor.Builder()
                .setTagFamily(AprilTagProcessor.TagFamily.TAG_36h11)
                .setLensIntrinsics(new double[]{fx, fy, cx, cy})
                .setDrawTagID(true)
                .setDrawTagOutline(true)
                .setDrawAxes(true)
                .setDrawCubeProjection(true)
                .build();


        VisionPortal.Builder builder = new VisionPortal.Builder();

        builder.setCamera(hardwareMap.get(WebcamName.class, "Webcam"));
        builder.setCameraResolution(new Size(680, 840));
        builder.addProcessor(april_tag_config);

        vision_portal_config = builder.build();
    }

    public void Detection(){
        arr_detection = april_tag_config.getDetections();
    }

    public List<AprilTagDetection> getAprilTagetection(){
        return arr_detection;
    }

    public int April_tag_det(int id){
        for (AprilTagDetection detection : arr_detection){
            if (detection.id == id){
                return id;
            }
        }
    }

    public void stop(){
        if (vision_portal_config !=  null){
            vision_portal_config.close();

        }
    }

    public double see_FPS_for_optimasition(){
        return (vision_portal_config != null ? vision_portal_config.getFps():0);
    }

    public boolean checking_if_processor_is_enable(){
        return vision_portal_config.getProcessorEnabled(april_tag_config);
    }

    public void reducing_processing(boolean optimize){
        boolean enable = checking_if_processor_is_enable();

        if (optimize && !enable){
            vision_portal_config.setProcessorEnabled(april_tag_config, true);
        }else if (!optimize && enable){
            vision_portal_config.setProcessorEnabled(april_tag_config, false);
        }

        telemetry.addData("Camera FPS is: ", see_FPS_for_optimasition());
        telemetry.addData("AprilTag Active: ", enable);
    }
}
