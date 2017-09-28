package com.example.guides.quiz1.Model;

/**
 * Created by GUIDES on 9/28/2017.
 */

public class Output {


    private int logo;
    private String codename;
    private String version;
    private String api;
    private String date;

    public Output(int logo, String codename, String version, String api, String date) {
        this.logo = logo;
        this.codename = codename;
        this.version = version;
        this.api = api;
        this.date = date;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
