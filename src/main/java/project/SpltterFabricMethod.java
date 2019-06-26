package project;

public class SpltterFabricMethod {

    private SpltterFabricMethod() {
    }

    public static Splitter provideSplitter(String name) {
        switch (name) {
            case "letter":
                return new Letter();
            case "sentence":
                return new Sentence();
            case "symbol":
                return new Symbol();
            case "word":
                return new Word();
            default:
                throw new IllegalArgumentException("There is no  " + name + " splitter.");
        }
    }
}
