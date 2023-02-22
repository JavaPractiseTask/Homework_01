package Task;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Scanner;
@Getter
@Setter
@NoArgsConstructor
public class Task_07 implements Runnable{
    private int range_0 = 0;
    private int range_1 = 0;

    /**
     *  Set up digit range to properties
     */
    public int GetValue()
    {
        Scanner sc = new Scanner(System.in);
            System.out.print("Press 0 for skip\nEntry digit range #1: ");
            range_0 = sc.nextInt();
            System.out.print("Entry digit range #2: ");
            range_1 = sc.nextInt();
        return range_0;
    }

    public int GetDigitRow(int value)
    {
        if (value % 2 != 0) {
            return value;
        }
        return value;
    }
    /**
     * Calculate function
     */
    public void Calculate() {
        if (range_0 < range_1) {
            System.out.println("Skip row: ");
            for (int i = range_0+1; i < range_1; i++)
            {
                System.out.print(GetDigitRow(i) + "\t");
            }
        }
    }

    @Override
    public void run()
    {
        do{
            GetValue();
            Calculate();
        }while(GetValue() !=0);
    }
}
