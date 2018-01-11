import java.util.regex.Pattern;

public class MainTest {

    public static void main(String[] args){

          boolean result = Pattern.matches("^(31|32)(\\d*)$", "3431232");
//          boolean result = Pattern.matches("^1[3|4|5|8][0-9]\\d{8}$ ", "320000");

          System.out.println(result);
    }
}
