package net.madvirus.spring4.chap06.animal;

import java.util.Random;

public class Rabbit implements IAnimal {
 
    @Override
    public String eat() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("풀떼기를 먹어요");
        if( new Random().nextBoolean())
            throw new Exception("맛없어");
        return "토끼";
    }
}
