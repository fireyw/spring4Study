package net.madvirus.spring4.chap06.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggerAspect {
	private static final Logger logger=LoggerFactory.getLogger(LoggerAspect.class);

	@Before("execution(public * net.madvirus.spring4.chap06.member..*(..))")
	public void StartLog(JoinPoint joinPoint) throws Throwable{		
		System.out.println("---start----");
		System.out.println(Arrays.toString(joinPoint.getArgs()));
		System.out.println("---end----");		
	}
}
