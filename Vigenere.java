

public class Vigenere {

    static String encode(String s, String password) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.toUpperCase());


        password = password.toUpperCase();

        //Bucle que ens ficara el valor de cada lletra de la password dins un array.

        int posicio = 0;
        for (int i = 0; i < sb.length(); i++) {
            int r = sb.charAt(i) + (password.charAt(posicio) - 64);

            if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z' ) {
                //Aixo els que ens fara ens mirarnos si r que es la suma del caracter i delta supera els valors possibles
                posicio++;
                while (r > 'Z') {
                    r -= 26;
                }
                if (posicio == password.length()){
                    posicio = 0;
                }
                sb.setCharAt(i, (char) r);
            }

        }return sb.toString();
    }
    static String decode(String s, String password) {
        return null;
    }
}


