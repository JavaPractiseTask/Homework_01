package Task;

import java.util.Scanner;

public class Task_05 implements Runnable
{
    /**
     * Current function receive number of month
     * @return
     */
   public int EntryDigitNumber()
   {
       while(true) {
           int number;
             System.out.print("Entry month number \n Entry 0 for exit: ");
             Scanner sc = new Scanner(System.in);
             number = sc.nextInt();
           return number;
       }
   }

    /**
     * Function detected month-number
     * @param number
     */
    public void GetDigitMonths(int number )
    {
        switch (number) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                case 2:
                    System.out.printf("It's a winter" +"\n");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.printf("It's a Spring" + "\n");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.printf("It's a Summer" + "\n");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.printf("It's an Autumn" + "\n");
                    break;
                case 12:
                    System.out.printf("It's a Winter" + "\n");
                    break;
                default:
                    System.out.printf("Incorrect month" + "\n");
                    break;
            }
    }

    @Override
    public void run() {
       while(true)
       {
          GetDigitMonths(EntryDigitNumber());
       }
    }
}
