import java.lang.Math;
public class Pythagorean{
    public static double calculateHypotenuse(int legA, int legB){
        double sideA = legA;
        double sideB = legB;
        double c = Math.sqrt((sideA * sideA ) + (sideB * sideB));
        return c;
    }
}