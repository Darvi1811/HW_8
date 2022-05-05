package com.company;

public class Score {
    String category;
    double[] statistic = new double[10];

    {
        for (int i = 0; i < statistic.length; i++) {
            statistic[i] = (int) (Math.random()*11);
        }
    }

}
