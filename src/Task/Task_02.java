package Task;

import java.util.Scanner;

public class Task_02 implements Runnable {
    private int number;
    private int percent;

    /**
     *
     *  Get digit anywhere
     */
    public void GetDigit()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entry digit value: ");
        number = sc.nextInt() ;
        System.out.print("Entry percent: ");
        percent = sc.nextInt();
    }

    /**
     *
     * Get percent as string
     */
    public String Calculate()
    {
        return ("\nNumber:" + number  + "\n" +
                "Percent:"  + percent + "\n" +
                "Value:"    + (number / percent));
    }

    @Override
    public void run() {
        GetDigit();
        System.out.println("Get percent:" + Calculate());
    }
}
