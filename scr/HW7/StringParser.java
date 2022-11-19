package HW7;


import java.util.*;

public class StringParser {
    private String value;

    public StringParser(String value) {
        this.value = value;
    }

    public Map<String, Integer> getAllLetters() {
        Map<String, Integer> lettersCount = new HashMap<>();
        String[] split = value.replaceAll("[^a-zA-Z]", "").split("");
        Set<String> keySet = new HashSet<>(Arrays.asList(split));
        for (var singleKey : keySet) {
            lettersCount.put(singleKey, 0);
        }
        for (var singleStringChar : split) {
            if (lettersCount.containsKey(singleStringChar)) {
                lettersCount.replace(singleStringChar, lettersCount.get(singleStringChar),
                        lettersCount.get(singleStringChar) + 1);
            }
        }
        return lettersCount;
    }

    public int getCountOfAllLetters() {
        int count = 0;
        String[] stringArray = value.split("");
        for (var singleString : stringArray) {
            if (singleString.matches("[a-zA-Z]")) {
                count++;
            }
        }
        return count;
    }

    public int getCountOfSpaces() {
        int count = 0;
        String[] stringArray = value.split("");
        for (var singleString : stringArray) {
            if (singleString.matches(" ")) {
                count++;
            }
        }
        return count;
    }

    public int getCountOfNumbers() {
        int count = 0;
        String[] stringArray = value.split("");
        for (var singleString : stringArray) {
            if (singleString.matches("^\\d+$")) {
                count++;
            }
        }
        return count;
    }

}
