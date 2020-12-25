
public class Outer2 {
    class Inner2 extends Outer1.Inner1 {
        public Inner2(int n) {
            super(n);
        }
    }

    public static void main(String[] args) {
        Outer2 objOuter = new Outer2();
        Inner2 objInner2 = objOuter.new Inner2(1000);
        System.out.println(objInner2.getAmount());
    }
}
