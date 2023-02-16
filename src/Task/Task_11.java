package Task;

import java.util.Scanner;

public class Task_11 implements Runnable {
    /**
     * Show left
     */
    public void DrawLeft()
    {
        System.out.println("Left ←");
    }

    /**
     * Show right
     */
    public void DrawRight()
    {
        System.out.println("Right →");
    }

    /**
     * Show bottom
     */
    public void DrawBottom()
    {
        System.out.println("Bottom ↓ ");
    }

    /**
     * Show top
     */
    public void DrawTop()
    {
        System.out.println("Top ↑");
    }

    /**
     * Running
     */
    @Override
    public void run()
    {
       DrawLeft();
       DrawRight();
       DrawBottom();
       DrawTop();
    }
}
