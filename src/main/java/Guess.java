public class Guess {
    private CompareNumber compareNumber;
    private String answer;

    public Guess(CompareNumber compareNumber, AnswerGenerator answerGenerator) {
        this.compareNumber = compareNumber;
        this.answer= answerGenerator.generate();
    }

    public String check(String input) {
        return this.compareNumber.compare(this.answer, input);
    }
}
