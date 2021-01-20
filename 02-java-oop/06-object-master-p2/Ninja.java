class Ninja extends Human{
    public Ninja() {
        this.stealth = 10;
    }
    public int steal(Human target) {
        target.health -= this.stealth;
        this.health += this.stealth;
        System.out.println("Ninja stole: " + this.stealth);
        return this.health;
    } 
    public int runAway() {
        this.health -= 10;
        System.out.printf("Ninja has ran away, health has gone down by 10." );
        return this.health;
    }
}