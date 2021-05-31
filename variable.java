import java.util.Scanner;
//grabbing out input and output to console, import of text into terminal

public class variable
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        //create a scanner called keyboard to collect stuff
        //system.in -- input
        int age = 2; //whole number
        //can't add float our double to whole number, didnt have that percision
        float temp = 30.2f; //not whole numebr decimals, use less memory than double
        //should use f to define it's a float
        double height = 170.832 + 21.2f; //VERY precise decimals, the range is significantly larger
        //can add f to double, but not adding double to float
        String name = "Weiwei"; //words
        //must capitalize
        char gender  = 'F'; //characters
        boolean isAlive = true; //truefalse

        name = "Victor" + "Kang";
        height = height / 2;
        float x = (float) (12.22);

        System.out.println(name + " is " + age + " years old and " + height + " meters tall.");
        System.out.println("Gender: " + gender);
        System.out.println("Gender: " + gender);

        System.out.print("How old are u?");
        age = keyboard.nextInt(); //take the next interger value
        //skip all the strings and find the number

        System.out.print("What is ur name?");
        name = keyboard.next(); //to a string

        System.out.print("What is ur height?");
        height = keyboard.nextDouble();
        //skip all the strings and find the double

        System.out.print(name + " is " + age + " years old and " + height + " meters tall.");
        System.out.println("Gender: " + gender);
        System.out.println("Body Temp: " + temp);
    }
}