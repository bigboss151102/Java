public class MethodChallenge {
    public static void main(String[] args) {
        int high_score_position = CaculateHighScorePosition(1500);
        DisplayHighScorePosition("Trong", high_score_position);
        high_score_position = CaculateHighScorePosition(999);
        DisplayHighScorePosition("Trong", high_score_position);
        high_score_position = CaculateHighScorePosition(500);
        DisplayHighScorePosition("Trong", high_score_position);
        high_score_position = CaculateHighScorePosition(100);
        DisplayHighScorePosition("Trong", high_score_position);
        high_score_position = CaculateHighScorePosition(25);
        DisplayHighScorePosition("Trong", high_score_position);
    }
    public  static void DisplayHighScorePosition(String player_name, int high_score_position){
        System.out.println(player_name + " managed get into position " + high_score_position + " on the high score list");
    }

    public  static int CaculateHighScorePosition(int player_score){
        if(player_score >= 1000 ){
            return 1;
        } else if (player_score >= 500 && player_score < 1000) {
            return 2;
        } else if (player_score >= 100 && player_score < 500) {
            return 3;
        }else {
            return 4;
        }
    }
}
