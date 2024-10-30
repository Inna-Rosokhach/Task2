import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        while (true){
            System.out.println("What is the fuel consumption of a car in liters per 100 kilometers?");
            var consumption = scanner.nextDouble();

            if (consumption == 0)
                break;

            System.out.println("How far in kilometers did the car travel?");
            var distance = scanner.nextDouble();

            var result = consumption * distance;
            System.out.println("Uou used "+ result +" liters of fuel" );

        }
    }
}
