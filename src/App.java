import java.math.BigDecimal;
import java.math.BigInteger;

public class App{

    public static void main(String[] args) {



        BigInteger Number1 = new BigInteger("435353454644654654646");
        BigInteger Number2 = new BigInteger("32425534642344654546544323");
        BigInteger Number3 = Number1.gcd(Number2);
        System.out.println(Number3);




        BigDecimal decimal1 = new BigDecimal("45433352354343543543534.433432245256");
        BigDecimal decimal2 = new BigDecimal("344333454657876653.212453543323");
        BigDecimal decimal3 = decimal1.pow(2);
        BigDecimal decimal4 = decimal2.pow(2);
        System.out.println(decimal3);
        System.out.println(decimal4);

    }


}



