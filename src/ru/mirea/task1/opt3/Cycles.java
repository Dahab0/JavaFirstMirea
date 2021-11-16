package ru.mirea.task1.opt3;

public class Cycles {
    public static void main(String[] args) {

        int sum = 0;
        //int j = 1;

        //for

        for (int i = 0; i <= 1000; i++) {
            sum += i;
        }
        System.out.println(sum);

        //while
        sum = 0;
        int j = 1;
        while (j<= 1000)
        {
            sum += j;
            j++;
        }
        System.out.println(sum);

        //do while
        sum = 0;
        j = 1;
        do {
            sum += j;
            j++;
            }
        while (j<= 1000);
        System.out.println(sum);
        }

    }
