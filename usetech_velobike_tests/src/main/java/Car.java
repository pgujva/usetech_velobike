public class Car {

  String color;
  int wheel;
  int light;

  public void numberOfWheels(String a, int b) {
    System.out.println("Машина с цветом " + a + " кол-во колес=" + b);
  }

  public Car(String color, int wheel) {
    this.color = color;
    this.wheel = wheel;
  }

  public Car(String color, int wheel, int light) {
    this.color = color;
    this.wheel = wheel;
    this.light = light;
  }
}
