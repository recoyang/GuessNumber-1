/**
 * Created by reco on 15/7/15.
 */


import junit.framework.TestSuite;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessTest {
    @Test
    public void guess_test(){

        int userInput = 1234;
        int answer = 1234;

        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer()).thenReturn(answer);

        CompareNumber compareNumber = mock(CompareNumber.class);
        when(compareNumber.compare(userInput,answer)).thenReturn("4A0B");

        Guess guess = new Guess();
        int status = guess.guessNumberGame(userInput);

        assertThat(status,is(0));
    }


}
