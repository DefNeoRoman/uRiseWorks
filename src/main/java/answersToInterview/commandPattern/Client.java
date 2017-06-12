package answersToInterview.commandPattern;

import answersToInterview.commandPattern.classes.*;

public class Client {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        control.setCommand(lightsOn);
        control.pressButton();

        control.setCommand(lightOff);
        control.pressButton();
    }
}
