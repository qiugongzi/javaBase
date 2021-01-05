package keyword;

import org.junit.Test;


public class StaticFinal {

  private static int staticVal;

  private static Object staticObj;

  private final int finalVal = 1;

  private final Object finalObj = new Object();

  private static final int staticFinalVal = 1;

  private final int finalField;

  private static final int staticFinalField = 1;

  public StaticFinal() {
    finalField = 1;
  }

  @Test
  public void testFinal() {
    final int a = 1;
    System.out.println(a);
  }
}
