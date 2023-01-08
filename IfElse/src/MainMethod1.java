public class MainMethod1 {
    public static void main(String[] args) {
        boolean game_over = true;
        int score = 5000;
        int level_completed = 5;
        int bonus = 100;

        int high_score_one = CaculateMethod(game_over, score, level_completed, bonus);
        System.out.println("The high score is: " + high_score_one);

        score = 800;
        level_completed = 5;
        bonus = 100;
        int high_score_two = CaculateMethod(game_over, score, level_completed, bonus);
        System.out.println("The next high score is: " + high_score_two);

    }
    public static int CaculateMethod(boolean game_over, int score, int level_completed, int bonus){
        int final_score = score;
        if (game_over){
            final_score += (level_completed * bonus);
            final_score += 1000;
        }
        return final_score;
    }
}
