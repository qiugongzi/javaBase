package lang.string.abstra;

import org.junit.Test;

/**
 * @autor qiuchunhui
 * @Description
 * @since 2021/1/10
 */
public class AbstractStringBuilderTest {
  @Test
  public void setLengthTest() {
    StringBuilder sb = new StringBuilder();
    sb.append("hello");
    System.out.println(sb.toString()); // hello
    System.out.println("size:" + sb.length()); // 5
    System.out.println("capacity" + sb.capacity()); // 16
    sb.setLength(2);
    System.out.println(sb.toString()); // he
    System.out.println("size:" + sb.length()); // 2
    System.out.println("capacity" + sb.capacity()); // 16
    sb.setLength(20);
    System.out.println(sb.toString()); // he\0\0\0\00\0\0\00\0\0\00\0\0\0\0\0
    System.out.println("size:" + sb.length()); // 20
    System.out.println("capacity" + sb.capacity()); // 34
    sb.setLength(77);
    System.out.println("size:" + sb.length()); // 77
    System.out.println("capacity" + sb.capacity()); // 77
  }

  @Test
  public void capacityTest() {
    StringBuilder builder = new StringBuilder("hello");
    System.out.println("size:" + builder.length()); // 5
    System.out.println("capacity" + builder.capacity()); // 16
    builder.append("world");
    System.out.println("size:" + builder.length()); // 5
    System.out.println("capacity" + builder.capacity()); // 16
    builder.append("wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
    System.out.println("size:" + builder.length()); // 5
    System.out.println("capacity" + builder.capacity()); // 16
  }
}
