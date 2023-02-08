package Task;

public class Task_06
{
    public double meters;
    public final double miles;
    public final double yard;

    public Task_06(double meter)
    {
        meters=meter;
        miles = 1609.00;
        yard  = 1094.00;
    }

    public String GetMiles()
    {
        return ("Get miles: " + String.format("%.3f" ,meters / 1609.00));
    }

    public String GetYards()
    {
        return ("Get yard:" + String.format("%.3f", meters * 1.094));
    }

}
