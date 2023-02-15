package Task;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Task_10 implements Runnable{

    public int [] arr = null;
    public int capacity = 0;

    /**
     * Create and fill arr
     * @param range
     * @param size
     * @return
     */
    public String Fill(int range , int size)
    {
        capacity =  size;
        if(size > 0 && range > 0)
        {
            arr = IntStream.generate(() -> new Random().nextInt(range)).limit(size).toArray();
           return((arr.length > 0 ? "[ ++ ] Fill is successfully" : "[--] Method Fill is failed. Retry again"));
        }
        return "Params must be more than 0. Abort!";
    }

    public int Show(int [] array)
    {
        System.out.print("Array show : ");
        if(array.length > 0)
        {
            Arrays.stream(array).forEach(items -> System.out.print(items+"\t"));
            System.out.println("\n");
        }
        return -1;
    }

    public void EjectEvenNumber(int [] array)
    {
        int [] even = null;
        AtomicInteger count = new AtomicInteger();
        System.out.print("Even digit: ");
        if(array.length > 0) {
            Arrays.stream(array)
                    .filter(value -> value % 2 == 0)
                    .forEach(items->{
                        count.addAndGet(1);
                        System.out.print(items + "\t");
                    });
            System.out.println("\nAll even number found: " + count);
        }
    }
    @Override
    public void run() {
        System.out.println(Fill(100, 20));
        Fill(999,15);
        Show(this.arr);
        EjectEvenNumber(this.arr);
    }
}
