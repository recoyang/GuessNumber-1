import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.fest.assertions.Assertions.assertThat;

public class AnswerGeneratorTest {
    private AnswerGenerator answerGenerator;

    @Before
    public void setup() {
        answerGenerator = new AnswerGenerator(new Random());
    }

    @Test
    public void number_should_contain_only_digits() {
        String num = answerGenerator.generate();
        for (int index = 0; index < num.length(); index++) {
            assertThat(num.charAt(index)).isGreaterThanOrEqualTo('0')
                    .isLessThanOrEqualTo('9');
        }
    }

    @Test
    public void number_should_have_exact_length() {
        String num = answerGenerator.generate();
        assertThat(num.length()).isEqualTo(4);
    }

    @Test
    public void number_should_have_no_duplicate_digits() {
        String num = answerGenerator.generate();
        for (int index1 = 0; index1 < num.length(); index1++) {
            for (int index2 = 0; index2 < num.length() && index1 != index2; index2++) {
                assertThat(num.charAt(index1)).isNotEqualTo(num.charAt(index2));
            }
        }
    }

    @Test
    public void numbers_should_not_duplicate_within_five_generates() {
        List<String> numbers = new ArrayList<>();
        for (int index = 0; index < 5; index++) {
            numbers.add(answerGenerator.generate());
        }
        for (int index1 = 0; index1 < numbers.size(); index1++) {
            for (int index2 = 0; index2 < numbers.size() && index1 != index2; index2++) {
                assertThat(numbers.get(index1)).isNotEqualTo(numbers.get(index2));
            }
        }
    }

}
