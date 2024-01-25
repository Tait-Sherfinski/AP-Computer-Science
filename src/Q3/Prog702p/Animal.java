package Q3.Prog702p;

public class Animal implements names {
    private String myName;
    private String myWord;

    public Animal(String name, String word) {
        myName = name;
        myWord = word;
    }

    public String getName() { return myName; }
    public String getWord() { return myWord; }
    public String getWordName() { return myName + " " + myWord; }
}
