package com.sikiedu.Demo6;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author bingqiong.cbb
 * @date 2019-06-05 20:43
 **/
public class Demo01_FileInputOutputStream {
    public void main(String[] args){

    }
    @Test
    public void testFileInputStream(){
        FileInputStream input = null;
        try{
            input = new FileInputStream("/Users/Chenbinbin/JavaWork/src/com/sikiedu//Test/demo01.txt");
            int a = input.read();
            System.out.println((char)a);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
