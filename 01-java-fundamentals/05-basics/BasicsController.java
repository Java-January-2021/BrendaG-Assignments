import java.util.ArrayList;
import java.util.Arrays;

public class BasicsController {
    public static void main(String[] args) {
        Basics bs = new Basics();

        //Print All Numbers
        bs.allNum();

        //Print Odd Numbers
        bs.oddNum();

        //Print Sum Numbers
        bs.printSum();

        //Iterate through Array
        int anArray[] = new int[] {1,3,5,7,9,13};
        bs.Iterate(anArray);

        //Find Max
        int arrNeg[]  = new int[]{-3,-5,-7};
        int arrPos[]  = new int[]{5,10,8};
        int arrZero[] = new int[] {20,30,0,-2,4,6};
        bs.Max(arrNeg);
        bs.Max(arrPos);
        bs.Max(arrZero);

        //Get Average
        int arrAvg[]  = new int[] {2,10,3};
        int arrAvg1[] = new int[] {20,30,15,5,20};
        bs.Average(arrAvg);
        bs.Average(arrAvg1);

        //Array with Odd Numbers
        bs.arrayOddNumbers();

        //Greater Than Y
        int arrY[] = new int[] {1,3,5,7};
        int y=3;
        int result2 = bs.greaterThanY(arrY,y);
        System.out.println(result2);
        
        //Square the values
        ArrayList<Integer> value = new ArrayList<Integer>(
            Arrays.asList(1,5,10,-2)
        );
        ArrayList<Integer> result = bs.squareValues(value);
        System.out.println(result);

        //Eliminate Negative Numbers
        ArrayList<Integer> value1 = new ArrayList<Integer>(
            Arrays.asList(1,5,10,-2)
        );
        ArrayList<Integer> result1 = bs.eliminateNegNums(value1);
        System.out.println(result1);

        //Max, Min, and Average
        int values[] = new int[] {1,5,10,-2};
        bs.minMaxAvg(values);

        //Shifting the Values in the Array
        ArrayList<Integer> shiftingValues = new ArrayList<Integer>(
            Arrays.asList(1,5,10,7,-2)
        );
        bs.shiftingValues(shiftingValues);

    }

}