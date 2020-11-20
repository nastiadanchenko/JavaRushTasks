package com.javarush.task.task34.task3403;

/* 
Разложение на множители с помощью рекурсии
*/


public class Solution {
    public void recurse(int n) {
        int i = 2;

      while (n>1) {
          if (n % i == 0) {
              System.out.print(i+" ");
              recurse(n / i);

              break;
          } else i++;
      }

}

    public static void main(String[] args) {
        Solution s = new Solution();
        s.recurse(132);
    }
}
