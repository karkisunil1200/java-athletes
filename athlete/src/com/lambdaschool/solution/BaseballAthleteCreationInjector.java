package com.lambdaschool.solution;

public class BaseballAthleteCreationInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new BaseballAthleteCreationImpl(), new BaseballCourtCreationImpl());
    }
}
