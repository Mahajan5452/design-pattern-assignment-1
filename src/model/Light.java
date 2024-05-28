package model;

import interfaces.Device;

public class Light implements Device {
  @Override
  public void turnOn() {
    System.out.println("Light is turned On");
  }

  @Override
  public void turnOff() {
    System.out.println("Light is turned OFF");
  }
}
