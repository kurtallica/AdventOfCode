package com.company.kurt;

import com.company.kurt.Challenges.DayOne;
import com.company.kurt.Challenges.DayThree;
import com.company.kurt.Challenges.DayTwo;

public class Main {

    public static void main(String[] args) throws Exception {

        DayOne dayOne = new DayOne();
        DayTwo dayTwo = new DayTwo();
        DayThree dayThree = new DayThree();
        //System.out.println(dayOne.countOfIncrease());
        //System.out.println(dayOne.slidingWindow());
        //dayTwo.aim();

        System.out.println(dayThree.gammaEpsilon());
    }
}
