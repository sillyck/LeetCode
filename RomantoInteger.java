package LeetCode;

public class RomantoInteger {

    public static void romanToInt(String s) {
        int numInteger = 0, i = 0;
        String romanString, romanString1;

        while (i < s.length()) {
            // Restar
            if (i < s.length() - 1) {
                romanString1 = s.substring(i, i + 2);
                switch (romanString1) {
                    case "IV":
                        numInteger += 4;
                        i += 2;
                        continue;
                    case "IX":
                        numInteger += 9;
                        i += 2;
                        continue;
                    case "XL":
                        numInteger += 40;
                        i += 2;
                        continue;
                    case "XC":
                        numInteger += 90;
                        i += 2;
                        continue;
                    case "CD":
                        numInteger += 400;
                        i += 2;
                        continue;
                    case "CM":
                        numInteger += 900;
                        i += 2;
                        continue;
                }
            }
            // Numeros simples
            romanString = String.valueOf(s.charAt(i));
            switch (romanString) {
                case "I":
                    numInteger += 1;
                    break;
                case "V":
                    numInteger += 5;
                    break;
                case "X":
                    numInteger += 10;
                    break;
                case "L":
                    numInteger += 50;
                    break;
                case "C":
                    numInteger += 100;
                    break;
                case "D":
                    numInteger += 500;
                    break;
                case "M":
                    numInteger += 1000;
                    break;
            }
            i++;
        }

        System.out.println(numInteger);
    }

    public static void main(String[] args){
        String numero = "MCMXCIV";

        romanToInt(numero);
    }
}
