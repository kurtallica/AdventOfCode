package com.company.kurt.Challenges;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DayOne {

    public int countOfIncrease() throws Exception {

        File file = new File("DayOneTaskOne");
        Scanner sc = new Scanner(file);

        int data = sc.nextInt();
        int count = 0;

        try {
            while (sc.hasNext()) {
                int scNext = sc.nextInt();
                if(scNext > data){
                    count++;
                }
                data = scNext;
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
        return count;
    }
}
