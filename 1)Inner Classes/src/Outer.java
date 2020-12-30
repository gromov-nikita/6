/*
Exercise 1: (1) Write a class named Outer that contains an inner class named Inner.
Add a method to Outer that returns an object of type Inner. In main( ), create and
initialize a reference to an Inner.
*/
import com.gromovlearn.*;
public class Outer {
    private class Inner{
    }
    public Inner getInnerObj(){
        return new Inner();
    }
    public static void main(String[] args) {
        Outer2 obj = new Outer2();
        Outer2.Inner2 q = obj.getInnerObj();

    }
}
