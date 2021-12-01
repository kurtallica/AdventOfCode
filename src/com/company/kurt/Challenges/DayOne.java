package com.company.kurt.Challenges;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayOne {

    public int countOfIncrease() throws Exception {

        File file = new File("DayOneTaskOne");
        Scanner sc = new Scanner(file);
        int count = 0;
        int data = 0;

        try {
            while (sc.hasNext()) {
                int scNext = sc.nextInt();
                if(scNext > data){
                    count++;
                    data = scNext;
                }
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
        return count;
    }
}
