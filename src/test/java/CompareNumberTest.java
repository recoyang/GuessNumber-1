import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by reco on 15/7/15.
 */
public class CompareNumberTest {
    @Test
    public void should_return_4A0B_when_given_two_the_same_numbers(){
        CompareNumber compareNumber = new CompareNumber();
        String compareResult = compareNumber.compare(1234,1234);

        assertThat(compareResult, is("4A0B"));

    }

    @Test
    public void should_return_0A0B_when_given_two_different_numbers(){
        CompareNumber compareNumber = new CompareNumber();
        String compareResult = compareNumber.compare(1234,5678);

        assertThat(compareResult, is("0A0B"));
    }

    @Test
    public void should_return_0A4B_when_give_two_equallNumberButNotTheSame_numbers(){
        CompareNumber compareNumber = new CompareNumber();
        String compareResult = compareNumber.compare(1234,4321);

        assertThat(compareResult,is("0A4B"));
    }

    @Test
    public void should_return_2A2B_when_two_numbers_have_two_theSame_number_and_two_equalNumberButNotAtTheSamePosition(){
        CompareNumber compareNumber = new CompareNumber();
        String compareResult = compareNumber.compare(1234,1243);

        assertThat(compareResult,is("2A2B"));
    }


}
