package Task;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task_03 implements Runnable
{
  private String [] arr;

  public void GetDigitValue()
  {
      Scanner keyboard = new Scanner(System.in);
      arr= new String[3];
      for (int i=0; i<arr.length; i++)
      {
            System.out.print("Enter " + (i+1) + " digit: ");
          arr[i] = keyboard.next();
      }
  }
    /**
     * Build int value
     * @return Int Value
     */
    public int GenerateDigit()
    {
         String number = arr[0] + arr[1] + arr[2];
          int digit = Integer.parseInt(arr[0]+arr[1]+arr[2]);
        return digit;
    }

    @Override
    public void run() {
        try{
            GetDigitValue();
            System.out.println("Building integer digit: "+GenerateDigit());
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

