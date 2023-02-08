package Task;

public class Task_05
{
    public Task_05(int number)
    {
            switch (number) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                case 2:
                    System.out.printf("It's a winter");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.printf("It's a Spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.printf("It's a Summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.printf("It's an Autumn");
                    break;
                case 12:
                    System.out.printf("It's a Winter");
                    break;
                default:
                    System.out.printf("Incorrect month");
                    break;
            }
        }
    }
