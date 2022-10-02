package baseball;

import camp.nextstep.edu.missionutils.Console;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Player {

    private List<Integer> playerNumbers;

    public int inputThreeNumbers() {
        String inputType = Console.readLine();

        // 문자열 입력 시 오류 발생하면서 시스템 종료
        if(inputType.charAt(0) < 49 || inputType.charAt(0) > 57) {
            throw new IllegalArgumentException("문자열을 입력하였습니다. 1~9사이의 숫자를 입력해주세요.");
        }

        int num = Integer.valueOf(inputType);
        if(num < 1 || num > 9) {
            throw new IllegalArgumentException("잘못된 범위의 숫자를 입력하였습니다. 1~9사이의 숫자를 입력해주세요.");
        }

        return num;
    }

}