public class HumanTest{
    public static void main(String[] args){
        Human bg = new Human();
        Wizard mr = new Wizard(); 
        Ninja cg = new Ninja();
        Ninja kungFuPanda = new Ninja();
        Samurai rt = new Samurai();
        Samurai tx = new Samurai();

        kungFuPanda.steal(mr);
        kungFuPanda.steal(bg);
        kungFuPanda.steal(rt);
        mr.displayHealth();


        // mr.fireball(rt);
        // mr.fireball(rt);
        
        // rt.meditate();
        rt.displayHealth();

        // cg.steal(bg);
        // cg.displayHealth();

        bg.displayHealth();
        // cg.runAway();
        // cg.displayHealth();

        // mr.fireball(bg);
        // mr.fireball(bg);

        // rt.deathBlow(bg);
        // bg.displayHealth();


        // mr.heal(bg);
        // bg.displayHealth();


    }
}