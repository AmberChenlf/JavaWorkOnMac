package com.sikiedu;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author bingqiong.cbb
 * @date 2019-05-25 12:48
 **/
public class HashSetDemo {
    public static void main(String[] args){
        //hashset是无序的，不重复的
        HashSet set = new HashSet();
        set.add("c");
        set.add("h");
        set.add("e");
        set.add("n");
        for(Object o:set){
            System.out.print(o+" ");
        }
        System.out.println();

        TreeSet treeset = new TreeSet();
        treeset.add("li");
        treeset.add("fang");

        for(Object k:treeset){
            System.out.print(k+" ");
        }
        System.out.println();
    }
}
