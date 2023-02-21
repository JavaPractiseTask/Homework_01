package Task;

public class Task_01 implements Runnable {
    /**
     * Show some including string
     */
    private void Show()
    {
        System.out.println("Your time is limited,\n" +
                "\tso don’t waste it\n" +
                "\t\tliving someone else’s life”\n" +
                "\t\t\tSteve Jobs");
    }

    @Override
    public void run() {
        this.Show();
    }
}
