import org.junit.Test;

import java.util.Random;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessTest {
    /**
     * Unit test
     */
    @Test
    public void mock_both_RandomNumberGenerate_and_CompareNumber_should_work() {
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn("1234");

        CompareNumber compareNumber = mock(CompareNumber.class);
        when(compareNumber.compare("1234", "1234")).thenReturn("4A0B");

        Guess guess = new Guess(compareNumber, answerGenerator);

        assertThat(guess.check("1234")).isEqualTo("4A0B");
    }

    /**
     * Integration test
     */
    @Test
    public void integrate_test_RandomNumberGenerate_and_CompareNumber_should_work() {
        Random random = mock(Random.class);
        when(random.nextInt(10)).thenReturn(1).thenReturn(2).thenReturn(3).thenReturn(4);

        AnswerGenerator answerGenerator = new AnswerGenerator(random);
        CompareNumber compareTwoNumbers = new CompareNumber();
        Guess guessNumber = new Guess(compareTwoNumbers, answerGenerator);

        assertThat(guessNumber.check("1234")).isEqualTo("4A0B");
    }
}
