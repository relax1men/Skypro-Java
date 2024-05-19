package pro.sky;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("example", "examp", "example", "exam", "examp"));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        task1(nums);
        task2(nums);
        task3(words);
        task4(strings);
    }

    private static void task1(List<Integer> list) {
        System.out.println("задание 1");
        for (Integer number : list) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

    private static void task2(List<Integer> list) {
        System.out.println("задание 2");
        Set<Integer> set = new TreeSet<>(list);
        for (Integer number : set) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    private static void task3(List<String> list) {
        System.out.println("задание 3");
        Set<String> set = new HashSet<>(list);
        for (String word : set) {
            System.out.println(word);
        }
    }

    private static void task4(List<String> list) {
        System.out.println("задание 4");
        Set<String> strings = new HashSet<>(list);
        for (String string : strings) {
            System.out.println(string + " повторяется " + Collections.frequency(list, string));
        }
    }
}
