package com.edu.java;

import javax.lang.model.SourceVersion;
import java.util.ArrayList;
import java.util.HashMap;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = [" + args + "]");
        int[] a = new int[]{1,2,3,4} ;
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }

    }

}
