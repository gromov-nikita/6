/*
Exercise 21: (2) Create an interface that contains a nested class that has a static method
that calls the methods of your interface and displays the results. Implement your interface
and pass an instance of your implementation to the method.

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