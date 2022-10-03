package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        ComputerMachine computerMachine = new ComputerMachine();
        List<Integer> computerNumbers = computerMachine.makeThreeNumbers();

        Player player = new Player();
        String playerNumbers;

        int endOfGame = 0;
        //게임 종료 조건
        while(endOfGame != 2) {
            playerNumbers = player.inputThreeNumbers();
            int result = startGame(computerNumbers, playerNumbers);
            if(result == 1) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                computerNumbers = computerMachine.makeThreeNumbers();
                endOfGame = Integer.valueOf(Console.readLine());
            }
        }
        System.out.println("게임 종료");

    }

    private static int startGame(List<Integer> computerNumbers, String playerNumbers) {

        int result = 0;
        String str;
        Judgement judgement = new Judgement();
        str = judgement.matchNumbers(computerNumbers, playerNumbers);
        System.out.println(str);
        if("3스트라이크".equals(str)) {
            result = 1;
        }
        return result;
    }


}
