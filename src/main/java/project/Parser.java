package project;

public class Parser implements Splitter {

    @Override
    public String[] split(String source) {
        String[] sentences = SpltterFabricMethod.provideSplitter("sentence").split(source);
        prettySentencePrinting(sentences);
        String[] words = SpltterFabricMethod.provideSplitter("word").split(source);
        prettyWordsPrinting(words);
        String[] symbols = SpltterFabricMethod.provideSplitter("symbol").split(source);
        prettySymbolsPrinting(symbols);
        String[] letters = SpltterFabricMethod.provideSplitter("letter").split(source);
        prettyLetterPrinting(letters);

        return letters;
    }

    private void prettySentencePrinting(String[] sentences) {
        for (int i = 0; i < sentences.length; i++) {
            System.out.println("Sentence " + (i + 1) + " " + sentences[i]);
        }

        System.out.println();
    }

    private void prettyWordsPrinting(String[] words) {
        System.out.println("There are " + words.length + " words in text.");
        printAllElementByDivider(words, 25);
    }

    private void prettySymbolsPrinting(String[] symbols) {
        System.out.println("There are " + symbols.length + " symbols in text.");
        printAllElementByDivider(symbols, 100);
    }

    private void prettyLetterPrinting(String[] letters) {
        System.out.println("There are " + letters.length + " letters");
        printAllElementByDivider(letters, 100);

    }

    private void printAllElementByDivider(String[] arrayToPrint, int divider) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i] + " ");
            if (i % divider == 0 && i != 0) System.out.println();
        }
        System.out.println();
    }
}
