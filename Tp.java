import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Whizerd on 30/11/16.
 */
public class Tp {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String key = sc.nextLine();

        int files = s.length() / key.length();

        if (s.length() % key.length() != 0) {
            files += 1;
        }

        int ordenat[] = index(key);

        for (int i = 0; i < ordenat.length; i++) {
            System.out.println(ordenat[i]);
        }

        char arr[][] = new char[files][key.length()];

        //Variable per mourernos dins String s.
        int posicio = 0;

        //Bucle que s'encarrega de ficar els valors en fila ex ABCD --> AB,CD
        for (int x = 0; x < arr.length; x++) {
            System.out.println("--------");
            for (int y = 0; y < arr[0].length; y++) {
                if (posicio == s.length()) {
                    //arr[x][y] = '*';
                    continue;
                }
                arr[x][y] = s.charAt(posicio);
                posicio++;
                System.out.print(arr[x][y] + " ,");
            }
        }


        for (int a = 0; a < arr[0].length; a++) {
            for (int b = 0; b < arr.length; b++) {
                if (arr[b][ordenat[a]] != 0) {
                    sb.append(arr[b][ordenat[a]]);
                }
            }
        }


        //S'encarrega de pasar l'array a un string
        //  for (int a = 0; a < ordenat.length; a++) {
        //  for (int b = 0; b < arr.length; b++) {
        //Condicional que fica els chars que no siguin el comodi.
        //  if (arr[ordenat[a]][b] != 0) {
        //sb.append(arr[ordenat[a]][b]);
        // }
        // }

        // }

        System.out.println(sb);

    }

    static int[] index(String key) {

        char[] ordenateKey = key.toCharArray();

        int[] ordenateIndex = new int[key.length()];

        Arrays.sort(ordenateKey);

        int count = 0;
        for (int i = 0; i < key.length(); i++) {
            for (int j = 0; j < key.length(); j++) {
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