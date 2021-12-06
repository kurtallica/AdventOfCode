package com.company.kurt.Challenges;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DayTwo {

    public int subPosition() throws FileNotFoundException {

        File file = new File("DayTwoTaskOne");
        Scanner sc = new Scanner(file);

        List<String> instructions = new LinkedList<>();

        while(sc.hasNext()){
            instructions.add(sc.nextLine());
        }

        int quant = 0;
        String dir = "";


        int horPos = 0;
        int depth = 0;

        for(String s: instructions){
            quant = Integer.parseInt(s.substring(s.length()-1));
            dir = s.substring(0, s.length()-2);
            System.out.println(dir + ", " + quant);

            if(dir.equals("forward")){
                horPos += quant;
                System.out.println("New Horizontal Position " + horPos);
            }
            if(dir.equals("up")){
                depth -= quant;
                System.out.println("New Depth = " + depth);
            }
            else if(dir.equals("down")){
                depth += quant;
                System.out.println("New Depth = " + depth);
            }
        }
        return horPos * depth;
    }

    public int aim() throws FileNotFoundException {

        File file = new File("DayTwoTaskOne");
        Scanner sc = new Scanner(file);

        List<String> instructions = new LinkedList<>();

        while(sc.hasNext()){
            instructions.add(sc.nextLine());
        }


        int quant = 0;
        String dir = "";


        int horPos = 0;
        int depth = 0;
        int aim = 0;

        for(String s: instructions){
            quant = Integer.parseInt(s.substring(s.length()-1));
            dir = s.substring(0, s.length()-2);
            System.out.println(dir + ", " + quant);

            if(dir.equals("forward")){
                horPos += quant;
                if(aim != 0){
                    int calc = (aim * quant);
                    depth += calc;
                }
                System.out.println("New Horizontal Position " + horPos);
                System.out.println("New Depth " + depth);
            }
            if(dir.equals("up")){
                aim = aim != 0 ? aim -= quant : 0;
                System.out.println("New Depth = " + depth);
                System.out.println("New Aim: " + aim);
            }
            else if(dir.equals("down")){
                aim += quant;
                System.out.println("New Depth = " + depth);
                System.out.println("New Aim: " + aim);
            }
        }
        System.out.println(horPos * depth);
        return horPos * depth;
    }
}
