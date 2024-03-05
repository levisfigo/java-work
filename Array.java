/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

import java.util.Arrays;

public class Array {
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        int[] intersection = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                intersection[index++] = arr1[i];
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return Arrays.copyOf(intersection, index);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 5, 7, 4};
        int[] array2 = {2, 5, 4, 9, 8};

        int[] intersection = findIntersection(array1, array2);

        if (intersection.length > 0) {
            System.out.println("Intersection of the arrays: " + Arrays.toString(intersection));
        } else {
            System.out.println("No intersection found.");
        }
    }
}