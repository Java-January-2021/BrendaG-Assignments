class Bat extends Mammal{
    public void fly(){
        this.energyLevel -= 50;
        System.out.println("Bat has flyed away decreasing energy by 50.");
    }

    public void eatHumans(){
        this.energyLevel +=25;
        System.out.println("Munch, Munch, Munch. Energy has gone up by 25.");
    }

    public void attackTown(){
        this.energyLevel -=100;
        System.out.println("Town now on fire, energy has gone down by 100.");
    }
}