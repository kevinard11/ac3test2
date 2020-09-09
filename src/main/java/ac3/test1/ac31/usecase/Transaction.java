package ac3.test1.ac31.usecase;

import org.springframework.stereotype.Service;

@Service
public class Transaction {

    public boolean makeTrue(){
        System.out.println("Travis CI/CD test");
        return true;
    }
}
