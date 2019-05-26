package com.sikiedu.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author bingqiong.cbb
 * @date 2019-05-18 12:23
 **/
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add("x");
        al.add("y");
        ArrayList al2 = new ArrayList();
        al2.add("p");

        al.addAll(al2);

        al.add(0,"insert");
        al.addAll(0,al2);
        System.out.println(al);

        //al.remove(1);
        //al.remove("y");
        //al.removeAll(al2);
        System.out.println(al);
        System.out.println(al.isEmpty());
        System.out.println(al.contains("x"));

        Object[] oArray  = al.toArray();
        for(int i=0;i<oArray.length;i++){
            System.out.print(oArray[i]+ " ");

        }
        System.out.println();
        System.out.println("使用Iterator遍历ArrayList:");

        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
    }

}
