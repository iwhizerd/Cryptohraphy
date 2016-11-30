import java.util.Scanner;

/**
 * Created by Whizerd on 30/11/16.
 */
public class Tp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int dim = sc.nextInt();

        int columnes = (s.length() / dim);

        if (columnes % dim == 1) {
            columnes += 1;
        }

        char arr[][] = new char[columnes][dim];

        int posicio = 0;

        for (int x = 0; x < arr[0].length; x++) {
            System.out.println("----------------------");
            for (int y = 0; y < arr.length; y++) {
                if (posicio >= s.length()) {
                    arr[y][x] = '*';
                    //posicio++;
                    System.out.println(arr[y][x]);
                    break;
                }
                arr[y][x] = s.charAt(posicio);
                posicio++;
                // if (posicio > s.length()){
                //   arr [y][x] = '*';
                // posicio++;
                // }
                System.out.println(arr[y][x]);
            }
        }
        for
    }
}
