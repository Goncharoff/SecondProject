import project.Parser;

public class Application {
    public static void main(String[] args) {
    String text = "Object-oriented programming (OOP) is a programming paradigm based on the concept of \"objects\", which can contain data, in the form of fields (often known as attributes), and code, in the form of procedures (often known as methods). A feature of objects is an object's procedures that can access and often modify the data fields of the object with which they are associated (objects have a notion of \"this\" or \"self\"). In OOP, computer programs are designed by making them out of objects that interact with one another. OOP languages are diverse, but the most popular ones are class-based, meaning that objects are instances of classes, which also determine their types.\n" +
            "\n" +
            "Many of the most widely used programming languages (such as C++, Object Pascal, Java, Python, etc.) are multi-paradigm and they support object-oriented programming to a greater or lesser degree, typically in combination with imperative, procedural programming. Significant object-oriented languages include Java, C++, C#, Python, PHP, JavaScript, Ruby, Perl, Object Pascal, Objective-C, Dart, Swift, Scala, Common Lisp, MATLAB, and Smalltalk. ";

    Parser parser = new Parser();
    parser.split(text);
    }
}
