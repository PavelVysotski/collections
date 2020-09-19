package uniqueword;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        Set<String> vocabulary = new HashSet<>();

        UniqueWordVocabulary voc = new UniqueWordVocabulary();

        voc.addWord(vocabulary,"computer");
        voc.addWord(vocabulary, "smartphone");
        voc.addWord(vocabulary, null);
        voc.addWord(vocabulary, "smartphone");
        voc.addWord(vocabulary, "monitor");

        voc.printVocabulary(vocabulary);
        System.out.println("Число уникальных слов равно: " + voc.getWordsCount(vocabulary));


    }
}
