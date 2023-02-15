package Task;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task_09 implements Runnable
{
    private int [] arr;
    private int size;
  //private IntStream stream = null;

    /**
     * Create array
     */
    public void Create()
    {
        Scanner sc = new Scanner(System.in);
            System.out.print("Entry length: ");
            size = sc.nextInt();
            arr = new int[size];
    }

    /**
     * Fill random value to the collect
     */
    public void Fill()
    {
        if(size > 0)
        {
          arr = IntStream.generate(() -> new Random().nextInt(50) - 25).limit(size).toArray();
        }else{
            System.out.println("Must be more than 0");
            System.exit(-1);
        }
    }

    /**
     * Show items
     */
    public void Show()
    {
        System.out.println("Array Contains : ");
        Arrays.stream(arr).forEach(value -> System.out.print(value + "\t"));
    }

    /**
     * Find max value
     */
    public void Max()
    {
        System.out.print("\nMax value: " + Arrays.stream(arr).max() + "\t");
    }

    /**
     * Looking for min value
     */
    public void Min()
    {
        System.out.print("Min value: " + Arrays.stream(arr).min() + "\t");
    }

    /**
     * Looking negative digit
     */
    public void FindNegativeValue()
    {
        System.out.println("Negative value: " + Arrays.stream(arr).filter(item -> item < 0).count());
    }

    /**
     * Find posttive digit
     */
    public void FindPositiveValue()
    {
        System.out.println("Positive value: " + Arrays.stream(arr).filter(item -> item > 0).count());
    }
    /*

    public void MapToStream()
    {
        stream = Arrays.stream(arr);
        {
            System.out.println(stream.count() > 0 ? "Status : OK . Add" + stream.count() + "is successfull" : "Status: Stream is missing. Abort");
        };
    }
   */
    @Override
    public void run() {
        Create();
        Fill();
      // MapToStream();
        Show();
        Max();
        Min();
        FindNegativeValue();
        FindPositiveValue();
    }
}
