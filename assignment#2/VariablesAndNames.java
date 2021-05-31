//1. I used 4.0 for space_in_a_car, but is that necessary? What happens if it's just 4?
//A: It is not necessary, because 4 is a fixed number, which is a number that will not be a decimal since it's how many seats. If it's jsut 4, than it is just an interger instead of a floating point. The result we get will nto contain .0. it will jsut be a whole number, or a interger. 

//2. Remember that 4.0 is a "floating point" number. Find out what that means.
//A: A floating point is a type of number that contains decimal points.

//3. Write comments above each of the variable assignments.

//Make sure you know what = is called (equals) and that it's making names for things.
//A: a variable can be equal to the calculation involving two other variables

//Remember _ is an underscore character.

public class VariablesAndNames
{
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        //the number of cars
        cars = 100;
        //the amount of space in the car, how many people can sit in the car
        space_in_a_car = 4.0;
        //how many drivers there
        drivers = 30;
        //how many passengers are there
        passengers = 90;
        //the amount of cars that are left after deleting the number of drivers
        cars_not_driven = cars - drivers;
        //the amount of cars driven equals to how many drivers there are. 
        cars_driven = drivers;
        //the total amount of people that will be in car
        carpool_capacity = cars_driven * space_in_a_car;
        //the amount of people that will be in each car
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}