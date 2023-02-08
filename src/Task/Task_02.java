package Task;

public class Task_02 {
    public int number = 0;
    public int percent = 10;
    public Task_02(int value)
    {
        if(value != 0 && value > 0)
        {
            number = value;
        }else{
            System.out.println("Must more than zero");
            System.exit(-1);
        }
    }

    public String GetPercent()
    {
        return ("Task 2 " +
                "Number:" + number  + "\n" +
                "Percent" + percent + "\n" +
                "Value:"  + number / 10);
    }
}
