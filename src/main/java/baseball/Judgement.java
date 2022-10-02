package baseball;

import java.util.List;

public class Judgement {
    private int strikeCount = 0;
    private int ballCount  = 0;

    public String matchNumbers(List<Integer> computerNumbers, String playerNumbers) {
        int idx = 0;
        for(int z = 0; z < playerNumbers.length(); z++) {
            compareNumbers(computerNumbers, playerNumbers.charAt(z) - '0', idx, z);
            idx++;
        }
        return getScoreResult().toString();
    }
    private StringBuilder getScoreResult() {
        StringBuilder sb = new StringBuilder();
        if(strikeCount == 0 && ballCount == 0) {
            sb.append("낫싱");
        }
        if(strikeCount != 0) {
            sb.append(strikeCount+"스트라이크");
        }
        if(ballCount != 0) {
            sb.append(ballCount+"볼");
        }
        return sb;
    }

    private void compareNumbers(List<Integer> ab, int playerNumbers, int idx, int z) {
        if(ab.get(idx) != 0) {
            compareNumbersAndIndex(ab, playerNumbers, idx, z);
        }
    }
    private void compareNumbersAndIndex(List<Integer> ab, int playerNumbers, int idx, int z) {
        if(ab.get(idx) == playerNumbers && idx == z) {
            strikeCount++;
            ab.set(idx,0);
        } else if(ab.get(idx) == playerNumbers && idx != z) {
            ballCount++;
            ab.set(idx,0);
        }
    }

}
