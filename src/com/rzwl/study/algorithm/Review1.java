package com.rzwl.study.algorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author : championjing
 * @version V1.0
 * @Description:
 * @date Date : 2020年11月12日 10:02
 */
public class Review1 {

    @Test
    public void testSort() {
        int[] arr = {4, 7, 8, 3, 9, 21, 0, 2};
//        System.out.println(Arrays.toString( insert( arr ) ) );
        System.out.println(Arrays.toString(shell(arr)));
    }

    /**
     * 直接插入排序
     * 把要排序的数组看成两部分，p1是已经排序完成的，p2是未排序的，拿到p2中最前面那个数字插到到p1中的合适位置
     *
     * @param arr
     * @return
     */
    public int[] insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //arr[i]就是要往前插入的元素
            for (int tempIndex = i; tempIndex > 0 && arr[tempIndex - 1] > arr[tempIndex]; tempIndex--) {
                int temp = arr[tempIndex - 1];
                arr[tempIndex - 1] = arr[tempIndex];
                arr[tempIndex] = temp;
            }
        }
        return arr;
    }

    /**
     * 希尔排序，具有步长特性的希尔排序
     *
     * @param arr
     * @return
     */
    public int[] shell(int[] arr) {
        //每次gap = gap/2;
        for (int gap = arr.length / 2;gap >= 1;gap = gap / 2) { //分成间隔组，间隔大小为gap
            for (int i = 0; i < gap; i++) { //保证每个组都能参与
                for ( int k=gap+i; k<arr.length; k=k+gap ) { //对每个间隔组进行插入排序
                    for ( int tempIndex = k; tempIndex>=gap ; tempIndex= tempIndex-gap) { //选定一个未排序的元素，插入到已排序的部分中合适位置
                        if (arr[tempIndex] < arr[tempIndex-gap] ) {
                            int temp = arr[tempIndex - gap];
                            arr[tempIndex - gap] = arr[tempIndex];
                            arr[tempIndex] = temp;
                            System.out.println(Arrays.toString(arr));
                        }
                    }
                }
            }
            System.out.println("gap------------"+gap);
        }
        return arr;
    }
}
