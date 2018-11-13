package com.Catzen;

import java.util.Random;
import java.util.Scanner;

enum Planets {
    Mercury,
    Venus,
    Earth,
    Mars,
    Jupiter,
    Saturn,
    Uranus,
    Neptune,
    Pluto
}

public class Main {
    public static final int SIZE=10;
    public static int[] array1 = new int[SIZE];
    public static int[] array2 = new int[SIZE];

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Homework_number_7");
        System.out.println("Task_1_of_homework_number_7");
        String str;
        System.out.println("Planets of our solar system are \nMercury\nVenus\nEarth\nMars\nJupiter\nSaturn\nUranus\nNeptune\nPluto");
        System.out.println("Enter the name of the planet");
        str = v.nextLine();
        System.out.println("Planet name is " + str);
        switch(str){
            case "Mercury":
            case "mercury":
                planets(Planets.Mercury);
                break;
            case "Venus":
            case "venus":
                planets(Planets.Venus);
                break;
            case "Earth":
            case "earth":
                planets(Planets.Earth);
                break;
            case "Mars":
            case "mars":
                planets(Planets.Mars);
                break;
            case "Jupiter":
            case "jupiter":
                planets(Planets.Jupiter);
                break;
            case "Saturn":
            case "saturn":
                planets(Planets.Saturn);
                break;
            case "Uranus":
            case "uranus":
                planets(Planets.Uranus);
                break;
            case "Neptune":
            case "neptune":
                planets(Planets.Neptune);
                break;
            case "Pluto":
            case "pluto":
                planets(Planets.Pluto);
                break;
            default:
                System.out.println("It is not name of planet!!! Go to learn astronomy!!!");
        }
        System.out.println("Task_2.1_of_homework_number_7");
        Scanner w = new Scanner(System.in);
        int number;
        System.out.println("Enter number");
        number = w.nextInt();
        System.out.println("Number is " + number);
        arr(number);
        System.out.print("\n");
        System.out.println("Task_2.2_of_homework_number_7");
        int size;
        System.out.println("Enter size of the array");
        size = w.nextInt();
        System.out.println("Size of the array is " + size);
        changeArraySize(size);
        System.out.print("\n");
        System.out.println("Task_2.3_of_homework_number_7");
        int value;
        int index;
        System.out.println("What would you like to do with the array?");
        System.out.println("If you want to add value in the end of array write addEnd, please");
        System.out.println("If you want to add value in the start of array write addStart, please");
        System.out.println("If you want to add value in any position of array write insert, please");
        String str1;
        System.out.println("What have you chosen? Write, please");
        str1 = v.nextLine();
        switch (str1) {
            case "addEnd":
                System.out.println("Congratulation!!! You have chosen to add value in the end of array");
                System.out.println("Enter value for array");
                value = w.nextInt();
                System.out.println("Value is " + value);
                printArray();
                System.out.print("\n");
                getSize();
                System.out.print("\n");
                addEnd(value);
                break;
            case "addStart":
                System.out.println("Congratulation!!! You have chosen to add value in the start of array");
                System.out.println("Enter value for array");
                value = w.nextInt();
                System.out.println("Value is " + value);
                printArray();
                System.out.print("\n");
                getSize();
                System.out.print("\n");
                addStart(value);
                break;
            case "insert":
                System.out.println("Congratulation!!! You have chosen to add value in any position of array");
                System.out.println("Enter value for array");
                value = w.nextInt();
                System.out.println("Value is " + value);
                System.out.println("Enter index of element");
                index = w.nextInt();
                System.out.println("Index is " + index);
                printArray();
                System.out.print("\n");
                getSize();
                System.out.print("\n");
                insert(value, index);
                break;
            default:
                System.out.println("ERROR!!!");
        }
        System.out.println("\n");
        System.out.println("Task_2.4_of_homework_number_7");
        int n_ar;
        Random r=new Random();
        System.out.println("Enter size of array");
        n_ar=w.nextInt();
        System.out.println("Size of array is " +n_ar);
        int[] ar=new int[n_ar];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=r.nextInt(10);
            System.out.print(ar[i] +"_");
        }
        System.out.print("\n");
        int startIndex;
        int endIndex;
        System.out.println("Enter start index");
        startIndex=w.nextInt();
        System.out.println("Start index is " +startIndex);
        System.out.println("Enter end index");
        endIndex=w.nextInt();
        System.out.println("End index is " +endIndex);
        ar(ar,startIndex,endIndex);

    }

    public static void planets(Planets planets) {
        switch (planets) {
            case Mercury:
                System.out.println("Atmosphere of Mercury consists of O2 (42,00%), Na (29,0%), H2 (22,0%), He (6,0%) and K (0,5%)");
                break;
            case Venus:
                System.out.println("Atmosphere of Venus consists of CO2 (96,5%), N2 (3,5%), SO2 (0,018%), Ar (0,007%), H2O (0,003%), CO (0,0017%), He (0,0012%) and Ne (0,0007%)");
                break;
            case Earth:
                System.out.println("Atmosphere of Earth consists of N2 (78,08%), O2 (20,95%), Ar (0,93%), and CO2 (0,04%)");
                break;
            case Mars:
                System.out.println("Atmosphere of Mars consists of CO2 (95,32%), N2 (2,7%), Ar (1,6%), O2 (0,145%), CO (0,08%) and H2O (0,021%)");
                break;
            case Jupiter:
                System.out.println("Atmosphere of Jupiter consists of H2 (89,8+-2,0%), He (10,2+-2,0%), CH4 (0,3%), NH4+ (0,02%) and C2H6 (0,0006%)");
                break;
            case Saturn:
                System.out.println("Atmosphere of Saturn consists of H2 (96%), He (3%), CH4 (0,4%), NH3 (0,01%) and C2H6 (0,0007%)");
                break;
            case Uranus:
                System.out.println("Atmosphere of Uranus consists of H2 (83+-3%), He (15+-3%) and CH4 (2,3%)");
                break;
            case Neptune:
                System.out.println("Atmosphere of Neptune consists of H2 (80+-3,2%), He (19+-3,2%), CH4 (1,5+-0,5%) and C2H6 (0,00015%)");
                break;
            case Pluto:
                System.out.println("Atmosphere of Pluto consists of N2, CH4 and CO");
                break;
            default:
        }
    }

    public static void arr(int number) {
        int[] array = new int[SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
            System.out.print(array[i] + "_");
        }
    }

    public static void changeArraySize(int size) {
        Random r = new Random();
        int[] array = array1;
        int[] array2 = new int[size];
        System.out.println("First array is");
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
            System.out.print(array[i] + "_");
        }
        System.out.print("\n");
        System.out.println("Second array is");
        if (array2.length > array.length) {
            for (int i = 0; i < array.length; i++) {
                array2[i] = array[i];
                System.out.print(array2[i] + "_");
            }
            for (int i = array.length; i < array2.length; i++) {
                array2[i] = 0;
                System.out.print(array2[i] + " ");
            }
        } else {
            for (int i = 0; i < array2.length; i++) {
                array2[i] = array[i];
                System.out.print(array2[i] + "_");
            }
        }
    }

    public static void printArray() {
        Scanner w = new Scanner(System.in);
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter the element " + i + " of array");
            array2[i] = w.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "_");
        }
    }

    public static void getSize() {
        int k = 0;
        for (int i = 0; i < array2.length; i++) {
            k = k + 1;
        }
        System.out.println("Size of array is " + k);
    }

    public static void addEnd(int value) {
        int[] array = new int[array2.length+1];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array2[i];
        }
        for (int i = array.length - 1; i < array.length; i++) {
            array[i] = value;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "_");
        }
    }

    public static void addStart(int value) {
        int[] array = new int[array2.length+1];
        for (int i = 0; i < 1; i++) {
            array[i] = value;
        }
        for (int i = 1; i < array.length; i++) {
            array[i] = array2[i - 1];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "_");
        }
    }

    public static void insert(int value, int index) {
        int[] array = new int[array2.length+1];
        for (int i = 0; i < index; i++) {
            array[i] = array2[i];
        }
        for (int i = index; i < index + 1; i++) {
            array[i] = value;
        }
        for (int i = index + 1; i < array.length; i++) {
            array[i] = array2[i - 1];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "_");
        }
    }

    public static void ar(int[] array, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex >= array.length) {
            System.out.println("ERROR!!!");
        } else {
            for (int i = startIndex; i <= endIndex; i++) {
                System.out.print(array[i] + "_");
            }
        }
    }
}



