package sort.primary;

import sort.SortCommonUtils;

/**
 * @author Ray
 * @date 2021/5/18 14:40
 * @description 插入排序 https://www.cnblogs.com/coding-996/p/12275710.html
 */
public class Insertion {

//    public static <T extends Comparable<T>> void sort(T[] array) {
//        for (int i = 0; i < array.length; i++) {
//            int current = i;
//            for (int j = i - 1; j >= 0 && SortCommonUtils.less(array[current], array[j]); j--) {
//                SortCommonUtils.exchange(array, current, j);
//                current = j;
//            }
//        }
//    }

    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0 && SortCommonUtils.less(array[j], array[j-1]); j--) {
                SortCommonUtils.exchange(array, j, j-1);
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
