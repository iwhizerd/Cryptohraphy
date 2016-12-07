import java.lang.reflect.Array;
import java.util.Arrays;

public class Transposition {
    static String cypher(String s, int dim) {

        StringBuilder sb = new StringBuilder();

        //int columnes = (int) (Math.ceil(s.length() / (double) dim));
        int columnes = (s.length() / dim);

        if (s.length() % dim != 0) {
            columnes += 1;
        }

        char arr [][] = new char [columnes][dim];

        //Variable per mourernos dins String s.
        int posicio = 0;

        //Bucle que s'encarrega de ficar els valors en fila ex ABCD --> AB,CD
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[0].length; y++) {
                if (posicio == s.length()) {
                    //arr[x][y] = '*';
                    continue;
                }
                arr[x][y] = s.charAt(posicio);
                posicio++;
            }
        }
        //S'encarrega de pasar l'array a un string
        for (int a = 0; a < arr[0].length; a++) {
            for (char[] anArr : arr) {
                //Condicional que fica els chars que no siguin el comodi.
                if (anArr[a] != 0) {
                    sb.append(anArr[a]);
                }
            }
        }
        return sb.toString();
    }

    static String decypher(String s, int dim) {

        StringBuilder sb = new StringBuilder();

        int files = s.length() / dim;

        if (s.length() % dim != 0) {
            files += 1;
        }

        char arr[][] = new char[files][dim];

        int posicio = 0;

        int espaisbuits = (files * dim) - s.length();

        for (int x = 0; x < arr[0].length; x++) {
            for (int y = 0; y < arr.length; y++) {
                //Condicional que fa que si arribam a la darrera fila i quan hagi un espai buit ho salti.
                if (y == arr.length - 1 && x >= (dim - espaisbuits)) {
                    // arr[y][x] = '*';
                    continue;
                }
                arr[y][x] = s.charAt(posicio);
                posicio++;
            }
        }
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[0].length; b++) {
                if (arr[a][b] != 0)
                    sb.append(arr[a][b]);
            }
        }
        return sb.toString();
    }


    static String cypher(String s, String key) {

        StringBuilder sb = new StringBuilder();

        int files = s.length() / key.length();

        if (s.length() % key.length() != 0) {
            files += 1;
        }

        int ordenat[] = index(key);

        char arr[][] = new char[files][key.length()];

        //Variable per mourernos dins String s.
        int posicio = 0;

        //Bucle que s'encarrega de ficar els valors en fila ex ABCD --> AB,CD
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[0].length; y++) {
                if (posicio == s.length()) {
                    //arr[x][y] = '*';
                    continue;
                }
                arr[x][y] = s.charAt(posicio);
                posicio++;
            }
        }


        for (int i = 0; i < key.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][ordenat[i]] != 0) {
                    sb.append(arr[j][ordenat[i]]);
                }
            }
        }

        return sb.toString();
    }

    static String decypher(String s, String key) {
        return null;
    }

    static int[] index(String key) {


        char[] ordenateKey = key.toCharArray();

        int[] ordenateIndex = new int[key.length()];

        Arrays.sort(ordenateKey);

        int count = 0;
        for (int i = 0; i < key.length(); i++) {
            for (int j = 0; j < key.length(); j++) {
                if (i > 0 && i < key.length()) {
                    if (ordenateKey[i] == ordenateKey[(i - 1)]) {
                        int r = (ordenateIndex[(i - 1)] + 1);
                        for (int k = r; k < key.length() - 1; k++) {
                            if (ordenateKey[i] == key.charAt(k)) {
                                ordenateIndex[count] = k;
                                count++;
                                i++;
                                break;
                            }
                        }
                    }
                }
                if (ordenateKey[i] == key.charAt(j)) {
                    ordenateIndex[count] = j;
                    count++;
                    break;
                }
            }

        }

        return ordenateIndex;
    }
}