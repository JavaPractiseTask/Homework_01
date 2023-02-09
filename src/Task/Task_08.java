package Task;

public class Task_08 {

    public Task_08(int range_1 , int range_2)
    {
        Calculate(range_1,range_2);
    }

    public void Calculate(int items, int items_2)
    {
       for (int i = items; i<items_2; i++)
       {
           for (int j=1 ; j<items_2; j++)
           {
               if(j / 2 == 2) // Условие для генерации пар колонок в консоли (Актуально для данного ТЗ)
               {
                   System.out.print(j + "x"+ i +"="+(j*i) + '\t');
                   System.out.printf("\n");
               }else {
                   System.out.print(j + "x"+ i +"="+(j*i) + '\t');
               }
           }
       }
    }
}
