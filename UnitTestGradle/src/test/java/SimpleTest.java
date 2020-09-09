import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.CombinableMatcher.both;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.Assert.assertThat;

public class SimpleTest {

    @Test
    public void testAssetThatExamples() {

        // 'theString' should contain 'S' and 'r'
        assertThat("theString", both(containsString("S")).and(containsString("r")));

        List<String> items = Arrays.asList("John", "James", "Julia", "Jim");

        // items list should have James and Jim
        assertThat(items, hasItems("James", "Jim"));

        // Every item in the list should have the character 'J'
        assertThat(items, everyItem(containsString("J")));

        // check all of the matchers
        assertThat("Once", allOf(equalTo("Once"), startsWith("O")));

        // negation of all of the matchers
        assertThat("Once", not(allOf(equalTo("test"), containsString("test"))));
    }
}
