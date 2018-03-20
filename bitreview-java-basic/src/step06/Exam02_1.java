
package step07;

public class Score2 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average;

    public static void calculate(Score2 score) {
        score.sum = score.kor + score.eng + score.math;
        score.average = score.sum / 3f;
    }
}