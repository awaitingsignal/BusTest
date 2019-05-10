package com.prokarma.bustest.model;

import com.google.gson.annotations.SerializedName;

public class Team {

    @SerializedName("division")
    private String division;

    @SerializedName("conference")
    private String conference;

    @SerializedName("full_name")
    private String fullName;

    @SerializedName("city")
    private String city;

    @SerializedName("name")
    private String name;

    @SerializedName("id")
    private int id;

    @SerializedName("abbreviation")
    private String abbreviation;

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Override
    public String toString() {
        return
                "Team{" +
                        "division = '" + division + '\'' +
                        ",conference = '" + conference + '\'' +
                        ",full_name = '" + fullName + '\'' +
                        ",city = '" + city + '\'' +
                        ",name = '" + name + '\'' +
                        ",id = '" + id + '\'' +
                        ",abbreviation = '" + abbreviation + '\'' +
                        "}";
    }
}