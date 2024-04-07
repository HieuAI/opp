import java.util.HashSet;

// CS108 HW1 -- String static methods

public class StringCode {

    /**
     * Given a string, returns the length of the largest run.
     * A run is a series of adjacent chars that are the same.
     * @param str max
     * @return max run length
     */
    public static int maxRun(String str) {
        if (str == null ) {
            return 0;
        }
        int max = 1, count = 1;
        for (int i =1;i < str.length(); i++){
            if (str.charAt(i-1) == str.charAt(i)) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }
        return max;
    }


    /**
     * Given a string, for each digit in the original string,
     * replaces the digit with that many occurrences of the character
     * following. So the string "a3tx2z" yields.
     * @param str dad
     * @return blown up string
     */
    public static String blowup(String str) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            char b = str.charAt(i+1);
            if (('0' <= a && a <= '9') && ((b >= 'a' && b <= 'z') || (b >= 'A' && b <= 'Z'))) {
                for(int j =1;j<=Character.getNumericValue(a);j++) {
                    temp.append(b);
                }
            } else {
                temp.append(a);
            }
        }
        return temp.toString();
    }



    /**
     /**
     * Given 2 strings, consider all the substrings within them
     * of length len. Returns true if there are any such substrings
     * which appear in both strings.
     * Compute this in linear time using a HashSet. Len will be 1 or more.
     *
     */
    public static boolean stringIntersect(String a, String b, int len) {
        HashSet<String> str = new HashSet<>();
        for (int i = 0; i <= a.length() - len; i++) {
            str.add(a.substring(i, i + len));
        }

        for (int i = 0; i <= b.length() - len; i++) {
            if (str.contains(b.substring(i, i + len))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
