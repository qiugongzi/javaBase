package concurrent;

import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorTest {

  @Test
  public void testExecutor(){
    ExecutorService executor = Executors.newFixedThreadPool(1);
    executor.execute(()->{
      System.out.println("hello");
    });
  }
}
