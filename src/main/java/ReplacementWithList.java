import java.util.ArrayList;
import java.util.List;

/**
 * Once I had run the tests, a decision on which implementation to carry forward to this portion of the
 * project needed to be made. Ultimately it came down to using Java String replaceAll() vs. using the
 * Pattern/Matcher, and I chose the latter. I did so because Pattern/Matcher's true average was a full
 * millisecond faster than replaceAll()'s time. Even though Pattern Matcher's average was slightly worse
 * when allowing for the removal of outliers, the difference was only four hundredths of a millisecond.
 *
 * Once this decision was reached, I used the Pattern/Matcher implementation as my "under the hood"
 * helper method when constructing a method that took in a List of type String and replaced the
 * ampersands in the Strings contained in it. In order to optimize this new method, I used a for-each
 * loop rather than a simple for loop.
 **/

public class ReplacementWithList {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Romeo & Juliet\n boy & girl");
        strList.add("Mike & Ike");
        strList.add("Trey and Mike");
        System.out.println(removeAmpersandWithList(strList));
    }

    public static List<String> removeAmpersandWithList(List<String> newList) {
        List<String> modifiedList = new ArrayList<>();
        for(String element: newList){
            modifiedList.add(Replacement.removeAmpersandWithPatternMatcher(element));
        }
        return modifiedList;
    }
}
