package aop;

import org.springframework.stereotype.Component;

@Component
public class Library {
    public void getBook() {
        System.out.println("Get book");
    }

    public void returnBook() {
        System.out.println("Return book");
    }
}
