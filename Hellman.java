package hellman;

public class Hellman {

    public static void main(String[] args) {
        double base = 5; //chosen base value from both computer A & B
        double prime = 23; // chosen prime value from both computer A & B
        double randomA=6; //random number guess by computer A
        double randomB=15; //random number guess by computer B
        computeRemainder(base,prime,randomA,randomB);  //calling the method for getting the remaider
    }

    public static void computeRemainder(double base, double prime, double randomA, double randomB) {
        double COMPA_Remainder = Math.pow(base,randomA)%prime;
        double COMPB_Remainder = Math.pow(base,randomB)%prime;
        exchangeKeyValue(COMPA_Remainder,COMPB_Remainder,randomA,randomB,prime); //exchanging remainer value between computer A & B
    }

    public static long exchangeKeyValue(double COMPA_Remainder, double COMPB_Remainder, double randomA, double randomB, double prime) {
        double COMPA_Secret_Key = Math.pow(COMPB_Remainder,randomA)%prime; //getting the key value from computer B
        double COMPB_Secret_Key = Math.pow(COMPA_Remainder,randomB)%prime; //getting the key value from computer A
        System.out.println("The Secret key of Computer A is: " + COMPA_Secret_Key);
        System.out.println("The Secret key of Computer B is: " + COMPB_Secret_Key);
        return 0;
    }

}
