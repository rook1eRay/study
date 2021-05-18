package sort.primary;

import sort.SortCommonUtils;

/**
 * @author Ray
 * @date 2021/5/18 15:23
 * @description 希尔排序
 */
public class Shell {

    public static <T extends Comparable<T>> void sort(T[] array) {
        int h = 1;
        while (h < array.length/3) {
            h = 3*h + 1;
        }
        while (h >= 1)
        {
            // 将数组变为h有序
            for (int i = h; i < array.length; i++)
            {
                // 将a[i]插入到a[i-h], a[i-2*h], a[i-3*h]... 之中
                for (int j = i; j >= h && SortCommonUtils.less(array[j], array[j-h]); j -= h) {
                    SortCommonUtils.exchange(array, j, j-h);
                }
            }
            h = h/3;
        }
    }

    public static void main(String[] args) {
        Integer[] array = {10, 9, 5, 7, 8, 2};
        sort(array);
        System.out.println(SortCommonUtils.isSorted(array));
        SortCommonUtils.show(array);
    }
}
