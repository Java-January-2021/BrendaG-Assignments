class Wizard extends Human{
    public Wizard() {
        this.health = 50;
        this.intelligence = 8;
    }

    public void heal(Human target) {
        target.health += this.intelligence;
        System.out.println("Wizard has heald human by: "+ this.intelligence+ " Human's health is now: "+ target.health);
    }

    public void fireball(Human target) {
        target.health -= (this.intelligence * 3);
        System.out.println("Wizard has used fireball, lowering targets health to: " + target.health);
    }
}