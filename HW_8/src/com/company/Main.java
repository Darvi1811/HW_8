package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // ex 2
        GlobalRating j = new GlobalRating();
        Score[] f = GlobalRating.data;
        Score a = new Score();
        a.category = "views";
        Score b = new Score();
        a.category = "actions";
        Score c = new Score();
        a.category = "sharings";
        Score d = new Score();
        d.category = "buyings";

        for (int i = 0; i < f.length; i++) {
            String x = (f[i].category + ": ");
            for (int k = 0; k < f[i].statistic.length; k++) {
                if (k == f[i].statistic.length-1) { // Для того чтобы в конце не было запятой
                    x = (x + f[i].statistic[k] + "");
                } else {
                    x = (x + f[i].statistic[k] + ", ");
                }
            }
            System.out.println(x);
        }
    }
}
