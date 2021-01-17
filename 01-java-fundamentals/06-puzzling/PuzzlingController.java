import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzlingController{
    public static <string> void main(String[] args){
        Puzzling pj = new Puzzling();

        int myArray [] = new int[] {3,5,1,2,7,9,8,13,25,32};
        pj.sumOfAll(myArray);


        pj.shuffleName();

        pj.alphabet();


        pj.randomInt();



        ArrayList<Integer> sortRandom = new ArrayList<Integer>();
        sortRandom = pj.randomSort();
        System.out.println(sortRandom);
        System.out.println("First element: " + "" + sortRandom.get(0));
        System.out.println("Last element: " + "" + sortRandom.get(sortRandom.size()-1));

        pj.randomString();

        pj.randomWords();

    }
}