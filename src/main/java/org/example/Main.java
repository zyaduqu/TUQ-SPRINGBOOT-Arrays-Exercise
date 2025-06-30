package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            //question 1

            System.out.print("welcome to question 1\nplease enter the index of the array\n");
            int indexArr = scanner.nextInt();
            int[] arr = new int[indexArr];


            for (int i = 0; i<=arr.length-1;i++) {
                System.out.print("please enter value ["+i+"]");
                int arrValues = scanner.nextInt();
                arr[i] = arrValues;
            }

            if (arr[0] == arr[arr.length-1]) {
                System.out.println("\ntrue");
            }else{
                System.out.println("\nfalse");
            }

            //question 2
            int[] arr2 = {1, 4, 17, 7, 25, 3, 100};
            int sum = 0;
            int indexForGreater = 0;
            ArrayList<Integer> greaterArr = new ArrayList<>(); //using arraylist for flexibility

            for (int index: arr2){
                sum+=index;
            }
        int avg = sum/arr2.length;

        for (int i = 0; i <= arr2.length-1; i++) {
            if (arr2[i]>avg){
                greaterArr.add(arr2[i]);
            }
        }
        System.out.println("The average of the said array is: "+avg+"\n The numbers in the said array that are\n" +
                "greater than the average are: "+greaterArr);



//question 3
        int[] arr4 = {40, 45, 96, 10,992};


        if (arr4[0]>arr4[arr4.length-1]) {
            System.out.println("Larger value between first and last element: "+arr4[0]);
        }else{
            System.out.println("Larger value between first and last element: "+arr4[arr4.length-1]);
        }




//question4
        int[] arr5 = {35,115,329,40};
        int firstIndex = arr5[0]; //saving the first index for later
        arr5[0] = arr5[arr5.length-1];
                                        /*
                                        swapping between values
                                                                */
        arr5[arr5.length-1]=firstIndex;

        System.out.println("New array after swapping the first and last elements: "+Arrays.toString(arr5));

        //question 5
        int[] orgArr = {2,3,40,1,5,9,4,10,7};
        int[] newArr = new int[orgArr.length]; //new array with the same size of the old one
        int index = 0;

        //adding the odds to the new array
        for(int odd: orgArr){
            if (odd % 2 !=0){
                newArr[index] = odd;
                index++;
            }
        }

        //adding evens to the new array
        for (int even : orgArr){
            if (even %2 == 0){
                newArr[index] = even;
                index++;
            }
        }

        System.out.println(Arrays.toString(newArr));

        //question 6
        int[] arr6 = {2,3,6,6,4};
        int[] arr7 = {2,3,6,7,4};
        int equalityCounter = 0;


        if (arr6.length != arr7.length) {   //checking the lengths of the two arrays first
            System.out.println("lengths are not equal");
        }else{
            for (int i = 0; i <= arr6.length-1; i++) {
                if (arr6[i] != arr7[i]){
                    System.out.println("index "+i+" on the arrays is not equal");
                    break;
                } else {
                    equalityCounter++;
                }


            }
            if (equalityCounter == arr6.length) {
                System.out.println("Arrays are equal");
            } else {
                System.out.println("Arrays are NOT equal");
            }


        }




    }


}