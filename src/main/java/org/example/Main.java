//package org.example;
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        //question 1
////
////            System.out.print("welcome to question 1\nplease enter the index of the array\n");
////            int indexArr = scanner.nextInt();
////            int[] arr = new int[indexArr];
////
////
////            for (int i = 0; i<=arr.length-1;i++) {
////                System.out.print("please enter value ["+i+"]");
////                int arrValues = scanner.nextInt();
////                arr[i] = arrValues;
////            }
////
////            if (arr[0] == arr[arr.length-1]) {
////                System.out.println("\ntrue");
////            }else{
////                System.out.println("\nfalse");
////            }
//
////            //question 2
////            int[] arr2 = {1, 4, 17, 7, 25, 3, 100};
////            int sum = 0;
////            int indexForGreater = 0;
////            ArrayList<Integer>greaterArr = new ArrayList<>(); //using arraylist for flexibility
////
////            for (int index: arr2){
////                sum+=index;
////            }
////        int avg = sum/arr2.length;
////
////        for (int i = 0; i <= arr2.length-1; i++) {
////            if (arr2[i]>avg){
////                greaterArr.add(arr2[i]);
////            }
////        }
////        System.out.println("The average of the said array is: "+avg+"\n The numbers in the said array that are\n" +
////                "greater than the average are: "+greaterArr);
////
////
//
////        //question 3
////        int[] arr4 = {40, 45, 96};
////        int max = 0;
////        for (int i = 0; i<= arr4.length-1;i++){
////            for (int reversedCounter = 0; reversedCounter < arr4.length; reversedCounter++) {
////                if (arr4[i]>arr4[reversedCounter]) {
////                    max = arr4[i];
////                }
////            }
////        }
////        System.out.println("Larger value between first and last element: "+max);
//
////        //question4
////        int[] arr4 = {35,115,329};
////        int[] newArr4 = new int[arr4.length];
////        int reversedCounter = arr4.length-1;
////
////        for (int i = 0; i <= arr4.length-1 ;i++) {
////            newArr4[reversedCounter] += arr4[i];
////            reversedCounter--;
////        }
////        System.out.println("New array after swapping the first and last elements: "+Arrays.toString(newArr4));
//
////        //question 5
////        int[] orgArr = {2,3,40,1,5,9,4,10,7};
////        int[] newArr = new int[orgArr.length]; //new array with the same size of the old one
////        int index = 0;
////
////        //adding the odds to the new array
////        for(int odd: orgArr){
////            if (odd % 2 !=0){
////                newArr[index] = odd;
////                index++;
////            }
////        }
////
////        //adding evens to the new array
////        for (int even : orgArr){
////            if (even %2 == 0){
////                newArr[index] = even;
////                index++;
////            }
////        }
////
////        System.out.println(Arrays.toString(newArr));
//
//        //question 6
//        int[] arr5 = {2,3,6,6,4};
//        int[] arr6 = {2,3,6,6,4};
//
//
//        if (arr5.length != arr6.length) {   //checking the lengths of the two arrays first
//            System.out.println("lengths are not equal");
//        }else{
//            for (int i = 0; i <= arr5.length-1; i++) {
//                if (arr5[i] != arr6[i]){
//                    System.out.println("arrays not equal");
//                    break;
//                } else {
//                    System.out.println("are equal");
//                }
//
//
//            }
//
//
//        }
//
//
//
//
//    }
//
//
//}