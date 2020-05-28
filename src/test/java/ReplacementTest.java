import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *  I knew that I needed to test the performance of each of the four implementations, so I wrote a test
 *  for each of the methods I created in the Replacement class. Only running each test once wouldn't yield a
 *  sufficient data set to work off of, so I decided to run each test ten times. After noting the results, I
 *  calculated both a simple average as well as an average with the outliers removed. I wanted to capture the
 *  most accurate picture of the data so that I could make an informed decision about which worked best on this
 *  use case. It was interesting to note that the highly touted Apache Commons Lang replace() method finished
 *  well behind the other three implementations - perhaps it works better on longer inputs?
 **/

public class ReplacementTest {

    //Test results in milliseconds - 16ms, 18ms, 16ms, 19ms, 17ms, 15ms, 29ms, 14ms, 26ms, 13ms
    //Average = 18.3ms
    //Average with high and low outliers removed = 17.63ms
    @Test
    public void removeAmpersandReplaceAllTest() {
        String newStr = "Tromeo & Juliet\n" +
                "Platoon\n" +
                "Kate & Leopold\n" +
                "Poltergeist III\n" +
                "Harold and Kumar Go to White Castle\n" +
                "Clerks II";

        String expected = "Tromeo and Juliet\n" +
                "Platoon\n" +
                "Kate and Leopold\n" +
                "Poltergeist III\n" +
                "Harold and Kumar Go to White Castle\n" +
                "Clerks II";

        String actual = Replacement.removeAmpersandWithReplaceAll(newStr);

        Assert.assertEquals(expected, actual);
    }

    //Test results in milliseconds - 39ms, 16ms, 12ms, 22ms, 12ms, 21ms, 14ms, 33ms, 21ms, 21ms
    //Average = 21.1ms
    //Average with high and low outliers removed = 20.0ms
    @Test
    public void removeAmpersandReplaceTest() {
        String newStr = "Tromeo & Juliet\n" +
                "Platoon\n" +
                "Kate & Leopold\n" +
                "Poltergeist III\n" +
                "Harold and Kumar Go to White Castle\n" +
                "Clerks II";

        String expected = "Tromeo and Juliet\n" +
                "Platoon\n" +
                "Kate and Leopold\n" +
                "Poltergeist III\n" +
                "Harold and Kumar Go to White Castle\n" +
                "Clerks II";

        String actual = Replacement.removeAmpersandWithReplace(newStr);

        Assert.assertEquals(expected, actual);
    }

    //Test results in milliseconds - 20ms, 16ms, 17ms, 14ms, 19ms, 17ms, 7ms, 22ms, 20ms, 21ms
    //Average = 17.3ms
    //Average with high and low outliers removed = 18.0ms
    @Test
    public void removeAmpersandPatternMatcherTest() {
        String newStr = "Tromeo & Juliet\n" +
                "Platoon\n" +
                "Kate & Leopold\n" +
                "Poltergeist III\n" +
                "Harold and Kumar Go to White Castle\n" +
                "Clerks II";

        String expected = "Tromeo and Juliet\n" +
                "Platoon\n" +
                "Kate and Leopold\n" +
                "Poltergeist III\n" +
                "Harold and Kumar Go to White Castle\n" +
                "Clerks II";

        String actual = Replacement.removeAmpersandWithPatternMatcher(newStr);

        Assert.assertEquals(expected, actual);
    }

    //Test results in milliseconds - 35ms, 33ms, 32ms, 32ms, 62ms, 101ms, 39ms, 30ms, 42ms, 27ms
    //Average = 43.3ms
    //Average with high and low outliers removed = 38.1ms
    @Test
    public void removeAmpersandApacheCommonsLangTest() {
        String newStr = "Tromeo & Juliet\n" +
                "Platoon\n" +
                "Kate & Leopold\n" +
                "Poltergeist III\n" +
                "Harold and Kumar Go to White Castle\n" +
                "Clerks II";

        String expected = "Tromeo and Juliet\n" +
                "Platoon\n" +
                "Kate and Leopold\n" +
                "Poltergeist III\n" +
                "Harold and Kumar Go to White Castle\n" +
                "Clerks II";

        String actual = Replacement.removeAmpersandWithApacheCommons(newStr);

        Assert.assertEquals(expected, actual);
    }
}
