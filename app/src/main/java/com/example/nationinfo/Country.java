package com.example.nationinfo;

public class Country {
    private String name;
    private String population;
    private  String area;
    private String linkFlag;
    public Country(String name, String population, String area, String linkFlag) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.linkFlag=linkFlag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getArea() {
        return area;
    }

    public String getLinkFlag() {
        return linkFlag;
    }

    public void setLinkFlag(String linkFlag) {
        this.linkFlag = linkFlag;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
