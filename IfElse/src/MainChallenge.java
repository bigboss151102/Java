public class MainChallenge {
    public static void main(String[] args) {
        boolean game_over = true;
        int score = 5000;
        int level_completed = 5;
        int bonus = 100;
        int final_score = score;
        if (game_over) {
            final_score += (level_completed * bonus);
            System.out.println("Your final socore was " + final_score);
        }

/*       boolean new_game_over = true;
        int new_score = 10000;
        int new_level_completed = 8;
        int new_bonus = 100;
        int new_final_score = new_score;
        if (game_over) {
            new_final_score += (new_level_completed * new_bonus);
            System.out.println("Your final socore was " + new_final_score);
        }*/

        game_over = true;
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
}
