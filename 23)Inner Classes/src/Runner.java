/*
Exercise 23: (4) Create an interface U with three methods. Create a class A with a
method that produces a reference to a U by building an anonymous inner class. Create a
second class B that contains an array of U. B should have one method that accepts and stores
a reference to a U in the array, a second method that sets a reference in the array (specified
by the method argument) to null, and a third method that moves through the array and calls
the methods in U. In main( ), create a group of A objects and a single B. Fill the B with U
references produced by the A objects. Use the B to call back into all the A objects. Remove
some of the U references from the B.
 */
public class Runner {
    public static void main(String[] args) {
        A objA1 = new A();
        A objA2 = new A();
        A objA3 = new A();
        B objB1 = new B(2);
        objB1.add(objA1.getRef());
        objB1.add(objA2.getRef());
        objB1.add(objA2.getRef());
        objB1.use();
        objB1.del(1);
        objB1.use();
    }
}

class A{
    public U getRef(){
        return new U(){
            @Override
            public void print1(){
                System.out.println(1);
            }
            @Override
            public void print2(){
                System.out.println(2);
            }
            @Override
            public void print3(){
                System.out.println(3);
            }
        };
    }
}
class B{
    private U[] array;
    private int size;
    public B(int n){
        array = new U[n];
        size = 0;
    }
    public B(){
        array = new U[10];
        size = 0;
    }
    public void add(U ref){
        try{
            array[size] = ref;
            size++;
        }
        catch(ArrayIndexOutOfBoundsException t){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
    public void del(int n){
        for(int i = n; i < size-1; i++){
            array[i] = array[i+1];
        }
        size--;
        array[size] = null;
    }
    public void use(){
        for(int i = 0; i < size; i++){
            System.out.println("array[" + i + "]");
            array[i].print1();
            array[i].print2();
            array[i].print3();
        }
    }
}
interface U{
    void print1();

    void print2();

    void print3();
}
