package Homework43;

public class Apartment extends House {
  // При создании многоквартирного дома дополнительно принимайте в конструкторе целое число -
  // количество подъездов.
  private int entrances;
  public Apartment(String direction, int entrances) {
    super(direction);
    this.entrances = entrances;
  }
}
