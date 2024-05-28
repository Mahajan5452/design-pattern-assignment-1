import commands.LightCommand;
import decorator.PowerSavingDecorator;
import decorator.VacationDecorator;
import model.HomeRemote;
import model.Light;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    //any device can be passed to remote to turn off and turn on
    LightCommand lightCommand = new LightCommand();
    HomeRemote remote = new HomeRemote();

    remote.setCommand(lightCommand);
    remote.pressOn();
    remote.pressOff();

    //Added addition method for Light Device
    Light light = new Light();
    PowerSavingDecorator powerSavingLight = new PowerSavingDecorator(light);
    powerSavingLight.activatePowerSavingMode();
    powerSavingLight.turnOn();
// Light with vacation mode
    VacationDecorator vacationLight = new VacationDecorator(light);
    vacationLight.activateVacationMode();
    vacationLight.turnOn();

  }
}