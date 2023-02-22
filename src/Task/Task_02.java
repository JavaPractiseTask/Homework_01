package Task;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
public class Task_02 implements Runnable {
    private int number;
    private int percent;
    private int result;

    /**
     *  Get digit anywhere
     * @return result or zero digit code for cancellation job
     */
    public int GetDigit()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entry 0 a two times for exit'\n'Entry digit value: ");
          number = sc.nextInt() ;
        System.out.print("Entry percent: ");
          percent = sc.nextInt();
        return number;
    }

    /**
     * Get percent as string
     */
    public String Calculate()
    {
        try
        {
              result = (number / percent);
        }catch(ArithmeticException ex)
        {
            System.out.println(ex.getMessage() + "\nRetry again ...");
        }
        return ("\nNumber:" + number  + "\n" +
                "Percent:"  + percent + "\n" +
                "Value:"    + result);
    }

    @Override
    public void run() {
        try{
            do {
                GetDigit();
                System.out.println("Get percent:" + Calculate());
            }while(GetDigit() !=0);
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
