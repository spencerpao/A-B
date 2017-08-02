import java.util.Scanner;

public class Adding {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //        System.out.println(numbers + secondInput);
        while (input.hasNext())
        {
            int numbers = input.nextInt();
            int secondInput = input.nextInt();
            int sum = numbers + secondInput;
            if (sum != 0)
            {
                System.out.println(numbers + secondInput);
            }
            else
            {
                return;
            }
        }

        //        int[] numberArray = new int[numbers];
        //        int sum = 0;
        //        for (int i = 0; i <= numbers; i ++)
        //        {
        //            sum = numberArray[i] + numberArray[i+1];            
        //        }
        //        System.out.println(sum);

    }
}
