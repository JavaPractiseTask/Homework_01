package Task;

import java.util.Scanner;

public class Task_11 implements Runnable {
    public void DrawLeft()
    {
           System.out.println("Left ←");
    }

    public void DrawRight()
    {       System.out.println("Right →");
    }

    public void DrawBottom()
    {
             System.out.println("Bottom ↓ ");
    }

    public void DrawTop()
    {       System.out.println("Top ↑");
    }
    @Override
    public void run() {
       DrawLeft();
       DrawRight();
       DrawBottom();
       DrawTop();
    }


}
