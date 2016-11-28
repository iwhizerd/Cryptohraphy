

public class Vigenere {

    static String encode(String s, String password) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.toUpperCase());

        int[] ar = new int[s.length()];

        int n = 0;

        //Bucle que ens ficara el valor de cada lletra de la password dins un array.

        for (int i = 0; i < s.length(); i++) {
            ar[i] = password.charAt(n) - 64;
            n++;
            if (n == password.length()) {
                n = 0;
            }
        }
        for (int i = 0; i < sb.length(); i++) {
            int posicio = 0;
            int r = sb.charAt(i) + ar[posicio];

            if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z' ) {
                //Aixo els que ens fara ens mirarnos si r que es la suma del caracter i delta supera els valors possibles
                posicio++;
                while (r > 'Z') {
                    r -= 26;
                }
                sb.setCharAt(i, (char) r);
            }

        }return sb.toString();
    }
    static String decode(String s, String password) {
        return null;
    }
}


