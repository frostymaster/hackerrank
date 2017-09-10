package com.frostmaster.algorithms.TimeConverter;

import java.util.Scanner;

public class TimeConveter {

    static String timeConversion(String s) {
        String timeOfDay = s.substring(s.length() - 2, s.length());
        String time = s.substring(0, s.length() - 2);
        String[] split = time.split(":");
        String result = "";

        if(timeOfDay.equals("AM")) {
            if(time.substring(0,2).equals("12"))
                time = "00" + time.substring(2, time.length());
            return time;
        }

        if(split[0].equals("12"))
            return time;

        for(int i = 0; i < split.length; i++){
            if(i == 0) {
                Integer digit = Integer.parseInt(split[i]);
                digit += 12;
                split[i] = digit.toString();
            }
            result = result + split[i] + ":";

        }

        return result.substring(0,result.length() - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }

}
