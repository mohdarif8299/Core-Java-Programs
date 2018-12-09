import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatcherGroupExample {

    public static void main(String[] args) {

        String text    =
                  "John writes about this, and John writes about that";
                ;

        String patternString1 = "(John) (writes)";

        Pattern pattern = Pattern.compile(patternString1);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println("found: " + matcher.group(1)+" "+matcher.group(2));
        }
    }
}