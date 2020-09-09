package ac3.test1.ac31.usecase;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Service
public class TransactionTests {
  @Autowired
  public Transaction transaction;

  @Test
  public void makeTrueTests(){
    assertTrue(transaction.makeTrue());
  }
}
