package com.example.databinding.model;

public class Charity {
    private String titleToolbar,titleActivity,description;

    public Charity(String titleToolbar, String titleActivity, String description) {
        this.titleToolbar = titleToolbar;
        this.titleActivity = titleActivity;
        this.description = description;
    }

    public String getTitleToolbar() {
        return titleToolbar;
    }

    public void setTitleToolbar(String titleToolbar) {
        this.titleToolbar = titleToolbar;
    }

    public String getTitleActivity() {
        return titleActivity;
    }

    public void setTitleActivity(String titleActivity) {
        this.titleActivity = titleActivity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
