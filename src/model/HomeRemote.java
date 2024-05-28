package model;

import interfaces.Command;

public class HomeRemote {
  private Command currentCommand;

  public void setCommand(Command command) {
    this.currentCommand = command;
  }

  public void pressOn() {
    if (currentCommand != null) {
      currentCommand.executeOn();
    }
  }
  public void pressOff() {
    if (currentCommand != null) {
      currentCommand.executeOff();
    }
  }
}
