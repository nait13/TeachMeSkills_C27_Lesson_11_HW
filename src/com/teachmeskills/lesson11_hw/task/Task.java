package com.teachmeskills.lesson11_hw.task;

/*
The class contains methods for solving assigned problems.

The first method solves the problem of displaying the first two blocks of 4 digits on the screen in one line.

The second method solves the problem of displaying the document number on the screen, but blocks of three letters are replaced with ***

The third method solves the problem of displaying only one letter from the document number in the format yyy/yyy/y/y in lowercase.

The fourth method solves the problem of displaying letters from the document number in the format "Letters:yyy/yyy/y/y" in upper case (implementation using the StringBuilder class)

The fifth method checks whether the document number contains the sequence "abc" and whether the message contains or not in any case

The sixth method checks whether the document number begins with the sequence 555.

The seventh method checks whether the document number ends with the sequence 1a2b.

The findShortestAndLongestWord method finds the longest word and the shortest word in the string and, if there are several of them, prints the last one.

The "duplicateEachLetter" method doubles the letters in a string and prints the resulting string.
 */

public class Task {

    public static String completeTaskFirst(String string) {
        String[] arr = string.split("-");
        return arr[0] + arr[2];
    }

    public static String completeTaskTwo(String string) {
        String[] arr = string.split("-");
        return string.replace(arr[1], "***").replace(arr[3], "***");
    }

    public static String completeTaskThree(String string) {
        String[] arr = string.split("-");
        String str = (arr[1] + "/" + arr[3] + "/" + arr[4].substring(1, 2) + "/" + arr[4].substring(3)).toLowerCase();
        return str;
    }

    public static void completeTaskFour(String string) {
        StringBuilder str = new StringBuilder();
        str.append("Length:");
        str.append(completeTaskThree(string).toUpperCase());
        System.out.println(str);
    }

    public static void completeTaskFive(String string) {
        if (string.toLowerCase().contains("abc")) {
            System.out.println("Содержит последовательность абс");
        } else {
            System.out.println("Не содержит последовательность абс");
        }
    }

    public static void completeTaskSix(String string) {
        if (string.startsWith("555")) {
            System.out.println("Номер документа начинается на 555");
        } else {
            System.out.println("Документ не начинается на 555");
        }
    }

    public static void completeTaskSeven(String string) {
        if (string.endsWith("1a2b")) {
            System.out.println("Документ заканчивается на 1a2b");
        } else {
            System.out.println("Документ не заканчивается на 1a2b");
        }
    }

    public static void findShortestAndLongestWord(String string) {

        String[] arrString = string.split(" ");
        String minWord = arrString[0];
        String maxWord = arrString[0];

        for (int i = 0; i < arrString.length; i++) {
            if (maxWord.length() <= arrString[i].length()) {
                maxWord = arrString[i];
            } else if (minWord.length() >= arrString[i].length()) {
                minWord = arrString[i];
            }
        }

        System.out.println("МАКС СЛОВО => " + maxWord);
        System.out.println("МИН СЛОВО => " + minWord);
    }

    public static void duplicateEachLetter(String string) {
        StringBuilder strBl = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            strBl.append(string.charAt(i)).append(string.charAt(i));
        }
        System.out.println(strBl);

    }
}
