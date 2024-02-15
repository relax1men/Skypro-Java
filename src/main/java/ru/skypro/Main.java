package ru.skypro;

public class Main {
    public static void main(String[] args) {

        //number 1
        System.out.println("Задание 1");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double[] arr2 = new double[3];
        arr2[0] = 1.57;
        arr2[1] = 7.654;
        arr2[2] = 9.986;

        int[] arr3 = {5, 7, 9, 11, 12};
        System.out.println();

        //number 2
        System.out.print("Задание 2");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
                break;
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.print(arr2[i]);
                break;
            } else {
                System.out.print(arr2[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1) {
                System.out.print(arr3[i]);
                break;
            } else {
                System.out.print(arr3[i] + ", ");
            }
        }
        System.out.println();

        //number 3
        System.out.println("Задание 3");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
                break;
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr2[i]);
                break;
            } else {
                System.out.print(arr2[i] + ", ");
            }
        }
        System.out.println();
        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr3[i]);
                break;
            } else {
                System.out.print(arr3[i] + ", ");
            }
        }
        System.out.println();

        //number 4
        System.out.println("Задание 4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                System.out.print(arr[i]+ " ");
                arr[i]++;
            } else {
                System.out.print(arr[i] + 1 + " ");
            }
        }





    }
}

