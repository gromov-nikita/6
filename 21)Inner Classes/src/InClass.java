public interface InClass{
    static void print(int i){
        System.out.println(i);
        MyClass obj = new MyClass();
        obj.print2();
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
