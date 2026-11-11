/**
 * The Exam class extends Assessment to calculate numeric scores
 * and point values for an exam.
 */
public class Exam extends Assessment {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    /**
     * Constructor sets up questions, missed questions, and
     * calculates the total score.
     *
     * @param questions The number of questions on the exam
     * @param missed The number of questions missed
     */
    public Exam(int questions, int missed) {
        if (questions <= 0) {
            throw new IllegalArgumentException("Number of questions cannot be zero.");
        }

        this.numQuestions = questions;
        this.numMissed = missed;

        // Calculates how many points each question is worth
        this.pointsEach = 100.0 / questions;

        // Calculates score
        double numericScore = 100.0 - (missed * this.pointsEach);

        // Calls inherited setScore method from Assessment
        setScore((int) numericScore);
    }

    /**
     * getPointsEach method returns pointsEach.
     *
     * @return The points each question is worth
     */
    public double getPointsEach() { return this.pointsEach; }

    /**
     * getNumQuestions method returns numQuestions.
     *
     * @return The total number of questions
     */
    public int getNumQuestions() { return this.numQuestions; }

    /**
     * getNumMissed method returns numMissed.
     *
     * @return The number of questions missed
     */
    public int getNumMissed() { return this.numMissed; }
}