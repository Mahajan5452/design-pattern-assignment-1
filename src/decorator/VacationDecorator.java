package decorator;

import interfaces.Device;

public class VacationDecorator extends Decorator {
  private Device device;

  public VacationDecorator(Device device) {
    super(device);
    this.device = device;
  }

  @Override
  public void activateVacationMode() {
    System.out.println(" Activating vacation mode for device " + device.getClass().getName());
  }
}
