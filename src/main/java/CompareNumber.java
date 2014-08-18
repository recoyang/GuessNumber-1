public class CompareNumber {
    public int countA(String challenge, String guess) {
        int count = 0;
        for (int i = 0; i < challenge.length(); i++) {
            if (challenge.charAt(i) == guess.charAt(i)) {
                count += 1;
            }
        }
        return count;
    }

    public int countBIncludingA(String challenge, String guess) {
        int count = 0;
        for (int i = 0; i < guess.length(); i++) {
            for (int j = 0; j < challenge.length(); j++) {
                if (guess.charAt(i) == challenge.charAt(j)) {
                    count += 1;
                }
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