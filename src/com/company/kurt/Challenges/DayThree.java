package com.company.kurt.Challenges;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DayThree {

    public String gammaEpsilon() throws FileNotFoundException {

        File file = new File("DayThreeTaskOne");
        Scanner sc = new Scanner(file);

        List<String> bits = new ArrayList<>();

        StringBuilder gammaRate = new StringBuilder();
        StringBuilder epsilonRate = new StringBuilder();

        while(sc.hasNext()){
            bits.add(sc.nextLine());
        }

        for (int i = 0; i < bits.get(0).length(); i++){

            int zeroCount = 0;
            int oneCount = 0;

            for (String s : bits){

                String pos = s.substring(i, i+1);
                //System.out.println("Substring: " + pos);
                if (pos.contains("0")){
                    zeroCount++;
                }
                else {
                    oneCount++;
                }
            }
//            System.out.println("OneCount: " + oneCount);
//            System.out.println("ZeroCount: " + zeroCount);

            if (oneCount > zeroCount){
                gammaRate.append("1");
                epsilonRate.append("0");
            }
            else{
                gammaRate.append("0");
                epsilonRate.append("1");
            }
        }
        return "Consumption: " +
                (Integer.parseInt(gammaRate.toString(),2)) * (Integer.parseInt(epsilonRate.toString(),2));

//        System.out.println("Gamma Rate Binary: " + gammaRate);
//        System.out.println("Gamma Rate Decimal: " + Integer.parseInt(gammaRate.toString(),2));
//        System.out.println("-------------");
//        System.out.println("Epsilon Rate Binary: " + epsilonRate);
//        System.out.println("Epsilon Rate Decimal: " + Integer.parseInt(epsilonRate.toString(),2));
    }
}
