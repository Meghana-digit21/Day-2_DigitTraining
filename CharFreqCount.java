
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharFreqCount {
    public Map<Character, Integer> getCharacterFrequency(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        return frequencyMap;
    }
}
 