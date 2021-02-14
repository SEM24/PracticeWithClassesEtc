package com.company.factory;

import com.company.TimeTableDate;

public class TimeFactory {

    private final String[] time = new String[]{"12:00","13:00","14:00",
            "15:00","16:00","17:00","18:00","19:00"};

    public TimeTableDate createTimeDate()
    {
        return new TimeTableDate(randomString(time));
    }

    private String randomString(String[]time)
    {
        int n = (int)Math.floor(Math.random() * time.length);
        return  time[n];

    }
}
