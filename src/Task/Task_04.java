package Task;
import java.util.Scanner;

public class Task_04 implements Runnable
{
    public int number;
    /**
     * Get digit
     */
    public void GetDigit()
    {
        do {
            var keyboard = new Scanner(System.in);
            System.out.print("Entry 6-digit value: ");
            number = keyboard.nextInt();
            System.out.println(Math.ceil(Math.log10(number)) == 6 ? "Status: OK\n" + SplitInteger() : "Retry again!");
        }while(Math.ceil(Math.log10(number)) !=6);
    }

    /**
     * Combine number digit
     * @return
     */
    public String SplitInteger()
    {
        int six ,five,first, two , one;
            six = number % 10;
            five = (number % 100) / 10;
            first = (number % 1000000) / 100000;
            two = (number % 100000) / 10000;
            one = (number % 10000) / 100;
       return ("Current number : " + number + "\n" + "Split number: " + six + five + one + two + first);
     }

    @Override
    public void run()
    {
        try{
            GetDigit();
            SplitInteger();
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
