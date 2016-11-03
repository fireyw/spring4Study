package net.madvirus.spring4.chap06.aop;

import java.util.HashMap;
import java.util.Map;

import net.madvirus.spring4.chap06.board.Article;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect

public class ArticleCacheKYW {
	private Map<Integer, Article> cache = new HashMap<Integer, Article>();

	@Around("execution(public * *..ReadArticleService.*(..))")
	public Article cache(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("[ACA] 시작");
		try {
			Integer id = (Integer) joinPoint.getArgs()[0];
			Article article = cache.get(id);
			System.out.println("id : "+ id);
			
			if (article != null) {
				System.out.println("[ACA] 캐시에서 Article[" + id + "] 구함");
				return article;
			}
			Article ret = (Article) joinPoint.proceed();
			System.out.println("ret : "+ ret);
			if (ret != null) {
				cache.put(id, ret);
				System.out.println("[ACA] 캐시에 Article[" + id + "] 추가함");
			}
			return ret;
		} finally {
			System.out.println("[ACA] 끝");
		}
	}

}
