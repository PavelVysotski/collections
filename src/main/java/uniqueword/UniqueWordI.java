package uniqueword;

import java.util.Set;

public interface UniqueWordI {

    void addWord(Set<String> vocabulary, String word);
    int getWordsCount(Set<String> vocabulary);
    void printVocabulary(Set<String> vocabulary);
}
