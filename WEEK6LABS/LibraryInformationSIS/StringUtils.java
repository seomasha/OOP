package OOP.WEEK6LABS.LibraryInformationSIS;

import java.util.Locale;

public class StringUtils {
    public static boolean included(String word, String searched) {
        String newSearchedWord = searched.trim().toUpperCase();

        if(word.contains(newSearchedWord)) {
            return true;
        }

        return false;
    }
}
