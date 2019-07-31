package com.example.databinding.model;

public class CharityItem {
    private String deadline;
    private String name;
    private String description;
    private int rp_Supported,rp_Total;

    public CharityItem(String deadline, String name, String description, int rp_Supported, int rp_Total) {
        this.deadline = deadline;
        this.name = name;
        this.description = description;
        this.rp_Supported = rp_Supported;
        this.rp_Total = rp_Total;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRp_Supported() {
        return rp_Supported;
    }

    public void setRp_Supported(int rp_Supported) {
        this.rp_Supported = rp_Supported;
    }

    public int getRp_Total() {
        return rp_Total;
    }

    public void setRp_Total(int rp_Total) {
        this.rp_Total = rp_Total;
    }
}
