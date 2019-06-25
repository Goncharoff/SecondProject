package project;

public class Parser implements Splitter {
  private Sentence sentence = new Sentence();
  private Word word = new Word();
  private Symbol symbol = new Symbol();
  private Letter letter = new Letter();

  @Override
  public String[] split(String source) {
    String[] sentences = sentence.split(source);
    prettySentencePrinting(sentences);
    String[] words = word.split(source);
    prettyWordsPrinting(words);
    String[] symbols = symbol.split(source);
    prettySymbolsPrinting(symbols);
    String[] letters = letter.split(source);
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
    int divider = 25;

    for (int i = 0; i < words.length; i++) {
      System.out.print(words[i] + " ");
      if (i % divider == 0 && i != 0) System.out.println();
    }

    System.out.println();

  }

  private void prettySymbolsPrinting(String[] symbols) {
    System.out.println("There are " + symbols.length + " symbols in text.");
    int divider = 100;

    for (int i = 0; i < symbols.length; i++) {
      System.out.print(symbols[i] + " ");
      if (i % divider == 0 && i != 0) System.out.println();
    }
    System.out.println();

  }

  private void prettyLetterPrinting(String[] letters) {
    int divider = 100;

    System.out.println("There are " + letters.length + " letters");
    for (int i = 0; i < letters.length; i++) {
      System.out.print(letters[i] + " ");
      if (i % divider == 0 && i != 0) System.out.println();
    }

    System.out.println();

  }
}
