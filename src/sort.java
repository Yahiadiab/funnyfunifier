import java.util.Arrays;

public class sort implements Operations {

    @Override
    public String trial(String substring) {
        char[] chars = substring.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
