package Homework43;

public class Apartment extends House {
  // При создании многоквартирного дома дополнительно принимайте в конструкторе целое число -
  // количество подъездов.
  private final int entrances; // добавляем final, кол-во подьездов не меняемо
  public Apartment(String direction, int entrances) {
    super(direction);
    this.entrances = entrances; // новый Атрибут
  }
  public int getEntrances(){
    return entrances;
  }

  @Override
  public String toString() {
    return " Многоквартирный дом" + getDirection();
  }
}
