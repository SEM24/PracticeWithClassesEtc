package com.company.notHuman;

public class Audience {

    public int audienceNumber;

    public Audience(int audienceNumber) {

        this.audienceNumber = audienceNumber;
    }

    @Override
    public String toString() {
        return "№: " + audienceNumber;
    }
}
