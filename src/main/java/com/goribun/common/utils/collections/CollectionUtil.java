package com.goribun.common.utils.collections;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.PredicateUtils;

import java.util.*;

/**
 * Created by WangXuesong on 2016/3/7.
 */
public class CollectionUtil {

    private CollectionUtil() {
    }

    public static boolean isEmpty(Collection<?> coll) {
        return coll == null || coll.isEmpty();
    }

    public static boolean isNotEmpty(Collection<?> coll) {
        return !isEmpty(coll);
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> emptyList() {
        return (List<T>) Collections.EMPTY_LIST;
    }

    @SuppressWarnings("unchecked")
    public static <T> Set<T> emptySet() {
        return (Set<T>) Collections.EMPTY_SET;
    }

    /**
     * 移除所有的null元素
     *
     * @param coll
     * @param <T>
     * @return
     */
    public static <T> boolean removeNull(Collection<T> coll) {
        return CollectionUtils.filter(coll, PredicateUtils.notNullPredicate());
    }

    /**
     * Set交集
     *
     * @param set1
     * @param set2
     * @param <T>
     * @return
     */
    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        if (isEmpty(set1) || isEmpty(set2)) {
            return emptySet();
        }
        // 不影响入参set
        Set<T> ret = new HashSet<T>();
        if (set1.size() < set2.size()) {
            ret.addAll(set1);
            ret.retainAll(set2);
        } else {
            ret.addAll(set2);
            ret.retainAll(set1);
        }
        return ret;
    }

    /**
     * List交集
     *
     * @param list1
     * @param list2
     * @param <T>
     * @return
     */
    public static <T> List<T> intersection(List<T> list1, List<T> list2) {
        if (isEmpty(list1) || isEmpty(list2)) {
            return emptyList();
        }
        Set<T> set0 = new HashSet<T>(list1);
        Set<T> set1 = new HashSet<T>(list2);
        return new ArrayList<T>(intersection(set0, set1));
    }

    /**
     * Set并集
     *
     * @param set1
     * @param set2
     * @param <T>
     * @return
     */
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        if (set1 == null || set2 == null) {
            return (set1 == null) ? new HashSet<T>(set2) : new HashSet<T>(set1);
        }
        Set<T> ret = new HashSet<T>(set1);
        ret.addAll(set2);
        return ret;
    }

    /**
     * List并集
     *
     * @param list1
     * @param list2
     * @param duplicate 是否带有重复值
     * @param <T>
     * @return
     */
    public static <T> List<T> union(List<T> list1, List<T> list2, boolean duplicate) {
        if (list1 == null || list2 == null) {
            return (list1 == null) ? new ArrayList<T>(list2) : new ArrayList<T>(list1);
        }
        List<T> ret;
        if (duplicate) {
            ret = new ArrayList<T>(list1);
            ret.addAll(list2);
        } else {
            Set<T> set = union(new HashSet<T>(list1), new HashSet<T>(list2));
            ret = new ArrayList<T>(set);
        }
        return ret;
    }
}

