package com.company.factory;

import com.company.notHuman.Audience;

public class AudienceFactory {

    private final int min=0;
    private final int max=100;


    public Audience createAudience()
    {
        return new Audience(randomAge(min,max));
    }

    private int randomAge(int min, int max)
    {        //ctrl+q
        return (int) (Math.random()*(max+1-min)+min);
    }
}
