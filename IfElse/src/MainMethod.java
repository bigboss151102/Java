public class MainMethod {
    public static void main(String[] args) {
        boolean game_over = true;
        int score = 5000;
        int level_completed = 5;
        int bonus = 100;
        int final_score = score;

        CaculateMethod(game_over, score, level_completed, bonus);

        score = 800;
        level_completed = 5;
        bonus = 100;
        final_score = score;
        if (game_over) {
            final_score += (level_completed * bonus);
            final_score += 1000;
            System.out.println("Your final socore was " + final_score);
        }
    }
    public static void CaculateMethod(boolean game_over, int score, int level_completed, int bonus){
        int final_score = score;
        if (game_over){
            final_score += (level_completed * bonus);
            final_score += 1000;
            System.out.println("Your final score was " + final_score);
        }

    }
}
