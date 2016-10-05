package climate;

public final class Climate {
  public static float temperature;
  public static float humidity;
  
  public void update() {
    this.temperature = Instruments.thermometers.check();
    this.humidity = Instruments.hygrometers.check();
  }
}
