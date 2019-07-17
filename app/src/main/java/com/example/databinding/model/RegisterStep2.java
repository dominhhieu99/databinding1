package com.example.databinding.model;

public class RegisterStep2 {
    private String step, verification, conten, continue2;

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getVerification() {
        return verification;
    }

    public void setVerification(String verification) {
        this.verification = verification;
    }

    public String getConten() {
        return conten;
    }

    public void setConten(String conten) {
        this.conten = conten;
    }

    public String getContinue2() {
        return continue2;
    }

    public void setContinue2(String continue2) {
        this.continue2 = continue2;
    }

    public RegisterStep2(String step, String verification, String conten, String continue2) {
        this.step = step;
        this.verification = verification;
        this.conten = conten;
        this.continue2 = continue2;
    }
}

