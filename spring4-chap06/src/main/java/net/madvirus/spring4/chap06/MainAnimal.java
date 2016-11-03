package net.madvirus.spring4.chap06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import net.madvirus.spring4.chap06.animal.Dog;
import net.madvirus.spring4.chap06.animal.IAnimal;

public class MainAnimal {
    public static void main(String[] args) {
    	GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:aopAnimal2.xml");
        
        IAnimal animal = context.getBean("dog", Dog.class);
        try {
            animal.eat();
        } catch (Exception e) {
            // TODO Auto-generated catch block
//            e.printStackTrace();
        }
    }
}