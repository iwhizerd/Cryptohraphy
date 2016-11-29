
public class Transposition {
    static String cypher(String s, int dim) {

        int columnes = (s.length()+1 /dim);

        char arr [][] = new char [columnes][dim];

        int posicio = 0;

        for (int x = 0; x < arr[x].length; x++) {
            for (int y = 0; y < arr.length; y++) {
                arr [y][x] = s.charAt(posicio);
                posicio ++;
            }
        }


    }

    static String decypher(String s, int dim) {
        return null;
    }


    static String cypher(String s, String key) {
        return null;
    }

    static String decypher(String s, String key) {
        return null;
    }
}
