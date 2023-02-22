package RunTask;

import Task.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
@NoArgsConstructor

public class TaskRun implements Runnable {
    private List<Runnable> list = null;
    private int counter = 0;

    /**
     * Create object into collection
     */
    public void SetCollectionValue() {
        list = (List<Runnable>) new ArrayList<Runnable>() {{
             add(new Task_01());
             add(new Task_02());
             add(new Task_03());
             add(new Task_04());
             add(new Task_05());
             add(new Task_06());
             add(new Task_07());
             add(new Task_08());
             add(new Task_09());
             add(new Task_10());
             add(new Task_11());
        }};
    }
    /**
     * Set collection length to the property
     */
    public void SetLengthCollection()
    {
        counter = (int)list.stream().count();
    }

    /**
     * When pressing any key, then show the next task
     */
    public void MoveToPos(int number)
    {
        list.get(number).run();
    }

    public void ShowTask()
    {
        AtomicInteger count = new AtomicInteger();
        Scanner sc = new Scanner(System.in);
        do {
            list.stream().forEach(items ->
            {
              count.addAndGet(1);
                System.out.println("\n\n::Task " + count +" at "+counter+ "\n");
                 items.run();
                    System.out.println("Press any key to next");
                 sc.nextLine();
            });
        }while(Integer.parseInt(String.valueOf(count)) != counter);
    }

    /**
     * Runnable method which invoke all method of the class
     */
    @Override
    public void run() {
        try{
             SetCollectionValue();
             SetLengthCollection();
             ShowTask();
        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
