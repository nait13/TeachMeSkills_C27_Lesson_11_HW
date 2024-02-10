package com.teachmeskills.lesson11_hw.runner;

import com.teachmeskills.lesson11_hw.task.Task;

/**
 * This class runs methods from the Task class
 */

public class Runner {
    public static void main(String[] args) {
        String documentNumber = "1233-yOm-5678-cRa-1a2b";
        String str = "Строка произвольной длины, произвольными словами ";

        System.out.println(Task.completeTaskFirst(documentNumber));
        System.out.println(Task.completeTaskTwo(documentNumber));
        System.out.println(Task.completeTaskThree(documentNumber));
        Task.completeTaskFour(documentNumber);
        Task.completeTaskFive(documentNumber);
        Task.completeTaskSix(documentNumber);
        Task.completeTaskSeven(documentNumber);
        Task.findShortestAndLongestWord(str);
        Task.duplicateEachLetter("Hello");
    }
}
