/**
 * Created by reco on 15/7/15.
 */
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class AnswerGeneratorTest {
    @Test
    public void should_generate_a_nonZeroStart_4_digits(){
        AnswerGenerator answerGenerator = new AnswerGenerator();
        int answer = answerGenerator.generateAnswer();
        boolean result = false;

        if (answer < 10000 && answer > 1000){
            result = true;
        }
        assertThat(result,is(true));
    }

    @Test
    public void should_generate_a_4_digits_which_have__4_different_number(){
        AnswerGenerator answerGenerator = new AnswerGenerator();
        int answer = answerGenerator.generateAnswer();

        boolean result = true;

        int[] flag = new int[10];

        for (int i = 0; i < 10;i++){
            flag[i] = 0;
        }

        for (int i = 0; i < 4; i++){
           int digit = answer%10;
            flag[digit]++;
            if (flag[digit]>1){
                result = false;
                break;
            }
            answer /= 10;

        }

        assertThat(result,is(true));
    }


}
