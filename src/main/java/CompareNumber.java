/**
 * Created by reco on 15/7/15.
 */
public class CompareNumber {

    public String compare(int userInput, int answer) {
        int[] userInputArr = new int[4];
        int[] answerArr = new int[4];
        int[] flag = new int[10];

        for (int i = 0; i < 10; i++){
            flag[i] = 0;
        }

        int theSameValueAndPositonNumber = 0;
        int theSameValueNumber = 0;

        for (int i = 3; i >= 0; i--){
            userInputArr[i] = userInput%10;
            answerArr[i] = answer%10;

            userInput /= 10;
            answer /= 10;
        }

        for(int i = 0;i < 4;i++){
            if (userInputArr[i] == answerArr[i]){
                theSameValueAndPositonNumber++;
            }
        }

        for (int i = 0; i < 4; i++){
            int singleAnswerNumber = answerArr[i];
            int singleUserNumber = userInputArr[i];

            flag[singleAnswerNumber]++;
            theSameValueNumber = flag[singleAnswerNumber]==2?theSameValueNumber+1:theSameValueNumber;

            flag[singleUserNumber]++;
            theSameValueNumber = flag[singleUserNumber]==2?theSameValueNumber+1:theSameValueNumber;

        }

        theSameValueNumber -= theSameValueAndPositonNumber;

        String result = theSameValueAndPositonNumber + "A" + theSameValueNumber + "B";

        return result;
    }
}
