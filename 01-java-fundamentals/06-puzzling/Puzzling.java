import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Puzzling{
    public void sumOfAll(int[] arr){
        
        System.out.println("******** sum of all ********");
        int sum = 0;
        for (int i =0; i < arr.length; i++){
            sum += arr[i];
            System.out.println(sum);
        }
        
        System.out.println("******** greater then 10 ********");
        for (int j = 0; j< arr.length; j++){
            if (arr[j] > 10){
            System.out.println(arr[j]);
            }
        }
    }
    public void shuffleName(){
        ArrayList<String> namesArray = new ArrayList<String>();
        namesArray.add ("Nancy");
        namesArray.add ("Jinichi");
        namesArray.add ("Fujibayashi");
        namesArray.add ("Momochi");
        namesArray.add ("Ishikawa");

        System.out.println("******** Shuffle Names ********");
        Collections.shuffle(namesArray);
        System.out.println(namesArray);
        ArrayList<String> result = new ArrayList<String>();
        for(int i=0; i<namesArray.size();i++){
            if(namesArray.get(i).length()>5){
                result.add(namesArray.get(i));
            }
        }
        System.out.println("******** longer than 5 characters ********");
        System.out.println(result);
    }
    public void alphabet(){
        ArrayList <Character> alphabet = new ArrayList <Character> ();
        for(char i= 'a'; i<= 'z'; i++){
            alphabet.add(i);
        }
        System.out.println("******** Alpahabet before shuffeling ********");
        System.out.println(alphabet);

        System.out.println("******** Alpahabet after shuffeling ********");
        Collections.shuffle(alphabet);
        System.out.println(alphabet);

        System.out.println("******** First letter of array ********");
        System.out.println(alphabet.get(0));

        System.out.println("******** Last letter of array ********");

        System.out.println(alphabet.get(alphabet.size()-1));

        ArrayList<Character> vowels = new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for(int i=0; i<vowels.size();i++){
            if(alphabet.get(0)== vowels.get(i)){
            System.out.println("The first letter is a vowel.");
            }
        }  
    }
    public void randomInt(){
        Random r = new Random();
        int low = 55;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        System.out.println("******** random integer ********");
        System.out.println(result);
    }
    public ArrayList<Integer> randomSort(){
        ArrayList<Integer> rdm = new ArrayList<Integer>();
        Random r = new Random();
        int low = 55;
        int high = 100;
        int result;
        for(int i = 0; i<10; i++){
            result = r.nextInt(high-low) + low;
            rdm.add(result);
        }
        Collections.sort(rdm);
        return rdm;
    }

    public void randomString(){
        ArrayList<Character> alphabets = new ArrayList<Character>();
        for (char c = 'a'; c<='z';c++){
            alphabets.add(c);
        }
        String result="";
        for (int i = 0; i<5;i++){
            Random r = new Random();
            result += alphabets.get(r.nextInt(alphabets.size()));
        }
        System.out.println(result);
    }

    public void randomWords(){
        ArrayList<Character> alpha = new ArrayList<Character>();
        for (char c = 'a'; c<='z';c++){
            alpha.add(c);
        }
        // System.out.println(alpha);
        ArrayList<String> values = new ArrayList<String>();
        for (int i = 0; i<10;i++){
            String result1="";
            for (int j=0;j<5;j++){
                Random r = new Random();
                result1 += alpha.get(r.nextInt(alpha.size()));
            } 
            values.add(result1);
        }
        System.out.println(values);
    }
    
}