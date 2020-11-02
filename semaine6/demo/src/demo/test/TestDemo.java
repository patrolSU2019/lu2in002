package demo.test;

import demo.Demo;

public class TestDemo {
    public static void main(String[] args){
        Demo d = new Demo(3, 5);
        System.out.println(d.toString());
        System.out.println(d.getX() + d.getY());
    }
}
