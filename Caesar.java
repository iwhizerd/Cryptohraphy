
public class Caesar {

    static String cypher(String s, int delta ) {
        //Definim un string builder on ficarem el string que ens pasen.
        StringBuilder sb = new StringBuilder();
        //El ficarem dins string Builder per poder modelarlo sense cap problema.
        sb.append(s.toUpperCase());

        int nVocals = 26;

        //Farem una condicio per el delta.

        while (delta > nVocals){
            delta -= nVocals;
        }

        //Farem un bucle on mos mourem per String que manipularem
        for (int i = 0; i < sb.length(); i++) {

            int r =  sb.charAt(i) + delta;
            //Feim un condicional perque domés afecti als valors de sa A a sa Z .
            if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z' ){
                //Aixo els que ens fara ens mirarnos si r que es la suma del caracter i delta supera els valors possibles
                if (r > 'Z'){
                    r -= nVocals;
                }

                sb.setCharAt(i, (char) r);

            }


        }return  sb.toString();
    }

    static String decypher(String s, int delta) {
        //Definim un String Builder
        StringBuilder sb = new StringBuilder();

        sb.append(s.toUpperCase());

        int nVocals = 26;

        //Farem una condicio per el delta.

        while (delta > nVocals) {
            delta -= nVocals;
        }

        //Farem un bucle on mos mourem per String que manipularem
        for (int i = 0; i < sb.length(); i++) {

            int r = sb.charAt(i) - delta;
            //Feim un condicional perque domés afecti als valors de sa A a sa Z .
            if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') {
                //Aixo els que ens fara ens mirarnos si r que es la suma del caracter i delta supera els valors possibles
                if (r < 'A') {
                    r += nVocals;
                }

                sb.setCharAt(i, (char) r);

            }
        }return sb.toString();
    }
    static String magic(String s) {
        String s2 = s.toUpperCase() ;

        for (int i = 0;  i < 26 ; i++) {
          s2 = decypher(s , i);
        if (s2.contains(" EL ") || s2.contains(" DE ") || s2.contains(" LA ") || s2.contains(" DE ") || s2.contains(" SE "))
            break;
        }
        return s2;
    }


}
