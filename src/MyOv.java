public class MyOv
{
    public void m1(){
        System.out.println("first");
    }
}
class Mytes extends MyOv {
    public void m1() {
        System.out.println("sceond");
    }

    public static void main(String[] args) {
         Mytes m=new Mytes();
         m.m1();
    }
}