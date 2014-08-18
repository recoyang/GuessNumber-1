import java.util.Random;

public class AnswerGenerator {
    private Random random;

    public AnswerGenerator(Random random) {
        this.random = random;
    }

    public String generate() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int index =0; index < 4; index++) {
            int number = random.nextInt(10);
            while (stringBuilder.toString().contains("" + number)) {
                number = random.nextInt(10);
            }
            stringBuilder.append(number);
        }

        return stringBuilder.toString();
    }
}
