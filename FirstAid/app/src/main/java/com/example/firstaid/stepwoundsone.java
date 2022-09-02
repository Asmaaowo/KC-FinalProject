package com.example.firstaid;

public class stepwoundsone {
    private String steps;
    private int numstep;

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public int getNumstep() {
        return numstep;
    }

    public void setNumstep(int numstep) {
        this.numstep = numstep;
    }

    public int getStepphoto() {
        return stepphoto;
    }

    public void setStepphoto(int stepphoto) {
        this.stepphoto = stepphoto;
    }

    private int stepphoto;

    public stepwoundsone(String steps, int numstep, int stepphoto) {
        this.steps = steps;
        this.numstep = numstep;
        this.stepphoto = stepphoto;
    }
}
