package decorator;

import interfaces.Device;

public class PowerSavingDecorator extends Decorator{
  private Device device;
  public PowerSavingDecorator(Device device) {
    super(device);
    this.device = device;
  }
  @Override
  public void activatePowerSavingMode() {
    System.out.println("Activating power saving mode for device"+device.getClass().getName());
  }
}
