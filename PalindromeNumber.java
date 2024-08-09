package LeetCode;

public class PalindromeNumber {

    /**
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {

        String cadenaNumero = Integer.toString(x);

        int longitud = cadenaNumero.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (cadenaNumero.charAt(i) != cadenaNumero.charAt(longitud - i - 1)){ // si 1 != 2 <- 3-0-1
                return false; // no es palindrom
            }
        }

        return true; // és palindrom
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        int numero = 211;

        if (isPalindrome(numero)){
            System.out.println("És palindrom");
        }else {
            System.out.println("No es palindrom");
        }
    }
}
