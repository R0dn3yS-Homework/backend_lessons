public class DogOwner {
  private String name;
  private String gender;
  private Dog dog;

  public DogOwner(String name, String gender) {
    this.name = name;
    this.gender = gender;
  }

  public void setDog(Dog dog) {
    this.dog = dog;
  }

  public void setDogName(String name) {
    this.dog.name = name;
  }

  public void incDogAge() {
    this.dog.age = this.dog.age++;
  }

  public String toString() {
    return this.name + " heeft een " + this.dog.getSex() + ", deze is " + this.dog.age + " jaar oud en van het soort: " + this.dog.getSpecies() + ". De hond heet: " + this.dog.name;
  }
}
