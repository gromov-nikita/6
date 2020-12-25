/*
Exercise 26: (2) Create a class with an inner class that has a non-default constructor
(one that takes arguments). Create a second class with an inner class that inherits from the
first inner class.
 */
public class Outer1 {
    public static class Inner1{
        private int amount;
        public Inner1(int n) {
            amount = n;
        }
        public int getAmount() {
            return amount;
        }
        public void setAmount(int amount) {
            this.amount = amount;
        }
    }
    public void print(){
        System.out.println("Outer1");
    }

}


