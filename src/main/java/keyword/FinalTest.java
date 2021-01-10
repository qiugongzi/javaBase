package keyword;

/**
 * @autor qiuchunhui
 * @Description 测试final类
 * @since 2021/1/9
 */
public final class FinalTest {
  int a;

  final char[] ch;

  public FinalTest(int a) {
    this.a = a;
    ch = new char[10];
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public char[] getCh() {
    return ch;
  }

  /**
   * 1: 测试final class的对象是否能被改变  ----yes
   * 2：测试final 修饰的数组是否能被改变   ----yes
   *
   * final修饰符只能让变量或引用不能改变
   *
   * @param args
   */
  public static void main(String[] args) {
    FinalTest finalTest = new FinalTest(1);
    finalTest.setA(2);
    finalTest = new FinalTest(2);
    finalTest.getCh()[0] = 'a';
    finalTest.getCh()[1] = 'b';
    finalTest.getCh()[2] = '你';
  }
}
