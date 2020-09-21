package uniqueword;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.spi.AbstractResourceBundleProvider;

public class UniqueWordVocabulary implements UniqueWordI {

    public UniqueWordVocabulary() {
    }

    @Override
    public void addWord(Set<String> vocabulary, String word) {
        if (word == null) {
            System.out.println("'null' не соответствует условиям и не добавлено.");
            return;
        } else {
            vocabulary.add(word);
        }
    }

    @Override
    public int getWordsCount(Set<String> vocabulary) {
        return vocabulary.size();
    }

    @Override
    public void printVocabulary(Set<String> vocabulary) {
        System.out.println("Вывод коллекции: ");
        for (String word : vocabulary) {
            System.out.println(word + " ");
        }
        System.out.println();
    }
}
