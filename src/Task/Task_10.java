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
    private int [] negative = null;
    private int capacity  = 0;

    private AtomicInteger negativeN = new AtomicInteger();
    private AtomicInteger positiveN = new AtomicInteger();
    private AtomicInteger notEven = new AtomicInteger();
    private AtomicInteger even = new AtomicInteger();

    /**
     * Eject negative digit to arr
     */
    public void FillNegativeArr(int [] tmp)
    {
        int counter = 0;
        if(tmp.length > 0)
        {
            negative = new int[Integer.parseInt(String.valueOf(negativeN))];
            for (int item : tmp)
            {
                if(item < 0)
                {
                      negative[counter] = item;
                    counter+=1;
                }
            }
        }
           System.out.println(negative.length > 0 ? "Save negative digit to arr successfully" : "Array generate is failed");
        Show(negative,negative.length , "Read arr with negative digit: ");
    }

    /**
     * Eject positive digit to arr
     * @param tmp
     */
    public void FillPositiveArr(int [] tmp)
    {
        int counter = 0;
        if(tmp.length >0)
        {
            positive = new int [Integer.parseInt(String.valueOf(positiveN))];
            for(int item : tmp)
            {
                if(item > 0)
                {
                     positive[counter] = item;
                    counter+=1;
                }
            }
               System.out.println(positive.length > 0 ? "Save positive digit to arr successfully" : "Array generate is failed");
            Show(positive,positive.length , "Read arr with positive digit: ");
        }
    }

    /**
     * Eject arr with even digit
     */
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
               System.out.println(evenArr.length > 0 ? "Save even digit to arr successfully " : "Array generate is failed");
            Show(evenArr, evenArr.length,"Read arr with even digit: ");
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
            arr = IntStream.generate(() -> new Random().nextInt(range) - 200).limit(size).toArray();
           return((arr.length > 0 ? "[ ++ ] Method Fill is successfully" : "[--] Method Fill is failed. Retry again"));
        }
        return "Params must be more than 0. Abort!";
    }


    /**
     * Show array
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

    public AtomicInteger CalcNegative()
    {
        if(arr.length > 0)
        {
            Arrays.stream(arr)
                    .filter(value -> (value < 0))
                    .forEach(items ->{negativeN.addAndGet(1);});
            System.out.println(Integer.parseInt(String.valueOf(negativeN)) > 0 ? "Negative digit: " + negativeN + " items" :  "Negative digit not found");
        }
        return negativeN;
    }
    /**
     * Calculate even items
     * @return
     */
    public AtomicInteger CalcEven()
    {
        if(arr.length > 0)
        {
            Arrays.stream(arr).filter(value -> value % 2 == 0)
                              .forEach(items ->{even.addAndGet(1);});
            System.out.println(Integer.parseInt(String.valueOf(even)) > 0 ? "Even digit: " + even + " items":  " Even digit not found");
        }
        return even;
    }

    /**
     * Calculate Positive items
     * @return
     */
    public AtomicInteger CalcPositive()
    {
        Arrays.stream(arr).filter(value-> value > 0).forEach(items->{positiveN.addAndGet(1);});
          System.out.println(Integer.parseInt(String.valueOf(positiveN)) > 0 ? "Positive digit: " + positiveN + " items":"Positive items not found");
        return positiveN;
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
     * Eject Positive Number
     */
    public void EjectPositiveNumber()
    {
        if(arr.length > 0)
        {
            Arrays.stream(arr)
                    .filter(value-> value > 0).forEach(items-> {
                        System.out.println(items+ "\t");
                    });
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
        CalcPositive();
        CalcNegative();
       // EjectEvenNumber();
        FillEvenArr(this.arr);
        FillPositiveArr(this.arr);
        FillNegativeArr(this.arr);
    }
}
