package net.madvirus.spring4.chap06.animal;

import java.util.Random;

public class Cat implements IAnimal {
 
    @Override
    public String eat() throws Exception {
        System.out.println("생선을 먹어요");
        if( new Random().nextBoolean())
            throw new Exception("맛없어");
        return "고양이";
        
    }
}
