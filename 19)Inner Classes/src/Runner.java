/*
Exercise 19: (2) Create a class containing an inner class that itself contains an inner
class. Repeat this using nested classes. Note the names of the .class files produced by the
compiler.

Exercise 18: (1) Create a class containing a nested class. In main( ), create an instance
of the nested class.
*/
public class Runner {
    class Inner1{
        class Inner2{
            public void print(){
                System.out.println("///////////////////");
            }
        }
    }

    public static void main(String[] args) {
        Runner objR = new Runner();
        Runner.Inner1 objI1 = objR.new Inner1();
        Runner.Inner1.Inner2 objI2 = objI1.new Inner2();
        objI2.print();
    }
}


