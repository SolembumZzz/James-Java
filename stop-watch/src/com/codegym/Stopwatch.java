package com.codegym;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Stopwatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public Stopwatch() {
        this.startTime = java.time.LocalTime.now();
    }

    public LocalTime getStartTime() {
        return this.startTime;
    }

    public LocalTime getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = java.time.LocalTime.now();
    }

    public void end() {
        this.endTime = java.time.LocalTime.now();
    }

    public long getElapsedTime() {
        return ChronoUnit.MILLIS.between(this.startTime, this.endTime);
    }
}
