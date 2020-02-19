package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numArr = new int[15];
        int even = 0;
        int odd = 0;

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < numArr.length; i++) {
            if (i %2 == 0 || i == 0)
                even += numArr[i];
            else
                odd += numArr[i];
        }

        if (even > odd)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
