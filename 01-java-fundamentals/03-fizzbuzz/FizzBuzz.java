public class FizzBuzz{
    public String fizzbuzz(int val){
        if (val % 3 == 0 && val % 5 == 0){
            return("Fizzbuzz");
        }
        else if ( val % 3 == 0){
            return("Fizz");
        }
        else if (val % 5 == 0){
            return("Buzz");
        }
        else{
            return Integer.toString(val);
        }
    }
}