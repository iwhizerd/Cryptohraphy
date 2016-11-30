
public class Transposition {
    static String cypher(String s, int dim) {

        StringBuilder sb = new StringBuilder();

        int columnes = (s.length() / dim);

        if (columnes % dim == 1) {
            columnes += 1;
        }

        char arr [][] = new char [columnes][dim];

        int posicio = 0;

        for (int x = 0; x < arr[0].length; x++) {
            for (int y = 0; y < arr.length; y++) {
                if (posicio < s.length()) {
                    arr[y][x] = '*';
                    posicio++;
                }
                arr [y][x] = s.charAt(posicio);
                posicio ++;


            }
        }

        for (int a = 0; a < arr[0].length; a++) {
            for (int b = 0; b < arr.length; b++) {
                sb.append(arr[b][a]);
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
