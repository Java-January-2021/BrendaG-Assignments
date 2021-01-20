class Gorilla extends Mammal{
    public void throwSomethings(){
        energyLevel -= 5;
        System.out.println("Gorilla has thrown something lowering his enegry by 5.");
    }

    public void eatBananas(){
        energyLevel +=10;
        System.out.println("Gorilla has eating some bananas, its enery has increased by 10.");
    }

    public void climb(){
        energyLevel -=10;
        System.out.println("Gorilla has climbed lowering his energy by 10.");
    }
}