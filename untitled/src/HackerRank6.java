import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class HackerRank6 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine().trim());

        scan.close();

        for(int i = 1; i <= 10; i ++){
            System.out.println(N+" x "+i+" = " + (N*i));
        }
    }
}
