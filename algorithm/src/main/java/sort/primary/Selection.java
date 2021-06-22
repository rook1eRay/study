package sort.primary;

import sort.SortCommonUtils;

/**
 * @author Ray
 * @date 2021/5/18 10:54
 * @description 选择排序：每次找到剩余数组中最小的值，将最小值和剩余数组的第一个数调换位置
 */
public class Selection {

    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (SortCommonUtils.less(array[j], array[min])) {
                    min = j;
                }
            }
            if (min != i) {
                SortCommonUtils.exchange(array, min, i);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = {10, 9, 5, 7, 8};
        sort(array);
        System.out.println(SortCommonUtils.isSorted(array));
        SortCommonUtils.show(array);
    }
}
