
public class Transposition {
    static String cypher(String s, int dim) {

        StringBuilder sb = new StringBuilder();

        int columnes = (int) (Math.ceil(s.length() / (double) dim));
        //int columnes = (s.length() / dim);

        //if (columnes % dim != 0) {
        //   columnes += 1;
        // }

        char arr [][] = new char [columnes][dim];

        int posicio = 0;

        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[0].length; y++) {
                if (posicio == s.length()) {
                    arr[x][y] = '*';
                    continue;
                }
                arr[x][y] = s.charAt(posicio);
                posicio++;
            }
        }
        for (int a = 0; a < arr[0].length; a++) {
            for (char[] anArr : arr) {
                if (anArr[a] != '*') {
                    sb.append(anArr[a]);
                }
            }
        }
        return sb.toString();
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
