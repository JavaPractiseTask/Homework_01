package Task;
import java.util.Scanner;

public class Task_03
{
  public String [] arr;
  public Task_03(int value)
  {
      var keyboard = new Scanner(System.in);
      if(value>0)
      {
          arr= new String[value];
          do {
              for (int i=0; i<arr.length; i++)
              {
                  System.out.print("Enter " + (i+1) + " digit: ");
                  arr[i] = keyboard.next();
              }
          }while(arr.length != 3);
      }else{
           System.out.printf("Must be more than 0");
          System.exit(-1);
      }
  }

    public int GenerateInt()
    {
         String number = arr[0] + arr[1] + arr[2];
        return (Integer.parseInt(number));
    }
}

