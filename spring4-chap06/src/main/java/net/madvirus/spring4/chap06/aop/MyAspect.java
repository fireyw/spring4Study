package net.madvirus.spring4.chap06.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
 
public class MyAspect {
    public void before(JoinPoint jp){
        System.out.println("밥을 먹어요");
    }
    public void after_throwing(JoinPoint jp, Throwable th){
        System.out.println(th.getMessage()+ " : 맛없어요");
    }
    public void after_returning(JoinPoint jp, String msg){
        System.out.println(msg + " : 맛있어");
    }
    public void after(JoinPoint jp){
        System.out.println("배불러요");
    }
    
//    public void around(ProceedingJoinPoint jp){
//        before(jp);
//            try {
//                String msg = (String)jp.proceed();
//                after_returning(jp, msg);
//            } catch (Throwable e) {
//                // TODO Auto-generated catch block
////                e.printStackTrace();
//                after_throwing(jp, e);
//            }
//            after(jp);
//    }
}