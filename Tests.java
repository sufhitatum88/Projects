//Sufhi Tatum

public class Tests {
    public static void main(String[] args) {

        double test_score1 = 81.4;
        double test_score2 = 93.7;
        double test_score3 = 78.9;

        double average_score = (test_score1 + test_score2 + test_score3) / 3;

        System.out.println("Test score 1: " + test_score1+"%");
        System.out.println("Test score 2: " + test_score2+"%");
        System.out.println("Test score 3: " + test_score3+"%");
        System.out.printf("Average score: %.1f%%",average_score);
    }
}
