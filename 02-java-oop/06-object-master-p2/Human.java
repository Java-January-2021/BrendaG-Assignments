class Human {
    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence =3;
    protected int health = 100;


    public void attack(Human target) {
        target.health -= this.strength;
        System.out.println("Targets health went down by: " + this.strength  + " \n Their health is:" + target.health);
    }

    public int displayHealth(){
        System.out.println("Health is currently: " + this.health);
        return this.health;
    }


}
