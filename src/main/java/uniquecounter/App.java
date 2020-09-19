package uniquecounter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        UniqueWordCounter unique = new UniqueWordCounter();


        unique.addWord(map, "Andrey");
        unique.addWord(map, "Pavel");
        unique.addWord(map, "Pavel");
        unique.addWord(map, "Pavel");
        unique.addWord(map, "Pavel");
        unique.addWord(map, "Pavel");
        unique.addWord(map, "Victor");
        unique.addWord(map, "Victor");
        unique.addWord(map, "Victor");
        unique.addWord(map, "Victor");
        unique.addWord(map, "Victor");
        unique.addWord(map, "Elena");
        unique.addWord(map, "Elena");

        unique.printWordsFrequency(map);

//Реализация поиска часто добавляемого при помощи метода класса Collections
        unique.getMostFrequentWordWithMethod(map);

//Реализация поиска часто добавляемого "вручную"
        unique.getMostFrequentWord(map, unique.findMaxValue(map));

    }
}
