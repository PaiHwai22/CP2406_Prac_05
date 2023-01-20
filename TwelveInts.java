// This class stores 12 ints in an array and displays them first to last and last to first.
public class TwelveInts
{
    public static void main (String args[])
    {
        int[] numbers = {10, 12, 43, 234, 6, 45, 23, 64, 78, 54, 22, 13};
        int x;
        for (x = 0; x < numbers.length; x++)
            System.out.print(numbers[x] + "  ");
        System.out.println();
        for (x = numbers.length - 1; x >= 0; x--)
            System.out.print("" + numbers[x] + "  ");
        System.out.println();
    }
}

