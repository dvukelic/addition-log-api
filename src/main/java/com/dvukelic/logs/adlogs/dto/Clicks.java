package com.dvukelic.logs.adlogs.dto;

public class Clicks {

    private Integer numberOfClicks;

    public Integer getNumberOfClicks() {
        return numberOfClicks;
    }

    public void setNumberOfClicks(Integer numberOfClicks) {
        this.numberOfClicks = numberOfClicks;
    }

    @Override
    public String toString() {
        return "Clicks{" +
                "numberOfClicks=" + numberOfClicks +
                '}';
    }
}
