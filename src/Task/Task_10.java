package Task;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Task_10 implements Runnable{

    private int [] arr = null;
    private int [] evenArr = null;
    private int [] notEvenArr = null;
    private int [] positive = null;
    private int capacity = 0;
    private AtomicInteger notEven = new AtomicInteger();
    private AtomicInteger even = new AtomicInteger();

    /**
     * Get arr with even digit
     */
    public void FillPositiveArr()
    {

    }
    public void FillEvenArr(int [] tmp)
    {
        int counter = 0;
        if(tmp.length > 0) {
            evenArr = new int[Integer.parseInt(String.valueOf(even))];
            for(int items : tmp)
            {
                if(items % 2 == 0)
                {
                      evenArr[counter] = items;
                    counter+=1;
                }
            }
              System.out.println(evenArr.length > 0 ? "Save data to arr successfully " : "Array generated is failed");
            Show(evenArr, evenArr.length,"Show new arr: ");
        }
    }

    /**
     * Generate random digit value
     * @return . Return only error message
     */
    public String FillRandom(int range , int size)
    {
        capacity =  size;
        if(size > 0 && range > 0)
        {
            arr = IntStream.generate(() -> new Random().nextInt(range)).limit(size).toArray();
           return((arr.length > 0 ? "[ ++ ] Fill is successfully" : "[--] Method Fill is failed. Retry again"));
        }
        return "Params must be more than 0. Abort!";
    }
    /**
     * Show collection
     * @return When statement is false, then method return error code -1
     */
    public void Show(int [] arr, int size,String msg)
    {
        if(arr.length > 0)
        {
            System.out.print(msg);
            Arrays.stream(arr).forEach(items -> System.out.print(items+"\t"));
            System.out.println("\n");
        }
    }

    /**
     * Calc Even Number
     *
     * @return digit with even count
     */
    public AtomicInteger CalcEven()
    {
        if(arr.length > 0)
        {
            Arrays.stream(arr).filter(value -> value % 2 == 0)
                              .forEach(items ->{even.addAndGet(1);});
            System.out.println(Integer.parseInt(String.valueOf(even)) > 0 ? "All even number found : " + even :  " Even number not found");
        }
        return even;
    }

    /**
     * Show collection with even number
     * @return When statement is false , method return error code as -1
     */
    public void EjectEvenNumber()
    {
        System.out.print("Even digit: ");
        if(arr.length > 0) {
            Arrays.stream(arr)
                  .filter(value -> value % 2 == 0)
                  .forEach(items->{
                         System.out.print(items + "\t");
                    });
            System.out.println();
        }
    }

    /**
     * Interface runnable method
     */
    @Override
    public void run() {
        System.out.println(FillRandom(100, 20));
        FillRandom(999,15);
        Show(this.arr, arr.length, "Show Array: ");
        CalcEven();
        EjectEvenNumber();
        FillEvenArr(this.arr);
    }
}
