package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ComputerMachine {

    private List<Integer> randomThreeNumbers;

    public List<Integer> makeThreeNumbers() {
        return Randoms.pickUniqueNumbersInRange(1,9,3);
    }

}
