
import java.util.ArrayList;

public class Basics{

    public void allNum(){
        for (int i=0; i < 255; i++){
            System.out.println(i);
        }

    }


    public void oddNum(){
        for(int j=0; j<255; j++){
            if(j%2!=0){
                System.out.println(j);
            }
        }
    }


    public void printSum(){
        int result = 0;
        for(int i=0; i < 255; i++){
            result += i;
            System.out.println("New number: " + i + " Sum: " + result);
        }
    }


    public void Iterate(int[] arr){
        for (int i=0;i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }


    public void Max(int[] inputValue){
        int maxValue = inputValue[0];
        for (int i=0; i< inputValue.length; i++){
            if(inputValue[i]> maxValue){
                maxValue= inputValue[i];
            }
        }
        System.out.println(maxValue);
    }


    public void Average(int[] avg){
        int result= 0;
        int average;
        for (int i=0; i< avg.length; i++){
            result += avg[i];
        }
        average = result/ avg.length;
        System.out.println("Average: " + average);
    }


    public void arrayOddNumbers(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i=0; i<=255; i++){
            if(i%2!=0){
                myArray.add(i);
            }
        }
        System.out.println(myArray);
    }

    public int greaterThanY(int[] arg, int comp){
        ArrayList<Integer> greaterValue = new ArrayList<Integer>();
        for (int i=0; i<arg.length; i++){
            if (arg[i] > comp){
                greaterValue.add(i);
            }
        }
        return greaterValue.size();
    }


    public ArrayList<Integer> squareValues(ArrayList<Integer> val){
        int result = 0;
        for(int i=0; i<val.size(); i++){
            result = val.get(i)* val.get(i);
            val.set(i, result);
        }
        return val;
    }


    public ArrayList<Integer> eliminateNegNums(ArrayList<Integer> val){
        for (int i=0; i< val.size(); i++){
            if (val.get(i)<0){
                val.set(i,0);
            }
        }
        return val;
    }


    public void minMaxAvg(int[] value){
        ArrayList<Integer> result = new ArrayList<Integer>();
        //Max
        int max = value[0];
        for (int i=0; i<value.length; i++){
            if(value[i] > max){
                max = value[i];
            }
        }
        result.add(max);

        //Min
        int min = value[0];
        for (int b=0; b<value.length; b++){
            if(value[b]< min){
                min = value[b];
            }
        }
        result.add(min);

        //Average 
        int avg;
        int sum = 0;
        for (int x=0; x<value.length; x++){
            sum += value[x]; 
        }
        avg = sum/value.length;
        result.add(avg);

        System.out.println(result);
    }

    //Shifting the Values in the Array
    public void shiftingValues(ArrayList<Integer> arr){
        int result = 0;
        for (int i=0; i<=arr.size()-1; i++){
            if (i==arr.size()-1){
                arr.set(i,0);
            }else{
                result = arr.get(i+1);
                arr.set(i, result);
            }
        }
        System.out.println(arr);
    }
}