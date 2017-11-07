package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random tt = new Random();
        for (int i = 0; i < 20;i++) {
            int max = 100;
            int min = 1;
            int fs = tt.nextInt(max) + min;
            System.out.print(fs + " ");
        }
        System.out.println("");
        for (int i = 0; i < 20;i++){
            double ma = 75;
            double min = 25;
            double ff=min + (Math.random()*ma);
	        System.out.println(ff);
    }
       String str = "Съешь ещё этих мягких французских булок, да выпей же чаю";
        char[] ch =  str.toCharArray();
        for (int i = 0; i < ch.length;i++){
            System.out.print( ch[i]+" ");
        }
    }
}
