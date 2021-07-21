package com.hqyj.lk;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-15-13:31
 */
public class TestArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 6};
        //getMaxMin(arr1);
        System.out.println("getSum(arr1) = " + getSum(arr1));
        double a=(1+4+5)/4;
        System.out.println("a = " + a);
//        int[] arr2 = arr1;
//        arr2[0] = 6;
//        System.out.println(arr1[0]);
//        arr2 = null;
//        //System.out.println(arr2[0]);
//        Arrays.sort(arr1);
//        printArray(arr1);

    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void getMaxMin(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int value : arr) {
            if (max < value) {
                max = value;
            }
            if (min > value) {
                min = value;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

    public static int getSum(int[] arr){
        //冒泡排序
        int sum=0;
        //控制外循环次数
        for (int x = 0; x < arr.length - 1; x++) {
            //-1是为了避免角标越界异常，-x是为了减少外循环次数
            for (int y = 0; y < arr.length - 1 - x; y++) {
                //判断两个相邻元素的大小
                if (arr[y] > arr[y + 1]) {
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                }
            }
        }
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }

}
