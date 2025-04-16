package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Library library = context.getBean("library", Library.class);
        library.getBook();
        library.returnBook();

        context.close();
    }
}
