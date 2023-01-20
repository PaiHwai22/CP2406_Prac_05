// This program allows user to enter any double numbers up to 20 until they quit.
// Displays the distance fom the avg for each number when quit.
// Displays an error if user does not enter any number and quits.
import java.util.*;
public class DistanceFromAverage
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[20];
        double entry;
        double total = 0;
        double average;
        final int QUIT = 99999;
        int i = 0, y;
        System.out.print("Enter a numeric value or " +
                QUIT + " to quit >> ");
        entry = sc.nextDouble();
        while(entry != QUIT && i < numbers.length)
        {
            numbers[i] = entry;
            total += numbers[i];
            ++i;
            if(i < numbers.length)
            {
                System.out.print("Enter next numeric value or " +
                        QUIT + " to quit >> ");
                entry = sc.nextDouble();
            }
        }
        if(i == 0)
            System.out.println("Average cannot be computed because no numbers were entered");
        else
        {
            average = total / i;
            System.out.println("You entered " + i +
                    " numbers and their average is " + average);
            for(y = 0; y < i; ++y)
                System.out.println(numbers[y] + " is " +
                        (numbers[y] - average) + " away from the average");
        }
    }
}

