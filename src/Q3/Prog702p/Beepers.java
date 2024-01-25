package Q3.Prog702p;

public class Beepers extends Animal{
    private String specialWord;

    public Beepers(String name, String word, String sw) {
        super(name, word);
        specialWord = sw;
    }

    public String getSpecialWord() { return specialWord; }
}
