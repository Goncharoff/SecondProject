package task15;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class LettersRemover {

    public static void main(String[] args) {
        String input = "Ittiiiiiiiii couzzzcccc shhhsiishh";

        System.out.println(Arrays.toString(deletionInArray(input, LettersRemover::deleteFirstLetterValue)));
        System.out.println(Arrays.toString(deletionInArray(input, LettersRemover::deleteLastLetterValue)));

    }

    public static String deleteFirstLetterValue(String inputWord) {
        if (inputWord == null || inputWord.length() == 0) {
            throw new IllegalArgumentException("Word can not be null or its length should be more then 0");
        }

        String firstLetter = inputWord.substring(0, 1);
        String regexToRemoveByChar = "(?i)" + firstLetter;

        return inputWord.length() > 1 ? firstLetter + inputWord.substring(1).replaceAll(regexToRemoveByChar, "") : inputWord;
    }

    public static String deleteLastLetterValue(String inputWord) {
        if (inputWord == null || inputWord.length() == 0) {
            throw new IllegalArgumentException("Word can not be null or its length should be more then 0");
        }
        int lastLeterIndex = inputWord.length() - 1;
        String regexToRemoveByChar = "(?i)" + inputWord.substring(lastLeterIndex);
        return inputWord.length() > 1 ?  inputWord.replaceAll(regexToRemoveByChar, "") + inputWord.charAt(lastLeterIndex) : inputWord;
    }

    public static String[] deletionInArray(String input, Function<String, String> functionForEveryItem) {
        return Stream.of(input.split(" ")).map(functionForEveryItem).toArray(String[]::new);
    }
}
