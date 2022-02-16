import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);

    double sideOne = 0;
    double sideTwo = 0;
    double area = 0;
    double perimeter = 0;
    double lengthOfDiagonal = 0;
    double a = 0;

    String trash = "";

    System.out.print("Please input opposites side one and two: ");

        if(in.hasNextDouble())
        {
            sideOne = in.nextDouble();
            in.nextLine();

            System.out.println("The first set of opposite sides is: " + sideOne);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Illegal number: " + trash);
            System.out.println("Exiting...run the program again!");
            System.exit(0);
        }

        System.out.print("Please input side three and four: ");

        if(in.hasNextDouble())
        {
            sideTwo = in.nextDouble();
            in.nextLine();

            System.out.println("The second set of opposite sides is: " + sideTwo);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Illegal number: " + trash);
            System.out.println("Exiting...run the program again!");
            System.exit(0);
        }



        perimeter = sideOne + sideOne + sideTwo + sideTwo;
        area = sideOne * sideTwo;
        a = (sideOne * sideOne)+(sideTwo*sideTwo);
        lengthOfDiagonal = (Math.sqrt(a));

        System.out.println("The area of your rectangle is: " + area + " and the perimeter is " + perimeter + "\nThe length of the diagonal using Pythagorean Theorem is " + lengthOfDiagonal);


    }
}
