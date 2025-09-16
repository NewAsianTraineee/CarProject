import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarClass myCar = new CarClass("Red", "Subaru", 2014);

        System.out.println("Hello Welcome to the CarPractice!");
        System.out.println("---------------------------------");
        System.out.println("--You are now entering Car garage--");
        System.out.println("----------------------------------");
        System.out.println("-What Color do you want it to be?-");
        myCar.color = sc.nextLine();
        System.out.println("-What model do you want it to be?-");
        myCar.model = sc.nextLine();
        System.out.println("-What year do you want it to be?-");
        myCar.year = sc.nextInt();

        System.out.println("Your car is made!");
        System.out.println("\nColor: " + myCar.color + "\nModel: " + myCar.model + "\nYear: " + myCar.year);
        // Leta fram på hur man gjorde en ny rad källa: https://www.baeldung.com/java-string-newline

        boolean menuOn = true;
        CarClass.Engine myEngine = new CarClass.Engine();

        while (menuOn) {
            System.out.println("---You are now in the car menu---");
            System.out.println("-- 1. Drive --");
            System.out.println("-- 2. Break --");
            System.out.println("-- 3. Start --");
            System.out.println("-- 4. Status --");
            System.out.println("-- 5. Quit --");
            int val = sc.nextInt();

            switch (val) {
                case 1:
                    myEngine.Drive();
                    break;
                case 2:
                    myEngine.stopEngine();
                    break;
                case 3:
                    myEngine.startEngine();
                    break;
                case 4:
                    myEngine.status();
                    break;
                case 5:
                    System.out.println("Closing the program...!");
                    menuOn = false;
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }

    }
}