import java.util.Random;

public class ComputeMethods5026211088 {
    public double fToC(double degreesF){
        return 5.0/9.0*(degreesF - 32) ;    // C = 5/9*(F-32)
    }

    public double hypotenuse(int a, int b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));  // C = akar(a^2 +b^2)
    }

    public int roll(){
        Random dice = new Random();
        int dice1 = dice.nextInt(6) + 1;    // angka dadu pertama
        int dice2 = dice.nextInt(6) + 1;    // angka dadu kedua
        int dicetotal = dice1 + dice2;      // total kedua dadu
        return dicetotal;
    }
}