package com.gromovlearn;
public class Runner2 implements InClass {
    public static void main(String[] args) {
        InClass.MyClass obj = new InClass.MyClass();
        obj.print2();
        InClass.MyClass.method(10);
    }
}
