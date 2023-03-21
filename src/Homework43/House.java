package Homework43;

public abstract class House {
  //Задача 1
  //Создайте абстрактный класс "Дом". В качестве аргумента конструктора принимайте адрес.

  //Напишите для адреса сеттер и геттер.

 // Создайте классы "Частный дом" и "Многоквартирный дом" - наследники класса "Дом".

 // При создании многоквартирного дома дополнительно принимайте в конструкторе целое число -
  // количество подъездов.

 // В методе toString() выводите в удобном виде всю известную информацию о доме.

  //В основном файле программы создайте список домов, в который поместите два частных дома и один
  // многоквартирный.

 // Выведите информацию о домах в списке с использованием цикла for-each.

 private String direction; //срока
  public House(String direction){ // конструктор
    this.direction = direction;
  }
  public void setDirection(String direction){
    this.direction = direction;
  }
  public String getDirection(){
    return  direction;
  }

  @Override
  public String toString() {
    return "Дом" + direction;
  }
}
