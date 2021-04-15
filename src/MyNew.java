public class MyNew {
    public void m1(){
        System.out.println("first");
    }
}
class Test{
    public void m1(){
        System.out.println("second");
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.m1();
    }
}