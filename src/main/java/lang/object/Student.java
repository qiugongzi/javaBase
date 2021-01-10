package lang.object;

import java.util.*;

/**
 * @autor qiuchunhui
 * @Description
 * @since 2021/1/8
 */
public class Student implements Cloneable {
  private String name;

  private List<String> age;

  public Student(){

  }

  public Student(String name, List age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int hashCode() {
    return Integer.parseInt(name);
  }

  @Override
  public boolean equals(Object obj) {
    Student student = (Student) obj;
    return name==student.getName();
  }

  @Override
  public Student clone(){
     Student s = new Student();
     s.name = this.name;
     s.age = new ArrayList<>();
     for(String s1 : this.age){
       s.age.add(s1);
     }
    return s;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getAge() {
    return age;
  }

  public void setAge(List<String> age) {
    this.age = age;
  }

  public static void main(String[] args) throws CloneNotSupportedException {
    List list = new ArrayList() {{
      add("1");
      add("2");
    }};
    Student s = new Student("a", list);
    Student a = (Student) s.clone();
    list.add("3");
    System.out.println(1);

    HashSet set = new HashSet();
    set.add(new Student("1",null));
    set.add(new Student("1",null));
    System.out.println(1);
  }
}
