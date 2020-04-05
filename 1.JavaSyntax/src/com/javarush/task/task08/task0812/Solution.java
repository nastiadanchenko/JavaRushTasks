package task08.task0812;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int max = 1;
        int current = 1;
        for (int i = 0; i <10; i++) {
            list.add(scanner.nextInt());
        }
        for (int i = 1; i <list.size() ; i++) {
            if (list.get(i).equals(list.get(i-1))){current++;
                if(current>max){max = current;
                }

            }else current = 1;
        }

        System.out.println(max);

    }
}