package com.leeni.sample;

import java.beans.Encoder;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CodingTest {
    public static void main(String[] args) {

        /* 1번 문제 */
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("str 입력:");
        String str = scanner.nextLine();
        System.out.print("n 입력:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }*/

        /* 2번 문제 */
        /*Scanner scanner = new Scanner(System.in);

        System.out.print("입력:");
        String myString = scanner.nextLine();

        String[] str = myString.split("x");
        System.out.print("[");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i].length());
            if (i < str.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");*/


        /* 3번 문제 */
        /*String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        System.out.print("[");
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                System.out.print("\"" +names[i] + "\"");
            }
            if ((i % 5 == 4) && (i != names.length - 1)) {
                System.out.print(",");
            }
        }
        System.out.print("]");*/

        /* 4번 문제 */
        /*int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        int result = 0;

        List<Integer> list = Arrays.stream(numbers).boxed().toList();

        for (int i = 1; i < 10; i++) {
            if (!list.contains(i)) {
                result += i;
            }
        }

        System.out.println(result);*/

        /* 5번 문제 */
        /*
        String s = "-1 -2 -3 -4";
        String[] sArr = s.split(" ");

        int min = Integer.parseInt(sArr[0]);
        int max = Integer.parseInt(sArr[0]);

        for (int i = 0; i < sArr.length; i++) {
            int number = Integer.parseInt(sArr[i]);
            if (number < min) min = number;
            if (number > max) max = number;
        }

        System.out.println("\"" + min + " " + max + "\"");*/
    }
}
