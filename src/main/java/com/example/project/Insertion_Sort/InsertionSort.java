package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int indexOne = 0;
        int indexTwo = 1;
        for (int i = 1; i < elements.length; i++) {
            int originalOne = indexOne;
            int originalTwo = indexTwo;
            while (elements[indexTwo] < elements[indexOne]) {
                int swap = elements[indexTwo];
                elements[indexTwo] = elements[indexOne];
                elements[indexOne] = swap;
                if (indexTwo > 0) {
                    indexTwo--;
                }
                if (indexOne > 0) {
                    indexOne--;
                }
            }
            indexOne = originalOne + 1;
            indexTwo = originalTwo + 1;
        }
        return elements;
    }

   
    public static void selectionSort(int[] elements) {
        for (int i = 0; i < elements.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[j] < elements[minIndex]) {
                    minIndex = j;
                }
            }
            int min = elements[minIndex];
            int swap = elements[i];
            elements[minIndex] = swap;
            elements[i] = min;
        }
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int indexOne = 0;
        int indexTwo = 1;
        for (int i = 1; i < words.size(); i++) {
            int originalOne = indexOne;
            int originalTwo = indexTwo;
            while (words.get(indexTwo).compareTo(words.get(indexOne)) < 0) {
                String swap = words.get(indexTwo);
                words.set(indexTwo, words.get(indexOne));
                words.set(indexOne, swap);
                if (indexTwo > 0) {
                    indexTwo--;
                }
                if (indexOne > 0) {
                    indexOne--;
                }
            }
            indexOne = originalOne + 1;
            indexTwo = originalTwo + 1;
        }
        return words;
    }

    public static void selectionSortWordList(ArrayList<String> words) {
        for (int i = 0; i < words.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(j).compareTo(words.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            String min = words.get(minIndex);
            String swap = words.get(i);
            words.set(minIndex, swap);
            words.set(i, min);
        }
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }


}