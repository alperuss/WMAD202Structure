package ca.ciccc.wmad202.nestedClasses.shadowing;

public class ShadowTest {
    public int x = 0;

    public class FirstLevel {
        public int x = 1;

        public void methodInFirstLevel(int x) {
            System.out.println("x= " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x= " + ShadowTest.this.x);
//        public static void main(String... args) {
//            ShadowTest st = new ShadowTest();
//            ShadowTest.FirstLevel fl = st.new FirstLevel();
//            fl.methodInFirstLevel(23);
//        }
        }
    }
}
