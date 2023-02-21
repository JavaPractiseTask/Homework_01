package Task;

import java.util.Scanner;

public class Task_08 implements Runnable {

    private int range_0;
    private int range_1;
    /**
     * Installing range
     */
    public void GetValue()
    {
        Scanner sc = new Scanner(System.in);
            System.out.print("Entry 0 a two time for exit \n Set value for top range: ");
            range_0 = sc.nextInt();
            System.out.print("Set value for down range: ");
            range_1 = sc.nextInt();
    }

    /**
     * Show multi-table
     */
    public void Calculate()
    {
       for (int i = range_0; i<range_1; i++)
       {
           for (int j=1 ; j<range_1; j++)
           {
               if(j / 2 == 2) // Условие для генерации пар колонок в консоли (Актуально для данного ТЗ)
               {
                   System.out.print(j + "x"+ i +"="+(j*i) + '\t');
                   System.out.printf("\n");
               }else{
                   System.out.print(j + "x"+ i +"="+(j*i) + '\t');
               }
           }
       }
    }

    /**
     * Run methods
     */
    @Override
    public void run()
    {
        do{
            GetValue();
            Calculate();
        }while(range_0 > 0 );
    }
}
