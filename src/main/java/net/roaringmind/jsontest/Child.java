package net.roaringmind.jsontest;

public class Child {
  int age;
  String name;

  public Child(int age, String name) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Name: " + name + "\nAge: " + age;
  }
}
