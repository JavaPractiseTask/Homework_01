import RunTask.TaskRun;

public class Main {
    public static void main(String[] args)
    {
        TaskRun task = new TaskRun();
        task.run();

        /*
          TaskRun task = new TaskRun();
           task.SetCollectionValue();
           -- Bug fix. Not generated odd arr
           task.list.get(9).run();
           -- Bug fix. Broken statement
           task.list.get(6).run();
         */

    }
}