import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Finally, I needed to be sure that my new method did indeed replace ampersands with the word "and"
 * within the list as expected. I wanted to go beyond the list provided in the code challenge and make
 * sure edge cases were accounted for: What if there was another string in the same line of code after
 * a new line? What if there was no space after an ampersand where the new word began? What if there
 * was no new line at the end of the string? I tried to make sure that this method was well tested and
 * account for any potential irregularities, and it passed all the outlined cases.
 **/

public class ReplacementWithListTest {

    @Test
    public void removeAmpersandWithListTest() {
        List<String> myList = new ArrayList<>();
        myList.add("Tromeo & Juliet\n foo &bar");
        myList.add("Platoon\n");
        myList.add("Kate & Leopold\ndog & cat");
        myList.add("Harold and Kumar Go to White Castle\n");
        myList.add("Clerks II");

        List<String> expected = new ArrayList<>();
        expected.add("Tromeo and Juliet\n foo andbar");
        expected.add("Platoon\n");
        expected.add("Kate and Leopold\ndog and cat");
        expected.add("Harold and Kumar Go to White Castle\n");
        expected.add("Clerks II");

        List<String> actual = ReplacementWithList.removeAmpersandWithList(myList);

        Assert.assertEquals(expected, actual);

    }
}
