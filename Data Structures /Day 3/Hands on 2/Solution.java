import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<>();
        int q = in.nextInt();
        while (q-- > 0) {
            int type = in.nextInt();
            if (type == 1) {
                l.add(in.nextInt());
            }
            else if (type == 2) {
                if (!l.isEmpty()) {
                    l.pollFirst();
                }
            }
            else {
                System.out.println(l.getFirst());
            }
        }
    }
}