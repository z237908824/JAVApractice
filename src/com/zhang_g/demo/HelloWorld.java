package com.zhang_g.demo;
/**
 * 一个花式打印HelloWorld的类，主要用于熟悉Java的函数与类
 * @author z2379
 * @version 0.0.1
 */
public class HelloWorld {

    public static void main(String[] args) {
        Test a = new Test();
        a.main("Hello test World !",6);
        loopmain("Hello loop World !",4);
        System.out.print("Hello World !");
    }
    public static void loopmain(String s,int t) {
        for( int i=0;i<t;i++){
            System.out.print(s + "\n");
        }
    }
}
class Test {

    public void main(String s,int t) {
        for( int i=0;i<t;i++){
            System.out.print(s + "\n");
        }
    }
}