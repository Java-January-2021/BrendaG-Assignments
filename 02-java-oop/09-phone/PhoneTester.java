public class PhoneTester{
    public static void main(String[] args){
        Galaxy note = new Galaxy("Note20", 98 , "TMobile", "Ring Ring Ring");
        IPhone xs = new IPhone("MAX", 100 , "Verizon" , "Ring Ding Dong Ringga Ding Ding Dong");


        // xs.displayInfo();

        // note.displayInfo();
        System.out.println(note.ring());
        System.out.println(xs.ring());
        System.out.println(xs.unlock());
        System.out.println(note.unlock());

    }
}