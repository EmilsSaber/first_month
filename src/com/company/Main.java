package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String otvet = hM(generateRandomAge(), 0)
                + hM(generateRandomAge(), 15)
                + hM(generateRandomAge(), 20)
                + hM(generateRandomAge(), 40)
                + hM(generateRandomAge(), 1);

        System.out.println(otvet);

        System.out.println(generateRandomAge());

    }

    public static String hM(int age, int temperture) {

        if ((age > 20 && age < 45) && temperture > -20 && temperture < 30) {
            //
            return "  Можно идти гулять - \n";
        }

        else if (age < 20 && temperture >= 0 && temperture < 28) {
            return "  Можно идти гуЫлять -  \n";
        }
        else if (age > 45 && temperture > -10 && temperture < 25) {
            return "  Можно идти гулять - \n";
        }
        else
            return "  Остовайся дома - \n";
    }


    public static int generateRandomAge() {

       /* Random random = new Random();
        int ab = random.nextInt(100) + 1;*/

        int a = 1;
        int b = 100;

        int age = a + (int) (Math.random() * b);
        return age;

    }
}

