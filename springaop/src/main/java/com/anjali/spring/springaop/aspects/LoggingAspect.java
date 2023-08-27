package com.anjali.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(* com.anjali.spring.springaop.ProductServiceImpl.multiply(..))")
	public void loggingBefore(JoinPoint joinPoint) {
		System.out.println("Before calling the methos");
	}
	@After("execution(* com.anjali.spring.springaop.ProductServiceImpl.multiply(..))")
	public void loggingAfter(JoinPoint joinPoint) {
		System.out.println("After calling the methos");
	}

}
