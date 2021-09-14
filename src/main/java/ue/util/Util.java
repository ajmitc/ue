package ue.util;

import java.util.Date;
import java.util.Random;

public class Util{
    private static final Random GEN = new Random(new Date().getTime());

    public int roll(){
        return GEN.nextInt(6) + 1;
    }

    public int roll2d(){
        return roll() + roll();
    }

    private Util(){}
}
