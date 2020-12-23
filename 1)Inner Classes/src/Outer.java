/*
Exercise 1: (1) Write a class named Outer that contains an inner class named Inner.
Add a method to Outer that returns an object of type Inner. In main( ), create and
initialize a reference to an Inner.
*/
public class Outer {
    private class Inner{
    }
    public Inner getInnerObj(){
        return new Inner();
    }
    public static void main(String[] args) {
        Outer obj = new Outer();
        Inner q = obj.getInnerObj();
    }
}
