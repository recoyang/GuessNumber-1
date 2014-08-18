public class CompareNumber {
    public int countA(String answer, String input) {
        int count = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == input.charAt(i)) {
                count += 1;
            }
        }
        return count;
    }

    public int countBIncludingA(String answer, String input) {
        int count = 0;
        for (int index = 0; index < answer.length(); index++) {
            if (answer.indexOf(input.charAt(index)) != -1) {
                count += 1;
            }
        }
        return count;
    }

    public String compare(String answer, String input) {
        int count_a = countA(answer, input);
        int count_b_with_a = countBIncludingA(answer, input);

        return count_a + "A" + (count_b_with_a - count_a) + "B";
    }
}