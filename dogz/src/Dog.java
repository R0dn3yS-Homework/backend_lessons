public class Dog {
  public String name;
  private String species;
  public int age;
  private String sex;

  public Dog(String name, String species, int age, String sex) {
    this.name = name;
    this.species = species;
    this.age = age;
    this.sex = sex;
  }

  public String getSpecies() {
    return this.species;
  }

  public String getSex() {
    return this.sex;
  }
}
