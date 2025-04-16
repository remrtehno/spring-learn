package aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
class LoggingAspect {
    // 26 lesson

//    @Before("execution(public void getBook())")
//    @Before("execution(* *(aop.Book))") // when we need to put a specific parameter
//    @Before("execution(* *(..))")
//    @Before("execution(* *(aop.Book, ..))")
    @Before("execution(* get*())")
    public void beforeGetBookAdvice() {
        System.out.println("Try to call get book");
    }


    // 27 lesson
    @Pointcut("execution(* *())")
    private void getAllGetMethods(){}


    @Before("getAllGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: Try to call get book");
    }

    @Before("getAllGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: Try to call get book");
    }


}