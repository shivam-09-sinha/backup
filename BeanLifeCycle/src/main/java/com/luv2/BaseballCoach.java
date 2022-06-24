package com.luv2;

public class BaseballCoach implements Coach {
    public String getDailyWorkout()
    {
        return "spent 20 min on batting practice";
    }




    //add an init method

    public void doMyStartupStuff()
    {
        System.out.println("BaseballCoach:inside method doMyStartupstuff");
    }

    //add a destroy method
    public void doMyCleanupStuff()
    {
        System.out.println("BaseballCoach:inside method doMycleanupstuff");
    }

}
