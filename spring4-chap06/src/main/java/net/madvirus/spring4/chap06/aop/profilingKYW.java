package net.madvirus.spring4.chap06.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


public class profilingKYW {
	
	@Pointcut("execution(public * net.madvirus.spring4.chap06..*(..))")
	public void pointCut(){
		
	}
	
	@Around("pointCut()")
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		String signatureString = joinPoint.getSignature().toShortString();
		System.out.println(signatureString + " 시작_profiler");
		long start = System.currentTimeMillis();
		try {
			Object result = joinPoint.proceed();
			return result;
		} finally {
			long finish = System.currentTimeMillis();
			System.out.println(signatureString + " 종료_profiler");
			System.out.println(signatureString + " 실행 시간 : " +
					(finish - start) + "ms");
		}
	}		
}

