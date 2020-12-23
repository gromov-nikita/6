/*
Exercise 19: (2) Create a class containing an inner class that itself contains an inner
class. Repeat this using nested classes. Note the names of the .class files produced by the
compiler.
*/
public class Runner implements InClass {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.print2();
        MyClass.method(10);
    }
}
interface InClass{
    public static void print(int i){
        System.out.println(i);
    }
    class MyClass{
        public static void method(int i){
            print(i);
            System.out.println("____________");
        }
        public void print2(){
            System.out.println("MyClass");
        }
    }

}

