package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class ExcerptionHandlingAspect {
    @Before("aop.aspects.LoggingAspect.beforeReturnAndGetMethodsAdvice()")
    private void beforeAllGetMethodsErrorHandling() {
        System.out.println("@order 1: Before ExcerptionHandlingAspect beforeAllGetMethodsErrorHandling");
    }
}
