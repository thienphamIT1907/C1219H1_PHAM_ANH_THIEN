package Bai7_CleanCodeRefactoring.BaiTap.Refactoring.src;

public class TennisGame {
    public static final int ZERO_SCORE = 0;
    public static final int GET_FIRST_SCORE = 1;
    public static final int GET_SECOND_SCORE = 2;
    public static final int GET_THIRD_SCORE = 3;

    public static int scorePlayer1 = 0;
    public static int scorePlayer2 = 0;

    public static String namePlayer1;
    public static String namePlayer2;


    public static String getScore(String player1_name, String player2_name, int player1_score, int player2_score) {
        int score = 0;
        if (isWinner()) {
            return playerWithScore() + " is winner! ";
        } else if (isAdvantage()) {
            return "Advantage is " + playerWithScore();
        } else if (isDeuce()) {
            return "Deuce";
        }
        return convertScore(score);
    }

    public static boolean isWinner() {
        if (scorePlayer1 >= 4 && scorePlayer1 >= scorePlayer2 + 2) {
            return true;
        } else return (scorePlayer2 >= 4 && scorePlayer2 >= scorePlayer1 + 2);
    }

    public static boolean isAdvantage() {
        if (scorePlayer2 >= 4 && scorePlayer2 == scorePlayer1 + 1)
            return true;
        return scorePlayer1 >= 4 && scorePlayer1 == scorePlayer2 + 1;
    }

    //  Đổi điểm sang tên gọi
    public static String convertScore(int score) {
        switch (score) {
            case 3:
                return "Forty";
            case 2:
                return "Thirty";
            case 1:
                return "Fifteen";
            case 0:
                return "Love";
        }
        return "Wrong score";
    }

    public static void playerOneScores() {
        scorePlayer1++;
    }

    public static void playerTwoScores() {
        scorePlayer2++;
    }

    public static String playerWithScore() {
        if (scorePlayer1 > scorePlayer2) {
            return namePlayer1;
        } else {
            return namePlayer2;
        }
    }

    private static boolean isDeuce() {
        return scorePlayer1 >= 3 && scorePlayer1 == scorePlayer2;
    }
}

