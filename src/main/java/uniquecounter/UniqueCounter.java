package uniquecounter;

import java.util.Map;

public interface UniqueCounter {

    void addWord(Map<String, Integer> uniqueWords, String word);
    void getMostFrequentWord(Map<String, Integer> uniqueWords, int max);
    int findMaxValue(Map<String, Integer> uniqueWords);
    void printWordsFrequency(Map<String, Integer> uniqueWords);
    void getMostFrequentWordWithMethod(Map<String, Integer> uniqueWords);


}
