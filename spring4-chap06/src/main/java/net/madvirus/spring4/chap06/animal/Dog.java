package net.madvirus.spring4.chap06.animal;

import java.util.Random;

public class Dog implements IAnimal {
	 
    @Override
    public String eat() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("치킨을 먹어요");
        if( new Random().nextBoolean()) // 랜덤으로 예외를 발생시킴
            throw new Exception("맛없어");
        
        return "강아지";
    }
}
 
