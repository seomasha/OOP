package OOP.WEEK6LABS.HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary{

    private Map<String, String> dictionary = new HashMap<>();

    public void add(String word, String translated) {
        dictionary.put(word, translated);
    }
    public String translate(String word) {
        if(dictionary.containsKey(word)) {
            return dictionary.get(word);
        }
        return null;
    }

    public int amountOfWords() {
        return dictionary.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translations = new ArrayList<>();

        for(String key : dictionary.keySet()) {
            translations.add(key + " = " + dictionary.get(key));
        }

        return translations;
    }
}
