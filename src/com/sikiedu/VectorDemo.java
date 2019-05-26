package com.sikiedu;

import java.util.Vector;

/**
 * @author bingqiong.cbb
 * @date 2019-05-22 19:57
 **/
public class VectorDemo {
    //线程是否安全：线程安全，适用于多线程
    public static void main(String[] args){
        Vector v = new Vector();

        v.add("mic");
        v.add("siki");

        for (Object obj:v
             ) {
            System.out.print(obj+" ");

        }
        System.out.println();
        v.remove(0);
        System.out.println(v);
    }
}
