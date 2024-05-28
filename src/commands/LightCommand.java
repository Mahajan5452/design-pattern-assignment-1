package commands;

import interfaces.Command;
import model.Light;

public class LightCommand implements Command {
  private Light light = new Light();
  @Override
  public void executeOn() {
    light.turnOn();
  }
  @Override
  public void executeOff() {
    light.turnOff();
  }
}
