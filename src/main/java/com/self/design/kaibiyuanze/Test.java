package com.self.design.kaibiyuanze;

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
        new DrawTest().run(new Car());
        new DrawTest().run(new Air());
    }
}

class DrawTest{
    public void run(Draw draw){
        draw.draw();
    }
}

abstract class Draw{
    public abstract void draw();
}

class Car extends Draw {

    @Override
    public void draw() {
        System.out.println("draw car");
    }
}

class Air extends Draw{

    @Override
    public void draw() {
        System.out.println("draw air");
    }
}
