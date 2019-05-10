package com.prokarma.bustest.model;

import com.google.gson.annotations.SerializedName;

public class DataItem {

    @SerializedName("weight_pounds")
    private int weightPounds;

    @SerializedName("height_feet")
    private int heightFeet;

    @SerializedName("last_name")
    private String lastName;

    @SerializedName("height_inches")
    private int heightInches;

    @SerializedName("id")
    private int id;

    @SerializedName("position")
    private String position;

    @SerializedName("team")
    private Team team;

    @SerializedName("first_name")
    private String firstName;

    public int getWeightPounds() {
        return weightPounds;
    }

    public void setWeightPounds(int weightPounds) {
        this.weightPounds = weightPounds;
    }

    public int getHeightFeet() {
        return heightFeet;
    }

    public void setHeightFeet(int heightFeet) {
        this.heightFeet = heightFeet;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(int heightInches) {
        this.heightInches = heightInches;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return
                "DataItem{" +
                        "weight_pounds = '" + weightPounds + '\'' +
                        ",height_feet = '" + heightFeet + '\'' +
                        ",last_name = '" + lastName + '\'' +
                        ",height_inches = '" + heightInches + '\'' +
                        ",id = '" + id + '\'' +
                        ",position = '" + position + '\'' +
                        ",team = '" + team + '\'' +
                        ",first_name = '" + firstName + '\'' +
                        "}";
    }
}