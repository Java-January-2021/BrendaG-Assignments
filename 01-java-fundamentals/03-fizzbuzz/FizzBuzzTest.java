public class FizzBuzzTest{
    public static void main(String[] args){
        for ( int i = 1; i <= 100; i++){
            FizzBuzz fb = new FizzBuzz();
            String result = fb.fizzbuzz(i);
            System.out.println("Number" +" " + i + " - " + "Result: " + result );
        }
    }
}