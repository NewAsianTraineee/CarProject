import org.w3c.dom.ls.LSOutput;

public class CarClass {
    String color;
    String model;
    int year;

    CarClass(String color, String model, int year) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    static class Engine {
        boolean isRunning = false;

        void Drive()
        {
            if (!isRunning)
            {
                System.out.println("You have to start the engine first! ");
            }
            else
            {
                System.out.println("You have begun your journey!");
            }
        }
        void startEngine() {
            if (!isRunning){
                isRunning = true;
                System.out.println("Starting the engine!.... WROOM WROOM");
            }
            else  {
                System.out.println("Engine is already running...");
            }
        }

        void stopEngine() {
            if (isRunning) {
                System.out.println("Break!!! Engine is turning off...");
                isRunning = false;
            } else {
                System.out.println("The engine is already off.");
            }
        }
        void status()
        {
            if (!isRunning) {
                System.out.println("Engine is off!");
            } else {
                System.out.println("Engine is running!");
            }
        }
    }
}
