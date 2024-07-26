

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

    public class LongestSubsWithoutRep {
        public int lengthOfLongestSubstring(String str) {
            int n = str.length();
            int maxLength = 0;
            int left = 0;
            Set<Character> set = new HashSet<>();

            for (int right = 0; right < n; right++) {
                while (set.contains(str.charAt(right))) {
                    set.remove(str.charAt(left));
                    left++;
                }
                set.add(str.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            }

            return maxLength;
        }
    }
