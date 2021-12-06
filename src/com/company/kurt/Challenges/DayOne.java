package com.company.kurt.Challenges;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
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
                if (scNext > data) {
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

    public int slidingWindow() throws FileNotFoundException {

        File file = new File("DayOneTaskOne");
        Scanner sc = new Scanner(file);

        List<Integer> listOfNums = new ArrayList<>();

        while (sc.hasNext()){
            listOfNums.add(sc.nextInt());
        }

        Integer[] ints = listOfNums.toArray(new Integer[listOfNums.size()]);

        int window = 0;
        int count = ints[0] + ints[1] + ints[2];
        int seen = 0;
        int sum = 0;

        List<String> calcs = new LinkedList<>();

        for (int i = window; i < ints.length - 2; i++) {
            for (int j = window + 1; j < ints.length - 1; j++) {
                for (int k = window + 2; k < ints.length; k++) {
                    sum =  (ints[i] + ints[j] + ints[k]);
                    window++;
                    if(sum > count){
                        seen++;
                    }
                    count = sum;
                    break;
                }
                break;
            }
        }

        return seen;
    }
}
