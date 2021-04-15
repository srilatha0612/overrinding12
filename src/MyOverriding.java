public class MyOverriding {
    public void m1(){
        System.out.println("first");
    }
}
class Ov{
    public void m1(){
        System.out.println("second");
    }

    public static void main(String[] args) {
        MyOverriding o=new MyOverriding();
        o.m1();
    }
}
