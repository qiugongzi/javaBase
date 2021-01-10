package lang.string.string;

/**
 * @autor qiuchunhui
 * @Description
 * @since 2021/1/9
 */
public class StringTest {
/*  public static void main(String[] args) {
    String s1 = new StringBuilder("go").append("od").toString();
    System.out.println(s1.intern() == s1);
    String s2 = new StringBuilder("ja").append("va").toString();
    System.out.println(s2.intern() == s2);
  }*/

  public static void main(String[] args) {
    String s1 = "go" + "od";
    System.out.println(s1.intern() == s1);
    String s2 = "ja" + "va";
    System.out.println(s2.intern() == s2);
  }

}
