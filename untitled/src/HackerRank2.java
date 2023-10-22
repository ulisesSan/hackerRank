import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class HackerRank2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Stack<Integer> number = new Stack<Integer>();
        for(int i = 0; i < 3; i++){
            number.add(scan.nextInt());
        }
        scan.close();
        // Complete this line
        // Complete this line

        System.out.println(number.get(0) + "\n" + number.get(1) + "\n" + number.get(2));
        // Complete this line
        // Complete this line
    }
}
