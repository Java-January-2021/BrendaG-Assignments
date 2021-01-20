class Samurai extends Human{
    private static int numSamurai = 0;
    private static int defaultHealth = 200;
    public static int howMany() {
        return Samurai.numSamurai;
    }
    public Samurai() {
        this.health = Samurai.defaultHealth;
        Samurai.numSamurai += 1;
    }
    public void deathBlow(Human target) {
        target.health = 0;
        this.health = (this.health/2);
        System.out.println("Samurai has delivered a deathly blow to target " + " Target's health has been reduced to: " + target.health);
    }
    public void meditate() {
        this.health = Samurai.defaultHealth;
        System.out.println("Samurai has meditated");
    }
}