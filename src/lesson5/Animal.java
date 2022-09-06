package lesson5;

public class Animal {
  String name;
  int age;

  public Animal() {
    name = "";
  }

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void print() {
    System.out.println("Животное " + name + " возрастом " + age);
  }

  void birthday() {
    age++;
  }
}
