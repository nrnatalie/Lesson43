package Homework43;

public class Private extends  House {

  public Private(String direction) {
    super(direction);
  }

  @Override
  public String toString() {
    return "Частный дом" + getDirection();
  }
}
