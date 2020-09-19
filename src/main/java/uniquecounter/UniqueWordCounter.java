package uniquecounter;

import java.util.Collections;
import java.util.Map;

public class UniqueWordCounter implements UniqueCounter {


    @Override
    public void addWord(Map<String, Integer> uniqueWords, String word) {
        if (uniqueWords.containsKey(word)) {
            int value = uniqueWords.get(word);
            value++;
            uniqueWords.put(word, value);
            return;
        }
        uniqueWords.put(word, 1);
    }

    @Override
    public int findMaxValue(Map<String, Integer> uniqueWords) {
        int[] value = new int[uniqueWords.size()];
        int i = 0;
        for (Map.Entry<String, Integer> val : uniqueWords.entrySet()) {
            value[i] = val.getValue();
            i++;
        }
        int max = value[0];
        for (int k = 0; k < value.length; k++) {
            if (value[k] > max) {
                max = value[k];
            }
        }
        return max;
    }

    @Override
    public void getMostFrequentWord(Map<String, Integer> uniqueWords, int max) {
        for (Map.Entry<String, Integer> val : uniqueWords.entrySet()) {
            if (val.getValue() == max) {
                System.out.println("Чаще всех добавлен элемент: " + val.getKey());
            }
        }
    }

    @Override
    public void getMostFrequentWordWithMethod(Map<String, Integer> uniqueWords) {
        int max = Collections.max(uniqueWords.values());
        for (Map.Entry<String, Integer> val : uniqueWords.entrySet()) {
            if (val.getValue() == max) {
                System.out.println("Чаще всех добавлен элемент: " + val.getKey());
            }
        }
    }

    @Override
    public void printWordsFrequency(Map<String, Integer> uniqueWords) {
        System.out.println("Вывод: ");
        for (Map.Entry<String, Integer> map : uniqueWords.entrySet()) {
            System.out.println("Элемент " + map.getKey() + " добавлен " + map.getValue() + " раз(а).");
        }
        System.out.println();
    }
}
