import Task.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        /*
        Task_01 task = new Task_01();
                task.Show();

         Task_02 task = new Task_02(0);
         System.out.printf(task.GetPercent());

         Task_03 task = new Task_03(3);

         System.out.printf("Generate integer from string : " + task.GenerateInt());
         Task_04 task = new Task_04();

         */
        System.out.printf("Press 0 for exit");
         do {
            var keyboard= new Scanner(System.in);
            System.out.print("Entry month number: ");
            Task_05 task = new Task_05(keyboard.nextInt());
        }while( true);
    }
}