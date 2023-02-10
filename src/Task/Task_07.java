package Task;

import java.util.Scanner;

public class Task_07 implements Runnable{
    private int range_0 = 0;
    private int range_1 = 0;

    /**
     *  Set up digit range to properties
     */
    public void GetValue()
    {
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Entry digit range #1: ");
            range_0 = sc.nextInt();
            System.out.print("Entry digit range #2: ");
            range_1 = sc.nextInt();
        }while(range_0 !=0 && range_1 !=0);

    }

    /**
     * Calculate function
     */
    public void Calculate(int range , int range_2) {
        if (range > 0 && range_2 > 0) {
            for (int i = range; i < range_2; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Must be more than 0 ");
        }
    }

    @Override
    public void run()
    {
        GetValue();
    }
}
