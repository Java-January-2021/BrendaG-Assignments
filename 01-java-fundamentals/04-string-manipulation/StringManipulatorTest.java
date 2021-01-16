public class StringManipulatorTest{
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); 

        StringManipulator manipulator2 = new StringManipulator();
        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); 
        System.out.println(b); 
        System.out.println(c);


        StringManipulator manipulator3 = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer sub = manipulator.getIndexOrNull(word, subString);
        Integer not = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(sub); 
        System.out.println(not); 

        StringManipulator manipulator4 = new StringManipulator();
        String word1 = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word); 

    }
}