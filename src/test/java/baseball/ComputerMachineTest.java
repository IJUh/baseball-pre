package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ComputerMachineTest {

    private ComputerMachine computerMachine;
    private List<Integer> threeOtherNumbers;

    @BeforeEach
    public void setUp() {
        computerMachine = new ComputerMachine();
        threeOtherNumbers = computerMachine.makeThreeNumbers();
    }

    @DisplayName("서로다른 1~9사이의 숫자 3개 입력 테스트")
    @Test
    public void getRandomThreeNumberTest() {
        assertThat(threeOtherNumbers.size()).isEqualTo(3);
        assertThat(threeOtherNumbers.size()).isNotEqualTo(10);
        assertThat(threeOtherNumbers.size()).isNotEqualTo(1);
    }
}
