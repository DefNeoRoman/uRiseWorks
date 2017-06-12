package answersToInterview.commandPattern.classes;

public class Light {
    private boolean on;
    public void switchOn(){
        System.out.println("Свет включен");
        on = true;
    }
    public void switchOff(){
        System.out.println("Свет выключен");
        on = false;
    }
}
