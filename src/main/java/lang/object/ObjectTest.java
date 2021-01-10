package lang.object;

import org.junit.Test;

/**
 * @autor qiuchunhui
 * @Description
 * @since 2021/1/6
 */
public class ObjectTest implements Cloneable{

  @Test
  public void getClassTest() {
    Object o = new ObjectTest();
    System.out.println(o.getClass());
    Class clazz = o.getClass();
    System.out.println(o.getClass().getName());

  }

  @Test
  public void cloneTest() throws CloneNotSupportedException {
    ObjectTest obj = new ObjectTest();
    ObjectTest ob2 = (ObjectTest) obj.clone();
    System.out.println(obj == ob2);
  }


}
