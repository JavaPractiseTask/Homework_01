package Task;

import java.util.Scanner;

public class Task_06 implements Runnable
{
    public double meters;
    public final double miles = 1609.00;
    public final double yard = 1094.00;

    /**
     * Get value for convert to yards or miles
     */
    public int GetValue()
    {
        Scanner sc = new Scanner(System.in);
            System.out.println("Entry value for: ");
            meters = sc.nextInt();
        return (int)meters;
    }
    /**
     * @return miles as string
     */
    public String GetMiles()
    {
        return ("Get miles: " + String.format("%.3f" ,(meters / 1609.00)));
    }

    /**
     * @return yards as string
     */
    public String GetYards()
    {
        return ("Get yard: " + String.format("%.3f", (meters * 1.094)));
    }

    @Override
    public void run() {
        try{
            do{
                GetValue();
                System.out.println(GetMiles()+ "\n"+ GetYards());
            }while(meters != 0);
        }catch(Exception ex)
        {
            System.out.println(ex.getMessage()); // For divide by zero exception in current task
        }
    }
}
