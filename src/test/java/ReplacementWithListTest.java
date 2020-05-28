import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ReplacementWithListTest {

    @Test
    public void removeAmpersandWithList() {
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
