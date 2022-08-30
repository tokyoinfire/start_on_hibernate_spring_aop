package AOP;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {


    public void getBook() {
        System.out.println("knigu vzyali iz UniLibrary ");
    }
}
