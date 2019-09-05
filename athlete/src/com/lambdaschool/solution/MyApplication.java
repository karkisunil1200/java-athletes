package com.lambdaschool.solution;

public class MyApplication implements Processor
{
    //TODO Add Stretch goal of a court interface injection
    
    private AthleteCreation ac;
    private CourtCreation cc;

    public MyApplication(AthleteCreation ac, CourtCreation cc)
    {
        this.ac = ac;
        this.cc = cc;
    }

    @Override
    public void displayAthlete()
    {
        System.out.println("************");
        ac.displayAthlete();
        System.out.println("************\n");
    }

    @Override
    public void displayCourt()
    {
        System.out.println("############");
        cc.displayCourt();
        System.out.println("############\n");
    }
}
