import java.util.Scanner;

public class ShareMarket
{
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length of list");
            int num = sc.nextInt();

            int array[] = new int[num];//Creating array
            System.out.println("Enter the " + num + " numbers");
            for (int j = 0; j <array.length; j++)//Entering values in array
            {
                array[j] = sc.nextInt();
            }
            for (int k = 0; k <array.length; k++)//Printing values
            {
                System.out.print(array[k]);
            }
            int low = 0;
            int peak = 0;
            for (int i = 1; i <array.length-1; i++)
            {
                if (array[i] < array[i + 1] && array[i] < array[i - 1]) //Comparing previous and next value for fall
                {
                    low++;
                } else if (array[i] > array[i + 1] && array[i] > array[i - 1])
                //Comparing previous and next value for rise
                {
                    peak++;
                }
            }
            System.out.println("\nNumber of fall is " + low);
            System.out.println("Number of Rise is " + peak);
        }
    }
}