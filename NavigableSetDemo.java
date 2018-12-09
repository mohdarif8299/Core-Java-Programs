import java.util.*;
public class GuessTheOutput {
    public static void main(String args[]) {
        Set<GuessTheOutput> set = new TreeSet<GuessTheOutput>();
        set.add(new GuessTheOutput());//LINE A
        set.add(new GuessTheOutput());//LINE B
        set.add(new GuessTheOutput());
        System.out.println(set);
    }
}