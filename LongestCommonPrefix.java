package LeetCode;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int minLenght = Math.min(prefix.length(), strs[i].length());

            int j;
            for (j = 0; j < minLenght; j++) {
                if(prefix.charAt(j) != strs[i].charAt(j)){
                    break;
                }
            }
            prefix = prefix.substring(0, j);

            if (prefix.isEmpty()) {
                return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args){
        String[] array = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(array));
    }

}

