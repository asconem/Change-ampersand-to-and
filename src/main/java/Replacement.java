import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replacement {
    public static void main (String[] args) {
        System.out.println(removeAmpersandWithReplaceAll("Romeo & Juliet"));
        System.out.println(removeAmpersandWithReplace("Minneapolis & St. Paul"));
        System.out.println(removeAmpersandWithPatternMatcher("Jack & Jill"));
        System.out.println(removeAmpersandWithApacheCommons("Mike and Ike"));
    }

    /**
     * My first thought was to implement the Java String replaceAll() method. This is what immediately
     * came to mind when I first saw the coding challenge. It seemed like a simple enough solution.
     **/
    public static String removeAmpersandWithReplaceAll(String newStr) {
        String removed = newStr.replaceAll("&", "and");
        return removed;
    }

    /**
     * Next I thought that I should also examine the Java String replace() method. Since we are only
     * seeking out one particular character, I thought that it might yield a better time performance
     * than the replaceAll() counterpart. Only one way to find out.
     **/
    public static String removeAmpersandWithReplace(String newStr) {
        String removed = newStr.replace("&", "and");
        return removed;
    }

    /**
     * Being familiar with RegEx, I knew that using Pattern/Matcher was also an option here. I thought that
     * if I only had to compile the pattern ("&") once, it might shave some precious milliseconds off of my
     * time performance.
     **/
    public static String removeAmpersandWithPatternMatcher(String newStr) {
        Pattern p = Pattern.compile("&");
        Matcher match = p.matcher(newStr);
        return match.replaceAll("and");
    }

    /**
     * While researching various ways to accomplish how to replace the ampersand, I came upon many people
     * recommending the use of StringUtils.replace() from Apache Commons Lang. This method was touted as
     * a much faster implementation than Java String's replaceAll() or replace() methods, so I decided to
     * see if that would still be the case when seeking to replace only one character.
     **/
    public static String removeAmpersandWithApacheCommons(String newStr) {
       String removed = org.apache.commons.lang3.StringUtils.replace(newStr, "&", "and");
       return removed;
    }
}
