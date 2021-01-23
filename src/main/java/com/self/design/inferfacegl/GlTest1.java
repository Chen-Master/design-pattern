package com.self.design.inferfacegl;

/**
 * Description：
 *
 * A 通过interface1依赖B
 * C 通过interface1依赖D
 * 单A只需要使用B中的1,2,3方法，其余是多余的
 * 单C只需要使用D中的1,4，5方法，其余是多余的
 * <br/>
 * Copyright (c) ， 2020， 顺丰快运 <br/>
 * This program is protected by copyright laws. <br/>
 * Date: 2021/1/23
 *
 * @author chenyh chenyuanhua@sfmail.sf-express.com
 * @version : 1.0
 */
public class GlTest1 {

}

interface interface1 {
    void f1();

    void f2();

    void f3();

    void f4();

    void f5();
}

class B implements interface1 {

    @Override
    public void f1() {
        System.out.println("B f1");
    }

    @Override
    public void f2() {
        System.out.println("B f2");
    }

    @Override
    public void f3() {
        System.out.println("B f3");
    }

    @Override
    public void f4() {
        System.out.println("B f4");
    }

    @Override
    public void f5() {
        System.out.println("B f5");
    }
}

class D implements interface1 {

    @Override
    public void f1() {
        System.out.println("D f1");
    }

    @Override
    public void f2() {
        System.out.println("D f2");
    }

    @Override
    public void f3() {
        System.out.println("D f3");
    }

    @Override
    public void f4() {
        System.out.println("D f4");
    }

    @Override
    public void f5() {
        System.out.println("D f5");
    }
}


class A {
    public void f1(interface1 i) {
        i.f1();
    }

    public void f2(interface1 i) {
        i.f2();
    }

    public void f3(interface1 i) {
        i.f3();
    }
}

class C {
    public void f1(interface1 i) {
        i.f1();
    }

    public void f4(interface1 i) {
        i.f4();
    }

    public void f5(interface1 i) {
        i.f5();
    }
}