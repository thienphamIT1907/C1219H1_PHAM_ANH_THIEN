package Bai3_LopVaDoiTuongTrongJava.BaiTap.XayDungLopStopWatch;

import java.util.Date;

public class StopWatch {
    private float startTime;
    private float endTime;

    public StopWatch() {
        this.startTime = new Date().getTime();
    }

    public float getStartTime() {
        return startTime;
    }

    public float getEndTime() {
        return endTime;
    }

    public void start() {
        Date current = new Date();
        this.startTime = current.getTime();
    }

    public void stop() {
        Date current = new Date();
        this.endTime = current.getTime();
    }

    public float getElapsedTime() {
        return endTime - startTime;
    }
}
