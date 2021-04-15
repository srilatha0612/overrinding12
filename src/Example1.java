public class Example1 {
    final void m1(){
        System.out.println("first");
    }
}
class Example2 {
    public void m1() {
        System.out.println("second");
    }

    public static void main(String[] args) {

        Example1 e = new Example1();
        e.m1();
    }
}

