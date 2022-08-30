package AOP.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("execution(public void getBook(..))")
    private void setSmth() {}

    @Before("setSmth()")
    public void beforeGetBookAdvice() {

        System.out.println("beforeGetBookAdvice pitatetsya poluchit knigu");

    }

    @Around("setSmth()")
    public String aroundGetBookAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("1");

        Object tMR = proceedingJoinPoint.proceed();

        System.out.println("2");
        return (String) tMR;
    }


}
