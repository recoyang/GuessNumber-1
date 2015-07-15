/**
 * Created by reco on 15/7/15.
 */
public class Guess {
    public int guessNumberGame(int userInput) {

        String result;

        AnswerGenerator answerGenerator = new AnswerGenerator();
        int answer = answerGenerator.generateAnswer();

        CompareNumber compareNumber = new CompareNumber();
        result = compareNumber.compare(userInput, answer);

        if (result.length()==0) {
            return 1;
        }
        return 0;
    }
}
