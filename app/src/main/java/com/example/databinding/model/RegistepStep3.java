package com.example.databinding.model;

public class RegistepStep3 {
    private String step, fingerprint, conten, continue3;

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getConten() {
        return conten;
    }

    public void setConten(String conten) {
        this.conten = conten;
    }

    public String getContinue3() {
        return continue3;
    }

    public void setContinue3(String continue3) {
        this.continue3 = continue3;
    }

    public RegistepStep3(String step, String fingerprint, String conten, String continue3) {
        this.step = step;
        this.fingerprint = fingerprint;
        this.conten = conten;
        this.continue3 = continue3;
    }
}


