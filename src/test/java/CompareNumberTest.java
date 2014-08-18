import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CompareNumberTest {
    private CompareNumber compareNumber;

    @Before
    public void setUp() {
        compareNumber = new CompareNumber();
    }

    @Test
    public void should_return_4A0B_when_compare_1234_and_1234() {
        assertThat(compareNumber.compare("1234", "1234"), is("4A0B"));
    }

    @Test
    public void should_return_0A0B_when_compare_1234_and_5678() {
        assertThat(compareNumber.compare("1234", "5678"), is("0A0B"));
    }

    @Test
    public void should_return_0A4B_when_compare_1234_and_4321() {
        assertThat(compareNumber.compare("1234", "4312"), is("0A4B"));
    }

    @Test
    public void should_return_1A3B_when_compare_1234_and_4132() {
        assertThat(compareNumber.compare("1234", "4132"), is("1A3B"));
    }

    @Test
    public void should_return_0A2B_when_compare_1234_and_5372() {
        assertThat(compareNumber.compare("1234", "5372"), is("0A2B"));
    }
}
