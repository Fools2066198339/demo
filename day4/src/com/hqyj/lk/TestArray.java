package com.hqyj.lk;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-15-11:07
 */
public class TestArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        int[] array1 = new int[12];
        int[] array2 = {1, 5, 7, 3, 4, 9, 10, 2, 0};
        System.out.println(array2.length);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        //冒泡排序
        //控制外循环次数
        for (int x = 0; x < array2.length - 1; x++) {
            //-1是为了避免角标越界异常，-x是为了减少外循环次数
            for (int y = 0; y < array2.length - 1 - x; y++) {
                //判断两个相邻元素的大小
                if (array2[y] > array2[y + 1]) {
                    int temp = array2[y];
                    array2[y] = array2[y + 1];
                    array2[y + 1] = temp;
                }
            }
        }
//        Arrays.sort(array2);


        for (int i : array2) {
            System.out.print(i + " ");
        }

/*        System.out.println(array[0]);
        System.out.println(array1[0]);
        System.out.println(array2[8]);*/
    }
}
