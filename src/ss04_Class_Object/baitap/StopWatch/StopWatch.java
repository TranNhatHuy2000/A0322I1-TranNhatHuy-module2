package ss04_Class_Object.baitap.StopWatch;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime,endTime;

    public StopWatch(){
        startTime = LocalTime.now();
    }

    public LocalTime getStartTime(){
        return this.startTime;
    }

    public LocalTime getEndTime(){
        return this.endTime;
    }
    public void start(){
        this.startTime = LocalTime.now();
    }

    public void stop(){
        this.endTime = LocalTime.now();
    }

    public int getElapsedTime() {
        int milisecond =((endTime.getHour()-startTime.getHour())*3600+(endTime.getMinute()-startTime.getMinute())*60+(endTime.getSecond()-startTime.getSecond())*1000);
        return milisecond;
    }
}
