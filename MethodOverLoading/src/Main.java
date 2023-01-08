public class Main {
    public static void main(String[] args) {
        System.out.println("New score is " + CalculateScore("Tim", 500));
        System.out.println("New score is " + CaculatedScore(10));

    }
    public static int CalculateScore(String player_name, int score){
        System.out.println("Player " + player_name + " scored " + score + " points");
        return score * 1000;
    }
    public static int CaculatedScore(int score){
        return CalculateScore("Anonymous", score);
    }

    public static void CaculateScore(){
        System.out.println("No player name, no player score !");
    }
}
