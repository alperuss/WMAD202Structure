package ca.ciccc.wmad202.assignment8.question1;

public class Foo1 {
    private int bar1;

    public Foo1(int x) {
        bar1 = x;
    }

    class Foo2 extends Foo1 {

        public Foo2(int x) {
            super(x * 10);
        }


        public void show() {
            System.out.println("bar1 = " + bar1);
            System.out.println("((Foo1)this).bar1 = " + ((Foo1) this).bar1);
            System.out.println("Foo1.this.bar1 = " + Foo1.this.bar1);
        }
    }

    public class Test64 {
        public static void run() {
            Foo1 f1 = new Foo1(5);
            Foo1.Foo2 f2 = f1.new Foo2(6);
            f2.show();
        }

//        Output :
//        bar1 = 5
//        ((Foo1)this).bar1 = 60
//        Foo1.this.bar1 = 5

    }
}

