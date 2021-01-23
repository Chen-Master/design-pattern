package com.self.design.inferfacegl;

/**
 * Description：
 * 改进：
 * 独立三个接口
 * interface11 f1
 * interface22 f2，f3
 * interface33 f4，f5
 *
 * B类实现interface11和interface22
 * D类实现interface11和interface33
 * A 类通过接口interface11和接口interface22依赖B类
 * C 类通过接口interface11和接口interface33依赖D类
 * <br/>
 * Copyright (c) ， 2020， 顺丰快运 <br/>
 * This program is protected by copyright laws. <br/>
 * Date: 2021/1/23
 *
 * @author chenyh chenyuanhua@sfmail.sf-express.com
 * @version : 1.0
 */
public class GlTest2 {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.f1(new BB());
        aa.f2(new BB());
    }
}


interface interface11{
    void f1();
}

interface interface22{
    void f2();
    void f3();
}

interface interface33{
    void f4();
    void f5();
}

class BB implements interface11,interface22 {

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
}

class DD implements interface11,interface33 {

    @Override
    public void f1() {
        System.out.println("D f1");
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


class AA {
    public void f1(interface11 i) {
        i.f1();
    }

    public void f2(interface22 i) {
        i.f2();
    }

    public void f3(interface22 i) {
        i.f3();
    }
}

class CC {
    public void f1(interface11 i) {
        i.f1();
    }

    public void f4(interface33 i) {
        i.f4();
    }

    public void f5(interface33 i) {
        i.f5();
    }
}