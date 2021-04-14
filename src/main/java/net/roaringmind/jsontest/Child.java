package net.roaringmind.jsontest;

public class Child {
  int age;
  String name;

  public Child(int age, String name) {
    this.name = name;
    this.age = age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }
}
