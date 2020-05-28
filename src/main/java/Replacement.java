import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replacement {
    public static void main (String args[]) {
        System.out.println(removeAmpersandWithReplaceAll("Romeo & Juliet"));
        System.out.println(removeAmpersandWithReplace("Minneapolis & St. Paul"));
        System.out.println(removeAmpersandWithPatternMatcher("Jack & Jill"));
        System.out.println(removeAmpersandWithApacheCommons("Mike and Ike"));
    }

    /**
     * My first thought was to implement the Java String replaceAll() method. This is what immediately
     * came to mind when I first saw the coding challenge.
     **/
    public static String removeAmpersandWithReplaceAll(String newStr) {
        String removed = newStr.replaceAll("&", "and");
        return removed;
    }

    public static String removeAmpersandWithReplace(String newStr) {
        String removed = newStr.replace("&", "and");
        return removed;
    }

    public static String removeAmpersandWithPatternMatcher(String newStr) {
        Pattern p = Pattern.compile("&");
        Matcher match = p.matcher(newStr);
        return match.replaceAll("and");
    }

    public static String removeAmpersandWithApacheCommons(String newStr) {
       String removed = org.apache.commons.lang3.StringUtils.replace(newStr, "&", "and");
       return removed;
    }
}
