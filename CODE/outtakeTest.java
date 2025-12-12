package org.firstinspires.ftc.teamcode.roboCode.tele;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name="Outtake Test", group="Linear OpMode")
public class outtakeTest extends LinearOpMode {
    private DcMotorEx outtake;

    @Override
    public void runOpMode(){
        outtake = hardwareMap.get(DcMotorEx.class,"Outtake");
        outtake.setDirection(DcMotorSimple.Direction.FORWARD);
        double outtakePower =0;
        waitForStart();
        while(opModeIsActive()){
            outtakePower = gamepad1.b ? 1:0;
            outtake.setPower(outtakePower);
        }

    }
}
