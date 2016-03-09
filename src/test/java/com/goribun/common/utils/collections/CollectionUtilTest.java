package com.goribun.common.utils.collections;

import java.util.*;

import org.junit.Test;

/**
 * Created by WangXuesong on 2016/3/8.
 */
public class CollectionUtilTest {

    @Test
    public void testIsEmpty() {
        List<String> list = new ArrayList<String>();
        list = Collections.EMPTY_LIST;
        boolean isEmpty = CollectionUtil.isEmpty(list);
        System.out.println(isEmpty);
    }

    @Test
    public void testIsNotEmpty() {
        List<String> list = new ArrayList<String>();
        boolean isEmpty = CollectionUtil.isNotEmpty(list);
        System.out.println(isEmpty);
    }

    @Test
    public void testEmptyList() {
        List<String> list = CollectionUtil.emptyList();
        boolean isEmpty = CollectionUtil.isNotEmpty(list);
        System.out.println(isEmpty);
    }

    @Test
    public void testEmptySet() {
        Set<String> set = CollectionUtil.emptySet();
        boolean isEmpty = CollectionUtil.isNotEmpty(set);
        System.out.println(isEmpty);
    }

    @Test
    public void testIntersection0() {
        Set<String> set0 = new HashSet<String>();
        set0.add("A");
        set0.add("B");
//        set0.add("C");
//        set0.add("D");
        Set<String> set1 = new HashSet<String>();
        set1.add("E");
        set1.add("D");
        set1.add("C");
        System.out.println(CollectionUtil.intersection(set0, set1));
    }

    @Test
    public void testIntersection1() {
        List<String> list0 = new ArrayList<String>();
        list0.add("A");
        list0.add("A");
        list0.add("B");
        list0.add("B");
        List<String> list1 = new ArrayList<String>();
        list1.add("C");
        list1.add("C");
        list1.add("B");
        list1.add("B");
        System.out.println(CollectionUtil.intersection(list0, list1));
    }

    @Test
    public void testUnion() {
        Set<String> set0 = new LinkedHashSet<String>();
        set0.add("A");
        set0.add("B");
        set0.add("C");
//        set0.add("D");
        Set<String> set1 = new LinkedHashSet<String>();
        set1.add("E");
        set1.add("D");
        set1.add("C");

        Set ret = CollectionUtil.union(set0, set1);
        System.out.println(CollectionUtil.union(set0, set1));
    }

    @Test
    public void testRemoveNull() {
        List<String> list =new ArrayList<String>();
        list.add("A");
        list.add(null);
        list.add("A");
        list.add(null);
        System.out.println(list );
        boolean isEmpty = CollectionUtil.removeNull(list);
        System.out.println(isEmpty+" "+list );
    }

}
