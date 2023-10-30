package racingcar.utils;

import static racingcar.utils.RacingConfig.MAX_NAME_LENGTH;
import static racingcar.utils.RacingConfig.NAME_PATTERN;

import java.util.regex.Pattern;

public final class Validator {
    private Validator() {
        throw new AssertionError("Validator class should not be instantiated.");
    }

    public static void validLength(String inputName) {
        if (inputName.length() > MAX_NAME_LENGTH){
            throw new IllegalArgumentException("5자 이하의 한글 또는 영어를 입력해주세요");
        }
    }

    public static void validNameFormat(String input) {
        if (Pattern.matches(NAME_PATTERN, input)) {
            return;
        } throw new IllegalArgumentException("이름은 한글과 영어, 구분자는 쉼표를 입력해주세요.");
    }

    public static void validIsNumber(String inputNumber) {
        if (inputNumber.chars().allMatch(Character::isDigit)){
            return;
        } throw new IllegalArgumentException("숫자를 입력해주세요.");
    }
}
