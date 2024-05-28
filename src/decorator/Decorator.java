package decorator;

import interfaces.Device;

public class Decorator implements Device {
  private Device device;

  public Decorator(Device device) {
    this.device = device;
  }

  @Override
  public void turnOn() {
    device.turnOn();
  }

  @Override
  public void turnOff() {
    device.turnOff();
  }

  public void activateVacationMode(){};

  public void activatePowerSavingMode(){};

}
