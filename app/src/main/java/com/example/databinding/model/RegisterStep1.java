package com.example.databinding.model;

public class RegisterStep1 {
    private String step, registration, conten, continue1;

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getConten() {
        return conten;
    }

    public void setConten(String conten) {
        this.conten = conten;
    }

    public String getContinue1() {
        return continue1;
    }

    public void setContinue1(String continue1) {
        this.continue1 = continue1;
    }

    public RegisterStep1(String step, String registration, String conten, String continue1) {
        this.step = step;
        this.registration = registration;
        this.conten = conten;
        this.continue1 = continue1;
    }
}

