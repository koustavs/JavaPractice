package Core.NumberPrograms;
import java.util.logging.Logger;

public class ReverseNumber {

    static Logger logger = Logger.getLogger(ReverseNumber.class.getName());

    public static void main(String[] args) {

        int numb = 12345;
        int rev = 0, rem = 0;

        while (numb > 0) {
            rem = numb % 10;
            rev = rev * 10 + rem;
            numb = numb / 10;
        }
        //System.out.println(rev);
        logger.info("Reversed number is: "+rev);

    }
}