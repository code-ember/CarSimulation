# Car Simulation
Creating and using classes to instantiate (create) objects in Java. A class provides a template that can be used to build real-world objects. You can use this template as often as you want to build multiple objects of the same kind. By building a simple program simulating a car using concepts covered in previous lessons, like Strings, loops, and conditions.

## Define the Car class
Create a class named Car to represent the properties of a car.
### - Create a class named Car
Used IntelliJ to create the project and the Car class.
### - Add properties to the Car class
The Car class will store information such as the make, model, year, and color of the car.
### - Add a simple method to the Car class
Create a method that returns the car details with each detail contained on a new line.

## Creating a single car
Create a Car object inside your main program to represent a single car. Then provide values to all the properties of your car object, and display the car details.
### - Create the Main class and main method
Create new Java Class, Main class, Main method signature.
### - Create a Car object
The main method, declare a Car reference variable, named myFirstCar, and initialize it with an object using the new keyword. 
### - Provide values to all the Car properties
Assign values to the variables of the Car object using the dot operator.
### - Display the car details
Call the getCarDetails method with myFirstCar using the dot operator.

## Create a collection of Cars
In your main program, create an array of Car objects to represent your car collection. You will then loop through this array, create individual car objects, and ask the user to input the values for their properties.
### - Create an array of Car Objects
The main method, declare an array of car objects, and name it cars. You can fix the size of the array.
### - Create an object of Scanner class
Remember, if you want to get user input you’re going to need a Scanner, and if you need a Scanner, you will have to import it from the java.util package! 
### - Create individual Car objects, and prompt the user for values
Write a for loop inside the main method to loop through the cars array. Inside the for loop, create a new car object using the index position of the loop.
### - Call the getCarDetails method to display the cars collection
In your main method, after creating the Car objects with values input by the user, you can call the getCarDetails method to print the details of all car objects. Remember that the getCarDetails method returns a String value. 

Creating a simple program to simulate a single car, as well as a collection of cars. You focused on defining a Car class to represent a car’s properties and created objects to represent individual cars. You also modified the car’s data and implemented a basic method to display the car object’s information.
#### Software Used: IntelliJ
