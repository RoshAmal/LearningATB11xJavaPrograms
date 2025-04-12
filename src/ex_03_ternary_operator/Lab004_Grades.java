package ex_03_ternary_operator;

public class Lab004_Grades {
    public static void main(String[] args) {
        int score = Integer.parseInt(args[0]);
        char grade = ' ';
        grade = (score >= 90 && score <= 100) ? 'A' : (score >= 80 && score <= 90) ? 'B' : (score >= 70 && score <=79) ? 'C' : (score >= 60 && score <= 69) ? 'D' : 'E';
        System.out.printf("Grade for the score %d is %s", score, grade);
    }
}
