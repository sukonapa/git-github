package com.info.demo;

public interface FuncInterface {

    final int num=10;
    int strLength(String s);
     //void test();
    default void defalutInt(){
        System.out.println("Defalut interface");
    }
    static void staticInter(){
        System.out.println("static interface");
    }

}
