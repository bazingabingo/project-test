package com.bazinga.test.algo;

import java.util.Arrays;

/**
 * @author wangquan2564
 * @date 2021/2/20 10:53
 * @Description 数组相关算法
 */
public class ArrayTest {

    public static void main(String[] args) {
        reverseArray();
    }

    /** 数组反转 */
    private static void reverseArray() {
        // 采用二分法，时间和空间复杂度都是最优的
        Integer[] array = new Integer[]{1,2,3,4,5,6,7,8};
        Integer temp = 0;
        for (int i = 0; i < array.length/2 ; i++) {
            temp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i - 1] = temp;
        }
        Arrays.asList(array).forEach(System.out::println);
    }

}
