package com.self.design.dimitefaze;

/**
 * Description： <br/>
 * Copyright (c) ， 2020， chainch <br/>
 * This program is protected by copyright laws. <br/>
 * Date: 2021/1/27 <br/>
 *
 * @author chenyh01 <br/>
 * @version : 1.0 <br/>
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 迪米特法则：
         * 最少知道原则，
         * 一个类依赖另一个类，不需要知道依赖类的具体实现，只需要调用public方法即可
         * 直接朋友：出现在成员变量，方法参数，返回值的是直接朋友
         * 不是直接朋友的是：出现在局部变量的成员
         * 这样增大了类与类之间的耦合度
         * 所以迪米特法则是减少类与类之间耦合度的原则
         * 解决方法：
         * 将局部变量的代码放到依赖类里面
         */
    }
}
