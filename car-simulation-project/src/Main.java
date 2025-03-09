import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car myFirstCar = new Car();
        myFirstCar.make = "Toyota";
        myFirstCar.model = "Corolla";
        myFirstCar.color = "Black";
        myFirstCar.year = 2019;

        // display the car details for myFirstCar
        System.out.println(myFirstCar.getCarDetails());

        // array of Car objects
        Car[] cars = new Car[5];

        // object of Scanner class
        Scanner scanner = new Scanner(System.in);

        // loop through the array of cars
        for (int index = 0; index < 5; index++) {
            cars[index] = new Car(); // create a new car object at current index

            // prompt the user for details
            System.out.println("Enter details for car " + (index + 1));

            // get user input and assign to 'make' of the car object at current index
            System.out.print("Make: ");
            cars[index].make = scanner.nextLine();

            // Get user input and assign to 'model' of the car object at the current index
            System.out.print("Model: ");
            cars[index].model = scanner.nextLine();

            // Get user input and assign to 'color' of the car object at the current index
            System.out.print("Color: ");
            cars[index].color = scanner.nextLine();

            // Get user input and assign to 'year' of the car object at the current index
            System.out.print("Year: ");
            cars[index].year = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        }

        // Call getCarDetails for each car object in the collection
        System.out.println("Your Car Collection:");

        for (int index = 0; index < 5; index++) {
            String carDetails = cars[index].getCarDetails();
            System.out.println(carDetails);
        }
    }
}
