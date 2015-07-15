import java.util.Map;

/**
 * Created by reco on 15/7/15.
 */


public class AnswerGenerator {

    public int generateAnswer() {
        int[] flag = new int[10];
        int answer = 0;

        for (int i = 0; i < 10;i++){
            flag[i] = 0;
        }

        for (int i = 0; i < 4; i++){
            int digit = i>0?(int)(Math.random()*10):(int)(Math.random()*9+1);
            if (flag[digit] == 0){
                flag[digit] = 1;
                answer += digit*(Math.pow(10,3-i));
                continue;
            }
            i--;
        }

        return answer;
    }
}
