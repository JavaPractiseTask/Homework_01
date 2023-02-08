import Task.*;

public class Main {
    public static void main(String[] args)
    {
        /*
        Task_01 task = new Task_01();
        task.Show();
        task = null;
        */
         Task_02 task = new Task_02(0);
         System.out.printf(task.GetPercent());
    }
}