import Task.*;

public class Main {
    public static void main(String[] args)
    {
        /*
        Task_01 task = new Task_01();
                task.Show();

         Task_02 task = new Task_02(0);
         System.out.printf(task.GetPercent());
      */
        Task_03 task = new Task_03(3);
        System.out.printf("Generate integer from string : " + task.GenerateInt());
    }
}