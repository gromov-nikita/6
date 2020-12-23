/*
Exercise 4: (2) Add a method to the class Sequence.SequenceSelector that produces
the reference to the outer class Sequence.
*/
public class Sequence {
    private int amount;
    public class SequenceSelector {
        public Sequence getRef() {
            return Sequence.this;
        }
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void print() {
        System.out.println(amount);
    }
    public SequenceSelector getObj() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Sequence outObj = new Sequence();
        outObj.setAmount(10);
        SequenceSelector innerObj = outObj.new SequenceSelector();
        System.out.println(innerObj.getRef().getAmount());
        innerObj.getRef().print();
    }
}
