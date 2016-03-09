package com.goribun.common.utils.collections;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by wangxuesong on 16/3/9.
 */
public class ArrayUtil {

    // TODO: 16/3/10 基础类型重载

    /**
     * 拼接多个数组
     *
     * @param array1 数组1
     * @param array2 数组2(可变参数)
     * @param <T>    泛型T
     * @return 拼接后的数组
     */
    public static <T> T[] concatAll(T[] array1, T... array2) {
        return ArrayUtils.addAll(array1, array2);
    }

    /**
     * 拼接多个数组
     *
     * @param array1 数组1
     * @param array2 数组2(可变参数)
     * @return 拼接后的数组
     */
    public static boolean[] concatAll(boolean[] array1, boolean... array2) {
        return ArrayUtils.addAll(array1, array2);
    }

    /**
     * 拼接多个数组
     *
     * @param array1 数组1
     * @param array2 数组2(可变参数)
     * @return 拼接后的数组
     */
    public static char[] concatAll(char[] array1, char... array2) {
        return ArrayUtils.addAll(array1, array2);
    }

    /**
     * 拼接多个数组
     *
     * @param array1 数组1
     * @param array2 数组2(可变参数)
     * @return 拼接后的数组
     */
    public static byte[] concatAll(byte[] array1, byte... array2) {
        return ArrayUtils.addAll(array1, array2);
    }

    /**
     * 拼接多个数组
     *
     * @param array1 数组1
     * @param array2 数组2(可变参数)
     * @return 拼接后的数组
     */
    public static short[] concatAll(short[] array1, short... array2) {
        return ArrayUtils.addAll(array1, array2);
    }

    /**
     * 拼接多个数组
     *
     * @param array1 数组1
     * @param array2 数组2(可变参数)
     * @return 拼接后的数组
     */
    public static int[] concatAll(int[] array1, int... array2) {
        return ArrayUtils.addAll(array1, array2);
    }

    /**
     * 拼接多个数组
     *
     * @param array1 数组1
     * @param array2 数组2(可变参数)
     * @return 拼接后的数组
     */
    public static long[] concatAll(long[] array1, long... array2) {
        return ArrayUtils.addAll(array1, array2);
    }

    /**
     * 拼接多个数组
     *
     * @param array1 数组1
     * @param array2 数组2(可变参数)
     * @return 拼接后的数组
     */
    public static float[] concatAll(float[] array1, float... array2) {
        return ArrayUtils.addAll(array1, array2);
    }

    /**
     * 拼接多个数组
     *
     * @param array1 数组1
     * @param array2 数组2(可变参数)
     * @return 拼接后的数组
     */
    public static double[] concatAll(double[] array1, double... array2) {
        return ArrayUtils.addAll(array1, array2);
    }

    /**
     * 追加元素<br/>
     * 注:该方法不会改变array引用,而是返回一个新的数组
     *
     * @param array   数组
     * @param element 追加的元素
     * @param <T>     泛型T
     * @return 追加后的数组
     */
    public static <T> T[] append(T[] array, T element) {
        return ArrayUtils.add(array, element);
    }

    /**
     * 追加元素<br/>
     * 注:该方法不会改变array引用,而是返回一个新的数组
     *
     * @param array   数组
     * @param element 追加的元素
     * @return 追加后的数组
     */
    public static boolean[] append(boolean[] array, boolean element) {
        return ArrayUtils.add(array, element);
    }

    /**
     * 追加元素<br/>
     * 注:该方法不会改变array引用,而是返回一个新的数组
     *
     * @param array   数组
     * @param element 追加的元素
     * @return 追加后的数组
     */
    public static char[] append(char[] array, char element) {
        return ArrayUtils.add(array, element);
    }

    /**
     * 追加元素<br/>
     * 注:该方法不会改变array引用,而是返回一个新的数组
     *
     * @param array   数组
     * @param element 追加的元素
     * @return 追加后的数组
     */
    public static byte[] append(byte[] array, byte element) {
        return ArrayUtils.add(array, element);
    }

    /**
     * 追加元素<br/>
     * 注:该方法不会改变array引用,而是返回一个新的数组
     *
     * @param array   数组
     * @param element 追加的元素
     * @return 追加后的数组
     */
    public static short[] append(short[] array, short element) {
        return ArrayUtils.add(array, element);
    }

    /**
     * 追加元素<br/>
     * 注:该方法不会改变array引用,而是返回一个新的数组
     *
     * @param array   数组
     * @param element 追加的元素
     * @return 追加后的数组
     */
    public static int[] append(int[] array, int element) {
        return ArrayUtils.add(array, element);
    }

    /**
     * 追加元素<br/>
     * 注:该方法不会改变array引用,而是返回一个新的数组
     *
     * @param array   数组
     * @param element 追加的元素
     * @return 追加后的数组
     */
    public static long[] append(long[] array, long element) {
        return ArrayUtils.add(array, element);
    }

    /**
     * 追加元素<br/>
     * 注:该方法不会改变array引用,而是返回一个新的数组
     *
     * @param array   数组
     * @param element 追加的元素
     * @return 追加后的数组
     */
    public static float[] append(float[] array, float element) {
        return ArrayUtils.add(array, element);
    }

    /**
     * 追加元素<br/>
     * 注:该方法不会改变array引用,而是返回一个新的数组
     *
     * @param array   数组
     * @param element 追加的元素
     * @return 追加后的数组
     */
    public static double[] append(double[] array, double element) {
        return ArrayUtils.add(array, element);
    }

    /**
     * 在数字的指定位置添加元素
     *
     * @param array   数组
     * @param index   索引
     * @param element 元素
     * @param <T>     泛型T
     * @return 增加元素后的数组
     */
    public static <T> T[] add(T[] array, int index, T element) {
        return ArrayUtils.add(array, index, element);
    }

    /**
     * 删除指定位置的元素
     *
     * @param array 数组
     * @param index 索引
     * @param <T>   泛型T
     * @return 删除指定元素后的数组
     */
    public static <T> T[] remove(T[] array, int index) {
        return ArrayUtils.remove(array, index);
    }

}
