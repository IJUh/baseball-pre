package baseball;

import java.util.Arrays;
import java.util.List;

public class Judgement {
    private int strikeCount = 0;
    private int ballCount  = 0;

    public String matchNumbers(List<Integer> computerNumbers, String playerNumbers) {
        int idx = 0;
        for(int z = 0; z < playerNumbers.length(); z++) {
            compareNumbers(computerNumbers, playerNumbers, idx, z);
            idx++;
        }
        return getScoreResult().toString();
    }
    private StringBuilder getScoreResult() {
        StringBuilder sb = new StringBuilder();
        if(strikeCount == 0 && ballCount == 0) {
            sb.append("낫싱");
        }
        if(ballCount != 0) {
            sb.append(ballCount+"볼 ");
        }
        if(strikeCount != 0) {
            sb.append(strikeCount+"스트라이크");
        }

        return sb;
    }

    private void compareNumbers(List<Integer> ab, String playerNumbers, int idx, int z) {
        compareNumbersAndIndex(ab, playerNumbers, idx, z);
    }
    private void compareNumbersAndIndex(List<Integer> ab, String playerNumbers, int idx, int z) {
        if(ab.get(idx) == playerNumbers.charAt(z) - '0' && idx == z) {
            strikeCount++;
        } else {
            countBall(ab,playerNumbers,idx,z);
        }
    }

    private void countBall(List<Integer> ab, String playerNumbers, int idx, int z) {
        if(ab.contains(playerNumbers.charAt(z) - '0')) {
            ballCount++;
        }
    }


}
