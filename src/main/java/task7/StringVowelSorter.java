package task7;


import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;

public class StringVowelSorter {
    private static final Pattern rule = Pattern.compile("(?i)[aeiou]");
    private static final Pattern ruleWithY = Pattern.compile("(?i)[aeiouy]");

    public static void main(String[] args) {
        String input = "ab abb abbb abbbb abbbbbb";

        System.out.println(Arrays.toString(sortByVowelPercent(input)));
    }

    public static String[] sortByVowelPercent(String input) {
        String[] resultArray = input.split(" ");
        Arrays.sort(resultArray, Comparator.comparingInt(StringVowelSorter::calculateVowelPercent));
        return resultArray;
    }

    public static int calculateVowelPercent(String inputWord) {
        int wordLength = inputWord.length();
        int countOfVowel = wordLength - rule.matcher(inputWord)
                .replaceAll("")
                .length();

        return (countOfVowel * 100 / wordLength);
    }

    public static void calculateVowelPercentWithY(String inputWord) {
        int wordLength = inputWord.length();
        int countOfVowel = ruleWithY.matcher(inputWord)
                .replaceAll("")
                .length();

        System.out.println(countOfVowel);
    }


}
