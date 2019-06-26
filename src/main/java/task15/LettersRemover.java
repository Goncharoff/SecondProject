package task15;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class LettersRemover {
    private static final String CASE_SENSETIVE_REGEX_PATTERN = "(?i)";

    public static void main(String[] args) {
        String input = "Ittiiiiiiiii couzzzcccc shhhsiishh";

        System.out.println(Arrays.toString(deletionInArray(input, LettersRemover::deleteFirstLetterValue)));
        System.out.println(Arrays.toString(deletionInArray(input, LettersRemover::deleteLastLetterValue)));

    }

    public static String deleteFirstLetterValue(String inputWord) {

        if (inputWord == null || inputWord.length() == 0) {
            throw new IllegalArgumentException("Word can not be null or its length should be more then 0");
        }

        char firstChar = inputWord.charAt(0);
        String regexToRemoveByChar = CASE_SENSETIVE_REGEX_PATTERN + firstChar;

        return inputWord.length() > 1
                ? firstChar + inputWord.substring(1).replaceAll(regexToRemoveByChar, "")
                : inputWord;
    }

    public static String deleteLastLetterValue(String inputWord) {

        if (inputWord == null || inputWord.length() == 0) {
            throw new IllegalArgumentException("Word can not be null or its length should be more then 0");
        }

        char lastChar = inputWord.charAt(inputWord.length() - 1);
        String regexToRemoveByChar = CASE_SENSETIVE_REGEX_PATTERN + lastChar;
        return inputWord.length() > 1
                ? inputWord.replaceAll(regexToRemoveByChar, "") + lastChar
                : inputWord;
    }

    public static String[] deletionInArray(String input, Function<String, String> functionForEveryItem) {
        return Stream.of(input.split(" ")).map(functionForEveryItem).toArray(String[]::new);
    }
}
