import java.text.Normalizer;

public class Vigenere {

    static String encode(String s, String password) {
        StringBuilder sb = new StringBuilder();


        sb.append(normalize(s));


        password = normalize(password);

        //Bucle que s'encarrega de codificar el string amb la password.

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
    static String normalize(String s){

        StringBuilder sb = new StringBuilder();
        sb.append(s.toUpperCase());

        for (int i = 0; i <sb.length() ; i++) {

            if (sb.charAt(i) == 'Ó' ||  sb.charAt(i) == 'Ò'){
                sb.setCharAt(i, 'O');
            }
            if (sb.charAt(i) == 'É' ||  sb.charAt(i) == 'È'){
                sb.setCharAt(i, 'E');
            }
            if (sb.charAt(i) == 'Ú' ||  sb.charAt(i) == 'Ù'){
                sb.setCharAt(i, 'U');
            }
            if (sb.charAt(i) == 'Í' ||  sb.charAt(i) == 'Ì'){
                sb.setCharAt(i, 'I');
            }
            if (sb.charAt(i) == 'Á' ||  sb.charAt(i) == 'À'){
                sb.setCharAt(i, 'A');
            }
        }

        return sb.toString();
    }
}


