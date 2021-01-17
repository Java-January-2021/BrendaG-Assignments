import java.util.ArrayList;

public class ListOfExceptions{
    public static void main(String[] args) {
        //Create ArrayList
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hello World");
        myList.add(48);
        myList.add("Goodbye World");
        System.out.println(myList);

        //Use try/catch blocks to handle the exceptions
        try{
            for(int i=0; i<myList.size(); i++){
                //Try to cast each element to an Integer
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            }
        }
        catch(Exception error){
            System.out.println("Exception occured");
        }
    }
}
