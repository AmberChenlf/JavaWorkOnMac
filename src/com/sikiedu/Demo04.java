package com.sikiedu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 * @author bingqiong.cbb
 * @date 2019-05-22 21:19
 **/
public class Demo04 {
    public static void main(String[] args){
        //集合只能存储引用类型
        //数组可以存储基本类型和引用类型
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);//会自动对基本类型进行装箱操作
        al.add(234);
        for (int i:al
             ) {
            System.out.print(i+" ");

        }
        Vector<String> ve = new Vector<String>();
        ve.add("sikiedu");
        ve.add("haha");
        for (String s:ve
             ) {
            System.out.print(s+" ");

        }

        LinkedList<Character> ll = new LinkedList<Character>();
        ll.add('b');
        ll.add('c');
        for (Character ch:ll
             ) {
            System.out.print(ch+" ");

        }
    }
}
