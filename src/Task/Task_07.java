package Task;

public class Task_07 {
    public Task_07(int range , int range_2)
    {
        if ( range > 0 && range_2 > 0)
        {
            for (int i = range ; i< range_2; i++)
            {
                if(i % 2 !=0)
                {
                    System.out.print(i + " ");
                }
            }
        }else{
            System.out.printf("Must be more than 0");
            System.exit(-1);
            return;
        }
    }
}
