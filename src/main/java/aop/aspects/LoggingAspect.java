package aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
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
    @Pointcut("execution(* get*())")
    private void getAllGetMethods(){}


    @Before("getAllGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: Try to call get book");
    }

    @Before("getAllGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: Try to call get book");
    }


//    29 Lesson
    @Pointcut("execution(* aop.Library.return*())")
    private void allReturnMethodsFromLibrary() {
    }
    @Pointcut("execution(* aop.Library.get*())")
    private void allGetMethodsFromLibrary() {
    }


//    @Pointcut("allReturnMethodsFromLibrary() && !allGetMethodsFromLibrary()") // we exclude the second po
    @Pointcut("allReturnMethodsFromLibrary() || allGetMethodsFromLibrary()")
    private void getAllReturnAndGetMethods() {
    }

    @Before("getAllReturnAndGetMethods()")
    private void beforeReturnAndGetMethodsAdvice() {
        System.out.println("Combining in getAllReturnAndGetMethods: allReturnMethodsFromLibrary() || beforeGetSecurityAdvice()");
    }

}